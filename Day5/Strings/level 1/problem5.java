public class problem5 {
    public static void generateException(){ 
        String text = "loremipsum";
        System.out.println(text.charAt(10));
    }
    public static void HandlingException(){
        String text = "loremipsum";
        try{
            generateException();
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("index out of range-"+e.getMessage());
        }
    }

    public static void main(String[]args){
        System.out.println("Generating exception...");
        try{
            generateException();
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("index out of range-"+e.getMessage());
        }

        System.out.println("Handling Exception...");
        HandlingException();


    }
}
