import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if(num1<num2 && num1<num3){
			System.out.println(" Is the first number the smallest?"+"yes");
		}
		else{
			System.out.println(" Is the first number the smallest?"+"no");
		}
	}
}