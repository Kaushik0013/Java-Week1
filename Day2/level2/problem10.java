import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		int num = input.nextInt();
		int greatestFactor = 1;
		int counter =num-1;
		while(counter>=1){
				if(num%i==0){
					greatestFactor=i;
					break;
				}
			counter--;
		}
		System.out.println(greatestFactor);
	}
}