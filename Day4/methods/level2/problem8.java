import java.util.Scanner;

public class problem8 {
    // Method to find the youngest friend using Math.min()
    public static int calculateYoungest(int[] ages) {
        int minAge = Math.min(ages[0], Math.min(ages[1], ages[2])); // Find minimum age
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == minAge) {
                return i; // Return index of the youngest
            }
        }
        return -1; // Should never happen
    }

    // Method to find the tallest friend using Math.max()
    public static int calculateTallest(int[] heights) {
        int maxHeight = Math.max(heights[0], Math.max(heights[1], heights[2])); // Find maximum height
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] == maxHeight) {
                return i; // Return index of the tallest
            }
        }
        return -1; // Should never happen
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking input for ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
        }

        // Taking input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = input.nextInt();
        }

        // Finding the youngest and tallest friend
        int youngestIndex = calculateYoungest(ages);
        int tallestIndex = calculateTallest(heights);

        // Displaying results
        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}