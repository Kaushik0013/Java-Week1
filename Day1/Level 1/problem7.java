import java.util.*;
class Main {
    public static void main(String[] args) {
        int radius = 6378;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double miles = volume * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is :" + volume + "and cubic miles is :" + miles);
    }
}

