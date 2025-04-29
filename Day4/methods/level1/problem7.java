import java.util.Scanner;

public class problem7 {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        if (n > 0) {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        input.close();
    }
}

