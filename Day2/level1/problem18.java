import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num>0){
			for(int i=6; i<=9;i++){
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		}
	}
}