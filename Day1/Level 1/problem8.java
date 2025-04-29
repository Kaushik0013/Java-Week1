class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kilometers :");
        double km = input.nextDouble();
        double Miles = kilometers / 1.6;
        System.out.println("The total miles is " + Miles + "mile for the given" + kilometers + "km");
    }
}