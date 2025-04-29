import java.util.Scanner;

public class l3problem4 {
    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
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
