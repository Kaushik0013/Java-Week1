import java.util.Scanner;

public class problem8 {
    public static void generateException(String []strArr, int index){
        System.out.println("Accessing index "+index+": "+strArr[index]);
    }
    public static void handlingException(String[]strArr, int index){
        try{
            generateException(strArr, index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("access index cannot be greater than the length of the array"+e.getMessage());
        }
    }
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter array Size:");
        int size = input.nextInt();
        String[]strArr = new String[size];

        for(int i=0; i< size; i++){
            strArr[i]=input.next();
        }

        System.out.println("Enter an index to access");
        int index = input.nextInt();

        System.out.println("Generating Exception...");
        try{
            generateException(strArr, index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("access index cannot be greater than the length of the array"+e.getMessage());
        }

        System.out.println("Handling Exception...");

        handlingException(strArr,index);

        input.close();


    }
}
