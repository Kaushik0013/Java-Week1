import java.util.Scanner;

public class problem4 {
    
   
    public static String[] customSplit(String text) {
        StringBuilder word = new StringBuilder();
        int spaceCount = 0;

        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int index = 0;

        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0); 
                }
            }
        }
        if (word.length() > 0) {
            words[index] = word.toString(); 
        }

        return words;
    }

   
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

  
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

   
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = minLength;

        for (String[] wordData : wordsWithLengths) {
            int length = Integer.parseInt(wordData[1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordData[0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordData[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = input.nextLine();

      
        String[] words = customSplit(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] wordData : wordsWithLengths) {
            System.out.println(wordData[0] + "\t" + wordData[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        input.close();
    }
}