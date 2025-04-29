import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if(num1>num2){
			if(num1>num3){
				System.out.println("Is the first number the largest?"+"yes");
				System.out.println("Is the second number the largest?"+"no");
				System.out.println("Is the third number the largest?"+"no");
			}
			else if(num1<num3){
				System.out.println("Is the first number the largest?"+"no");
				System.out.println("Is the second number the largest?"+"no");
				System.out.println("Is the third number the largest?"+"yes");
			}
		}
		else {
            if (num2 > num3) {
                System.out.println("Is the first number the largest? no");
                System.out.println("Is the second number the largest? yes");
                System.out.println("Is the third number the largest? no");
            } 
			else {
                System.out.println("Is the first number the largest? no");
                System.out.println("Is the second number the largest? no");
                System.out.println("Is the third number the largest? yes");
            }
	
		}
	}
}
		
		
