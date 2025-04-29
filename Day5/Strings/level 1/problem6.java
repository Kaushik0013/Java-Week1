import java.util.Scanner;

public class problem6 {
    public static void generateException(String str){
        System.out.println(str.substring(50, 10));
    }
    public static void handlingException(String str){
        try{
            generateException(str);
        }
        catch(IllegalArgumentException e){
            System.out.println("Starting index cannot be greater than ending index-"+e.getMessage());
        }
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.next();

        System.out.println("Generating Exception...");
        try{
            generateException(str);
        }
        catch(IllegalArgumentException e){
            System.out.println("Starting index cannot be greater than ending index-"+e.getMessage());
        }

        System.out.println("Handling Exception...");
        handlingException(str);

    }
}
