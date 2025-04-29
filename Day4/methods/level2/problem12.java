import java.util.Arrays;

public class problem12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); 
        }
        return numbers;
    }

    
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max}; 
    }

    public static void main(String[] args) {
        int size = 5;
        int[] numbers = generate4DigitRandomArray(size); 
        double[] stats = findAverageMinMax(numbers); 

       
        System.out.println("Generated Numbers: " + Arrays.toString(numbers));
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum Value: " + stats[1]);
        System.out.println("Maximum Value: " + stats[2]);
    }
}
