import java.util.Scanner;

public class l3problem9 {
    public static double getDistance(double x1, double y1, double x2,  double y2){
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
    public static double[] getEquation(double x1, double y1, double x2,  double y2 ){
        double[]result = new double[2];
        if(x1==x2){
            System.out.println("The points form a vertical line:x="+x1);
            return null;
        }
        double m = (y2-y1)/(x2-x1);
        double b= y1-m*x1;
        System.out.println("Equation of the Line: y = " + m + "x + " + b);
        return new double[]{m,b};
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1:");
        double x1 = input.nextDouble();

        System.out.println("Enter x2:");
        double x2 = input.nextDouble();

        System.out.println("Enter y1:");
        double y1 = input.nextDouble();

        System.out.println("Enter y2:");
        double y2 = input.nextDouble();

        double distance = getDistance(x1, x2, y1, y2);
        System.out.println("\nEuclidean Distance: " + distance);
        getEquation(x1, y1, x2, y2);
        input.close();
    }   
}
