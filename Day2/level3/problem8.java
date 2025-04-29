import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		
		if(num<=0){
			System.out.println("Enter a valid number");
		}
		else{
			int temp=num;
			int sum=0;
			while(num!=0){
				sum=sum+num%10;
				num=num/10;
			}
			if(temp%sum==0){
				System.out.println("Harshad Number");
			}
			else{
				System.out.println("not a Harshad Number");
			}
			
		}
	}
}
					