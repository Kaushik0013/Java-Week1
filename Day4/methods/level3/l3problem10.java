import java.util.Scanner;

public class l3problem10 {
    public static boolean findCollinear(double x1, double y1, double x2, double x3, double y3){
       if((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0){
        return (x1==x2 && x2==x3);
       }
        double slopeAB = (y2-y1)/(x2-x1);
        double slopeBC = (y3-y2)/(x3-x2);
        double slopeAC = (y3-y1)/(x3-x1);

        return (slopeAB == slopeBC) &&(slopeBC == slopeAC);
    }
    public static boolean findArea(double x1, double y1, double x2, double x3, double y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1:");
        double x1 = input.nextDouble();
        System.out.println("Enter y1:");
        double y1 = input.nextDouble();

        System.out.println("Enter x2:");
        double x2 = input.nextDouble();
        System.out.println("Enter y2:");
        double y2 = input.nextDouble();

        System.out.println("Enter x3:");
        double x3 = input.nextDouble();
        System.out.println("Enter y3:");
        double y3 = input.nextDouble();

        boolean collinearBySlope = findCollinear(x1, y1, x2, x3, y3);
        boolean collinearByArea = findArea(x1, y1, x2, x3, y3);

        if(collinearBySlope&&collinearByArea){
            System.out.println("given points are collinear");
        }
        else{
            System.out.println("given points arent collinear");
        }
        input.close();

    }
}
