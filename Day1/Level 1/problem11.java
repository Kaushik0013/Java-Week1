import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + "and" + num2 + "is" + addition + "," + subtraction + "," + multiplication + "," + division);
    }
}