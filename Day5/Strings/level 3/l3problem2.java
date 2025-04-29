import java.util.Scanner;

public class l3problem2 {
    

    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] getUnique(String str) {
        int length = customLength(str);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

        
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

        
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

    
        char[] finalUniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueChars[i] = uniqueChars[i];
        }

        return finalUniqueChars;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
    
        int getLength = customLength(str);
        char[] uniqueCharacters = getUnique(str);

    
        System.out.println("The length is: " + getLength);
        System.out.print("Unique characters are: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        input.close();
    }
}
