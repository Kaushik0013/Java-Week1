import java.util.Scanner;

public class problem7 {
    public static int[] findTrimIndices(String str){
        int start =0;
        int end = str.length()-1;

        while(start<=end && str.charAt(start)==' '){
            start++;
        }
        while(end>=start && str.charAt(end)==' '){
            end++;
        }
        return new int[]{start,end};
    }
    public static String customSubString(String str, int start, int end){
        StringBuilder trimmedStr = new StringBuilder();

        for(int i=start;i<=end;i++){
            trimmedStr.append(str.charAt(i));
        }
        return trimmedStr.toString();
    }
    public static boolean compareStrings(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string:");
    String str = input.nextLine();

    int[] indices = findTrimIndices(str);
        
    String trimmedCustom = customSubstring(str, indices[0], indices[1]);
    
    String trimmedBuiltIn = str.trim();
    
    boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
    
    System.out.println("Custom Trimmed String: [" + trimmedCustom + "]");
    System.out.println("Built-in Trimmed String: [" + trimmedBuiltIn + "]");
    System.out.println("Are both methods producing the same result? " + areEqual);
    
    input.close();

   } 
}
