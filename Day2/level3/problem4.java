import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Invalid input! Prime number check is valid only for numbers greater than 1.");
        } else {
            boolean isPrime = true; 

            for (int i = 2; i < number; i++) {
                if (number % i == 0) { 
                    isPrime = false; 
                    break; 
                }
            }

           
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is Not a Prime Number.");
            }
        }

    }
}
