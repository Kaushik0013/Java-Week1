import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        int sum = 0; 
        int originalNumber = number; 

   
        while (originalNumber != 0) {
            int digit = originalNumber % 10; //getting last digit
            sum += digit * digit * digit; 
            originalNumber /= 10;// getting quotient
        }


        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }
    }
}
