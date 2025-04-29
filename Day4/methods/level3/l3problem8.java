import java.util.Scanner;
public class l3problem8 {
    private static final String[]months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0)||(year%400==0);
    }

    public static int getDaysInMonth(int month, int year){
        if(month==1 && isLeapYear(year)){
            return 29;
        }
        return daysInMonth[month];
    }
    public static int getFirstDayOfMonth(int month , int year){
        int y= year - (14 - month)/12;
        int x = y+y/4 - y/100 + y/400;
        int m = month + 12 *((14-month)/12)-2;
        return (1+x+(31*m)/12)%7;
    }
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + months[month] + "  " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    
        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("        ");
        }

        for(int day=1; day<=days;day++){
            System.out.printf("%3d",day);
            if((day+firstDay)%7==0){
                System.out.println();
            }
        }
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month:");
        int month = input.nextInt()-1;
        System.out.println("Enter year:");
        int year = input.nextInt();

        if(month<0 || month>11 || year<0){
            System.out.println("Invalid month or year. Please enter a valid input");
        }
        else{
            displayCalendar(month, year);
        }
       input.close();

    }
}
