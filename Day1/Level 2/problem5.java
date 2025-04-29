import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fahrenheit = sc.nextInt();
        int celsiusResult = (fahrenheit - 32) * (5 / 9);
        System.out.println(" The" + fahrenheit + "fahrenheit is" + celsiusResult + "celsius);
        }
    }