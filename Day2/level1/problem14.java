import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		int fact = 1;
		if(num>0){
			while(num>0){
				fact*=num;
				num--;
			}
			System.out.println(fact);
		}
	}
}
