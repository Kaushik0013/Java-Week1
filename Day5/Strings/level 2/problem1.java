import java.util.Scanner;

public class problem1 {
    public static int getLength(String str){
        int count =0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
            
        }
        return count;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();

        int customLength = getLength(str);
        int builtInLength = str.length();

        System.out.println("String length using custom method:"+customLength);
        System.out.println("String length using built in method:"+builtInLength);

        input.close();


    }
}
