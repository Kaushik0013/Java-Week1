import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		int fact = 1;
		int i = num;
		if(num>0){
			 
			for(i =1;i<=num;i++){
				fact*=i;
			}
			
		}
		System.out.println(fact);
	}
}
