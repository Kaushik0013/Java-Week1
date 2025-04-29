import java.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(num<=0){
			System.out.println("Enter a valid natural number");
		}
		else{
			int sum=0;
			int i=1;
			while(i<=num){
				sum+=i;
				i++;
			}
		}
		int sumFormula = num*(num+1)/2;
		System.out.println("Sum using while loop"+sum);
		System.out.println("Sum using formula"+sumFormula);
		 
		if(sum==sumFormula){
			System.out.println("Both are same");
		}
		else{
			System.out.println("Both are not same");
		}
		
	}
}