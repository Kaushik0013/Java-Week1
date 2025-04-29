import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int sum=0;
		if(num<=0){
			System.out.println("Enter a valid number");
		}
		else{
			for(int i=1;i<num;i++){
				if(num%i==0){
					sum+=i;
				}
			}
			if(sum>num){
				System.out.println("Abundant Number");
			}
			else{
				System.out.println("Not an Abundant Number");
			}
		}
	}
}