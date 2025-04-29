import java.util.Scanner;
public class problem3 {
    public static int leapYearOrNot(int year){
        if(year>=1582){
            if(year%4==0 && year%100!=0 || year%400==0){
                return year;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = input.nextInt();
        int leapYear = leapYearOrNot(year);
        
        if(leapYear!=-1){
            System.out.println(leapYear+"is a leap year");
        }
        else{
            System.out.println(year+"is not a leap year");
        }
        input.close();
    }
}
