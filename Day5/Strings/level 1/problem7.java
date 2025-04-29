import java.util.Scanner;

public class problem7 {
    public static void generateException(String text){
        System.out.println(Integer.parseInt(text));
    }
    public static void handlingException(String text){
        try{
            generateException(text);
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String text = input.next();

        System.out.println("Generating exception....");
        try{
            generateException(text);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format:"+e.getMessage());
        }

        System.out.println("Handling Exception...");
        handlingException(text);

        input.close();
    }
}
