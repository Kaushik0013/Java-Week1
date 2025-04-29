import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number==0){
			System.out.println("zero");
		}
		else if(number!=0){
			if(number%2==0){
				System.out.println("positive");
			}
			else{
				System.out.println("negative");
			}
		}
	}
	
}