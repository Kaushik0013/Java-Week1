import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Math.*;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		double height = input.nextDouble();
		height=height/100.0;
		double BMI = weight/Math.pow(height,2);
		String status = "";
		if(BMI<=18.4){
			status = "Underweight";
		}
		else if(BMI>=18.5 && BMI<=24.9){
			status ="Normal";
		}
		else if(BMI>25.0 && BMI<=39.9){
			status = "Overweight";
		}
		else if(BMI>=40.0){
			status = "Obese";
		}
		System.out.println(status);
	}
}