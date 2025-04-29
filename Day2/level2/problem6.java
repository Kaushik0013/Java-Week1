import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amar's age and height);
		int amarAge = input.nextInt();
		int amarHeight = input.nextInt();
		
		System.out.println("Enter akbar's age and height);
		int akbarAge = input.nextInt();
		int akbarHeight = input.nextInt();
		
		System.out.println("Enter antony's age and height);
		int antonyAge = input.nextInt();
		int antonyHeight = input.nextInt();
		
		//to find the youngest
		
		if((amarAge<akbarAge)&& (amarAge<antonyAge)){
			System.out.println("Amar is the youngest);
		}
		else if((akbarAge<amarAge)&&(akbarAge<antonyAge)){
			System.out.println("Akbar is the youngest);
		}
		else if((antonyAge<amarAge)&&(antonyAge<akbarAge)){
			System.out.println("Antony is the youngest);
		}
		
		//to find the tallest
		if((amarHeight>akbarHeight)&&(amarHeight>antonyHeight)){
			System.out.println("Amar is the tallest);
		}
		else if((akabarHeight>amarHeight)&&(akabarHeight>antonyHeight)){
			System.out.println("Akbar is the tallest);
		}
		else if((antonyHeight>amarHeight)&&(antonyHeight>akbarHeight)){
			System.out.println("Antony is the tallest);
		}
	}
}
		