import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double distanceInYard = distanceInFeet / 3;
        double distanceInMile = distanceInYard / 1760;
        System.out.println("Your height in cm is " + distanceInFeet + "while in yard is " + distanceInYard + "and miles is " + distanceInMile);
    }
}