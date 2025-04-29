package level2;
import java.util.Scanner;

class problem1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int employees = 10;
        double[]salaries = new double[employees];
        int[]yearsOfService = new int[employees];
        double[]bonuses = new double[employees];
        double[]newSalaries = new double[employees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for(int i=0; i<employees;i++){
            System.out.println("enter salary of employee"+(i+1)+":");
            double salary= input.nextDouble();

            System.out.println("Enter year of service of employees"+(i+1)+":");
            int years = input.nextInt();

            if(salary<=0 || years<0){
                System.out.println("invalid input");
                i--;
                continue;
            }
            salaries[i]= salary;
            yearsOfService[i]=years;

        }
        for(int i=0; i<employees;i++){
            double bonusPercentage = (yearsOfService[i]>5)?0.05:0.02;
            bonuses[i]=salaries[i]*bonusPercentage;
            newSalaries[i]=salaries[i]+bonuses[i];

            totalBonus+=bonuses[i];
            totalOldSalary+=salaries[i];
            totalNewSalary+=newSalaries[i];
            
        }
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < employees; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        input.close();



    }
}
