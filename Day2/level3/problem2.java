import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();
       
            if ((year >= 1582)&&(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        

    }
}