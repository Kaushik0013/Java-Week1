import java.util.Scanner;
public class problem9 {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

   
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }


    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is Positive");
                if (isEven(numbers[i])) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is Negative.");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last number: ");
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        input.close();
    }
}
