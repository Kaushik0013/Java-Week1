import java.util.Scanner;

public class problem8 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        
        // Finding smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
        
        input.close();
    }
}
