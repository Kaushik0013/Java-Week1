import java.util.Scanner;

public class problem6 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.print("Enter weight in Pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter weight in Kilograms: ");
        double kilograms = input.nextDouble();
        System.out.print("Enter volume in Gallons: ");
        double gallons = input.nextDouble();
        System.out.print("Enter volume in Liters: ");
        double liters = input.nextDouble();

        System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, convertFahrenheitToCelsius(fahrenheit));
        System.out.printf("%.2f°C = %.2f°F\n", celsius, convertCelsiusToFahrenheit(celsius));
        System.out.printf("%.2f pounds = %.2f kilograms\n", pounds, convertPoundsToKilograms(pounds));
        System.out.printf("%.2f kilograms = %.2f pounds\n", kilograms, convertKilogramsToPounds(kilograms));
        System.out.printf("%.2f gallons = %.2f liters\n", gallons, convertGallonsToLiters(gallons));
        System.out.printf("%.2f liters = %.2f gallons\n", liters, convertLitersToGallons(liters));

        input.close();
    }
}


