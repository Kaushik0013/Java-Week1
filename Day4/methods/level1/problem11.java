import java.util.Scanner;

public class problem11 {
      public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
   
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();
        
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = input.nextDouble();
        
    
        if (windSpeed <= 0) {
            System.out.println("Error: Wind speed must be greater than zero.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }
        
        input.close();
    }
}
