import java.util.Scanner;

public class problem3 {
    public static char[] getCharacters(String inputString) {
        char[] result = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            result[i] = inputString.charAt(i);
        }
        return result;
    }

    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = input.next();
        
        
        char[] userDefinedChars = getCharacters(inputString);
        
        char[] builtInChars = inputString.toCharArray();
        
        
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
        
       
        System.out.println("Characters using user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters using toCharArray() method: " + new String(builtInChars));
        System.out.println("Are both character arrays equal? " + areEqual);
        
        input.close();


    }
}
