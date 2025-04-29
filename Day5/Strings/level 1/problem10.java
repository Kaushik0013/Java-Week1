import java.util.Scanner;
public class problem10 {
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

        String convertLower = convertCharacter(str);
        String builtLower = str.toLowerCase();

        System.out.println("Converted to Lowercase using custom method: " + convertLower);
        System.out.println("Converted to Lowercase using built-in method: " + builtLower);


        if(compareStrings(convertLower, builtLower)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        }

        input.close();


    }
}


