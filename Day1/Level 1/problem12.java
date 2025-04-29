import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner tri = new Scanner(System.in);
		int base = tri.nextInt();
		int height = tri.nextInt();
		
		float area = 0.5 * base * height;
		float inch = height / 2.54f;
		float foot = height / 30.48f; 
		float areaInch = area / 6.5416;
		
		System.out.println("Your Height in cm is " + height + " while in feet is " + String.format("%.2f",foot) + " and inches is " + String.format("%.2f",inch));
	}
}