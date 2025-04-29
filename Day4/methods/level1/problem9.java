import java.util.Scanner;

public class problem9 {
     public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
       
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }
        
        input.close();
    }
}
