public class problem4 {
    public static void generateException(){
        String str = null;
        System.out.println(str.length());
    }
    public static void handleException(){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Error: cannot generate length for a null value");
        }
    }
    public static void main(String[]args){
        System.out.println("Generating NullPointerException...");
        try{
            generateException();
        }
        catch(NullPointerException e){
            System.out.println("Exception caught in main:"+e.getMessage());
        }

        System.out.println("Generating HandlingException...");
        handleException();


    }
}



