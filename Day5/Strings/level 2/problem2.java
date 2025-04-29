import java.util.Scanner;

public class problem2 {
    public static int getSeparate(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
            return count;
        }
        
    }
    public static String[] customSplit(String str){
        int length = getSeparate(str);
        int spaceCount = 0;

        for(int i=0; i<length;i++){
            if(str.charAt(i)==' '){
                spaceCount++;
            }
        }

        String[]words = new String[spaceCount + 1];
        int wordsStart = 0, wordIndex = 0;

        for(int i=0; i<length;i++){
            if(str.charAt(i)==' '){
                words[wordIndex] = str.substring(wordsStart, i);
                wordsStart=i+1;
                wordIndex++;
            }

        }
        words[wordIndex]=str.substring(wordIndex);

        return words;
    }

    public static boolean compareArrays(String[]arr1, String[]arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int manualLength = customSplit(str);
        System.out.println("Length of the string (manual method): " + manualLength);
        System.out.println("Length of the string (built-in method): " + str.length());

        String[] manualWords = customSplit(str);
        String[]builtInWords = str.split("\\s+");

        boolean areEqual = compareArrays(manualWords, builtInWords);
        System.out.println("Manual split words: " + String.join(", ", manualWords));
        System.out.println("Built-in split words: " + String.join(", ", builtInWords));
        
        if (areEqual) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The results are different.");
        }
        input.close();
    }
}
