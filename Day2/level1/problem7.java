import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int day = input.nextInt();
		if((month==3 && day>=20)|| (month==4)||(month==5)||(month==6 && day<=20)){
			System.out.println("Its a spring season");
		}
		else{
			System.out.println("Not a spring season");
		}
	}
}
			