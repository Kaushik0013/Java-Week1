import java.util.Scanner;
class problem1{
    public static double calculateSimpleInterest(double principle, double rate, double time){
        return (principle*rate*time)/100.0;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter principle:");
        double principle = input.nextDouble();

        System.out.println("Enter rate");
        double rate = input.nextDouble();

        System.out.println("Enter time");
        double time = input.nextDouble();

        double simpleInterest = calculateSimpleInterest(principle, rate, time);
        System.out.println("The simple interest is:"+simpleInterest+"for principle"+principle+", Rate of interest"+rate+"% and time"+time+"years");
        input.close();

    }
}