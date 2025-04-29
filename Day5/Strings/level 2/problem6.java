import java.util.Scanner;

public class problem6 {
    public static String checkCharacterType(char ch){
      ch = Character.toLowerCase(ch);
      if(ch>='a' && ch<='z'){
        if(ch=='a'|| ch=='e'|| ch=='i' ||ch=='o'||ch=='u'){
            return "Vowel";
        }else{
            return "Consonent";
        }
      }
      return "Not a letter";
    }
    public static String[][]classifyingCharacters(String str){
        String[][]result = new String[str.length()][2];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            result[i][0]=String.valueOf(ch);
            result[i][1]=checkCharacterType(ch);
        }
        return result;
    }
    public static void displayClassfication(String[][]classfication){
        System.out.println("CharacterType\n");
        System.out.println("-------------");
        for(String[]entry:classfication){
            System.out.println(entry[0]+"\t\t"+entry[1]);
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();

        String[][]classfication = classifyingCharacters(str);

        displayClassfication(classfication);
        input.close();
    }
}
