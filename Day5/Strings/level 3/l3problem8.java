import java.util.Scanner;

public class l3problem8 {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] charFrequency = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            charFrequency[text1.charAt(i)]++;
            charFrequency[text2.charAt(i)]--;
        }

        for (int count : charFrequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        boolean result = areAnagrams(text1, text2);

        System.out.println("Are the texts anagrams? " + result);

        scanner.close();
    }
}
