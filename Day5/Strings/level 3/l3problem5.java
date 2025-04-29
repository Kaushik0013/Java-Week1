import java.util.Scanner;

public class l3problem5 {
    public static char[] uniqueCharacters(String str) {
        char[] unique = new char[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (str.charAt(i) == unique[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count] = str.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];
        System.arraycopy(unique, 0, result, 0, count);
        return result;
    }

    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayFrequency(String[][] result) {
        System.out.println("Character Frequency");
        System.out.println("-------------------");
        for (String[] row : result) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[][] frequency = findFrequency(str);
        displayFrequency(frequency);

        input.close();
    }
}
