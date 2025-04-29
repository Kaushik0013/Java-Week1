import java.util.Random;

public class l3problem11 {
    
    
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; 

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000); 
            employeeData[i][1] = 1 + random.nextInt(10); 
        }
        return employeeData;
    }

   
    public static double[][] calculateBonus(double[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] bonusData = new double[numEmployees][3]; 

        for (int i = 0; i < numEmployees; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            bonusData[i][0] = oldSalary;
            bonusData[i][1] = bonusAmount;
            bonusData[i][2] = newSalary;
        }
        return bonusData;
    }

    
    public static void displayResults(double[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s\n", 
                          "ID", "Old Salary", "Years of Service", "Bonus Amount", "New Salary", "Bonus %");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = bonusData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusAmount = bonusData[i][1];
            double newSalary = bonusData[i][2];
            double bonusPercentage = (yearsOfService > 5) ? 5 : 2;

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;

            System.out.printf("%-5d %-15.2f %-15.0f %-15.2f %-15.2f %-15.0f\n", 
                              (i + 1), oldSalary, yearsOfService, bonusAmount, newSalary, bonusPercentage);
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-15.2f %-15s %-15.2f %-15.2f %-15s\n", 
                          "Total", totalOldSalary, "-", totalBonus, totalNewSalary, "-");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;

     
        double[][] employeeData = generateEmployeeData(numEmployees);

      
        double[][] bonusData = calculateBonus(employeeData);

       
        displayResults(employeeData, bonusData);
    }
}

