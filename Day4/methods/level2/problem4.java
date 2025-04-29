import java.util.Scanner;
public class problem4 {
    public static double kmToMiles(double km){
        double km2miles = 0.621371;
        return km*km2miles;
    }
    public static double milesToKm(double miles){
        double  miles2km = 1.60934;
        return miles*miles2km;
    }
    public static double metersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters*meters2feet;
    }
    public static double feetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet*feet2meters;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();
        double miles =input.nextDouble();
        double meters = input.nextDouble();
        double feet = input.nextDouble();

        System.out.println(km + " km = " + kmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + milesToKm(miles) + " km");
        System.out.println(meters + " meters = " + metersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + feetToMeters(feet) + " meters");
        input.close();
    }
}
