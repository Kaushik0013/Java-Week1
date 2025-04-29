import java.util.Scanner;

public class l3problem6 {
    public static String[] findFrequency(String str) {
        char[] chars = str.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (frequency[i] > 0) {
                result[index++] = chars[i] + " : " + frequency[i];
            }
        }
        return result;
    }

    public static void displayFrequency(String[] result) {
        System.out.println("Character Frequency");
        System.out.println("-------------------");
        for (String entry : result) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] frequency = findFrequency(str);
        displayFrequency(frequency);

        input.close();
    }
}
