package level2;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
     
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        
      
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            
        
            bmi[i] = weight[i] / (height[i] * height[i]);
            
         
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        // Display results
        System.out.println("\nBMI Report:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %.2f | %s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
        
        input.close();
    }

}
