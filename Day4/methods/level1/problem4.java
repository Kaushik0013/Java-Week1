import java.util.Scanner;

public class problem4 {
    

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; 
        double distanceToRun = 5000; 
        return (int) Math.ceil(distanceToRun / perimeter); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();
        

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
        
        scanner.close();
    }
}
