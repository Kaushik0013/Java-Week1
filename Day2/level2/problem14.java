import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int power = input.nextInt();
		if(num>0){
			int result =1;
			int counter = 0;
			for(counter<power){
				result*=num;
				counter++;
			}
			System.out.println(result);
		}
	}
}

		