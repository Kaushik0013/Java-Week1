import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();

        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();


        double distanceFromToVia = sc.nextDouble();
        double distanceViaToFinalCity = sc.nextDouble();


        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalHours = hour1 + hour2;
        int totalMins = minute1 + minute2;

        totalHours += totalHours / 60;
        totalMins = totalMins % 60;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalHours + " hours " + totalMins + " minutes");

    }
}