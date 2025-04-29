import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int power = input.nextInt();
		if(num>0){
			int result =1;
			for(int i=1;i<=power;i++){
				result*=num;
			}
			System.out.println(result);
		}
	}
}

		