import java.util.Scanner;

public class problem9 {
    public static String convertCharacter(String str){
        String result = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                result+=(char)(ch-32);
            }
            else{
                result+=ch;
            }
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2){
        return str1.equals(str2);
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine();

        String convertUpper = convertCharacter(str);
        String builtUpper = str.toUpperCase();

        System.out.println("Converted to uppercase using custom method: " + convertUpper);
        System.out.println("Converted to uppercase using built-in method: " + builtUpper);


        if(compareStrings(convertUpper, builtUpper)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        }

        input.close();


    }
}
