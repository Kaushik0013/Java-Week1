import java.util.Scanner;

public class problem6 {
     public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        
        
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        input.close();
    }
}
