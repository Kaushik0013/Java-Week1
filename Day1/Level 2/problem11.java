import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter principle :");
        double principle = sc.nextDouble();
        System.out.println("Enter rate :");
        double rate = sc.nextDouble();
        System.out.println("Enter time :");
        double time = sc.nextDouble();
        double SimpleInterest = (principle * rate * time) / 100.0;
        System.out.println("Simple Interest is :" + SimpleInterest);
    }
}