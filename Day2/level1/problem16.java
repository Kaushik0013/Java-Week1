import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num>0){
			for(int i=1; i<=num;i++){
				if(num%2==0){
					 System.out.println(i + " is an Even number");
				}
				else{
					 System.out.println(i + " is an Odd number");
				}
			}
		}
		else{
			System.out.println("not a natural number");
		}
	}
}