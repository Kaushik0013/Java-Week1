import java.util.Scanner;

public class problem2 {
   public static String createSubstring(String str, int start, int end){
      char[]result = new char[end - start];
      for(int i=0; i< end; i++){
         result[i-start]=str.charAt(i);
      }
      return new String(result);
   }
   public static boolean compareStrings(String str1, String str2){
      if(str.length()!= str2.length()){
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

    System.out.println("Enter String:");
    String str = input.next();

    System.out.println("Enter start index:");
    int strStart = input.nextInt();

    System.out.println("Enter end index:");
    int strEnd = input.nextInt();

    String substringCharAt = createSubstring(str, strStart, strEnd);
    String substringMethod = str.substring(strStart, strEnd);

    boolean areEqual = compareStrings(substringCharAt, substringMethod);
    System.out.println("Substring using charAt(): " + substringCharAt);
    System.out.println("Substring using substring() method: " + substringMethod);
    System.out.println("Are both substrings equal? " + areEqual);
    
    input.close();

    



   } 
}
