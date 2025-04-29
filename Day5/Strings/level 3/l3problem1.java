import java.util.Scanner;

public class problem1 {
    public static String[][] getBMI(double[][]bmi){
        String[][]results = new String[bmi.length][4];

        for(int i=0; i<bmi.length;i++){
            double weight = bmi[i][0];
            double heightInMeters = data[i][1]/100;
            double bmi = weight/(heightInMeters*weight);

            String status;
            if(bmi<=18.4){
                status="Underweight";
            }
            else if(bmi>18.5 && bmi<=24.9){
                status = "Normal";
            }
            else if(bmi>25.0 && bmi<=39.9){
                status = "Overweight";
            }
            else if(bmi>=40.0){
                status = "Obese";
            }

            results[i][0]=String.format("%.2f",bmi[i][0]);
            results[i][1] = String.format("%.2f", data[i][1]);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
            
        }
        return results;
    }
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Calculation Results");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");
        
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[][]bmi =new int[10][2];
        for(int i=0; i<10;i++){
            System.out.println("Enter weight(kg) for person"+(i+1)+":" );
            bmi[i][0]=input.nextDouble();

            System.out.println("Enter height(cm) for person"+(i+1)+":");
            bmi[i][1]=  input.nextDouble();

            String[][] results = calculateBMI(data);
            displayResults(results);
            input.close();
        }
    }
}
