import java.util.Scanner;

public class problem1 {
    public static boolean checkEquals(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i = 0; i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        input.close();

        boolean charAtComparison = checkEquals(str1, str2);
        boolean equalsComparison = str1.equals(str2);

        System.out.println("Comparison using charAt method: " + charAtComparison);
        System.out.println("Comparison using equals method: " + equalsComparison);

        if(charAtComparison==equalsComparison){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same");
        }
    }
}
