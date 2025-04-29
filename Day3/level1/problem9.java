import java.util.Scanner;
import java.util.Arrays;
class problem9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][]matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Convert 2D array to 1D array
        int[] array = new int[rows * cols];
        int index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Display the 1D array
        System.out.println("1D Array: " + Arrays.toString(array));
        
        input.close();
    }
}
