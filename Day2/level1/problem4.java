import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner input =  new Scanner(System.in);
		int num = input.nextInt();
		double sum = 0.0;
		if(num>=0){
			sum=(num*(num+1))/2;
			System.out.println("The sum of the"+num+"natural numbers is"+sum);
		}
		else{
			System.out.println("The number "+num+"is not a natural number");
		}
	}
}
