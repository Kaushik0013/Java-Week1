import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int salary = input.nextInt();
		int yearOfService = input.nextInt();
		double bonus = 0.0;
		
		if(yearOfService>5){
			bonus = salary +0.05;
		}
		System.out.println(bonus);
	}
}