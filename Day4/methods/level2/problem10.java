import java.util.Scanner;
class problem10 {
  
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; 
            data[i][2] = weight / (heightInMeters * heightInMeters); 
        }
    }

    
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] membersData = new double[10][3];

        
        for (int i = 0; i < membersData.length; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            membersData[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            membersData[i][1] = input.nextDouble();
        }

        
        calculateBMI(membersData);

       
        System.out.println("\nBMI Analysis of Team Members:");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < membersData.length; i++) {
            double weight = membersData[i][0];
            double height = membersData[i][1];
            double bmi = membersData[i][2];
            String status = getBMIStatus(bmi);

            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weight, height, bmi, status);
        }

        input.close();
    }
}

