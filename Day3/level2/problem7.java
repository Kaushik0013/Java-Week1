package level2;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
     
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        

        for (int i = 0; i < numPersons; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (personData[i][1] <= 0);
            
       
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
           
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
     
        System.out.println("\nBMI Report:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %.2f | %s\n", (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        
        input.close();
    }
}
