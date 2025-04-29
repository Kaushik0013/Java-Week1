import java.util.Scanner;

class Problem3 {
    public static String[] customSplit(String str) {
        StringBuilder word = new StringBuilder();
        int spaceCount = 0; 

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word.append(str.charAt(i));
            } else {
                words[index++] = word.toString();
                word.setLength(0); 
            }
        }

        words[index] = word.toString(); 

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine();

        String[] words = customSplit(str);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] wordData : wordsWithLengths) {
            System.out.println(wordData[0] + "\t" + Integer.parseInt(wordData[1]));
        }

        input.close();
    }
}
