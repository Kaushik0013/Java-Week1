import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Celsius = sc.nextDouble();
        double farenheitResult = ((Celsius) * (9 / 5)) + 32;
        System.out.println("The"+Celsius+" celsius is"+ farenheitResult+" fahrenheit");    }
}