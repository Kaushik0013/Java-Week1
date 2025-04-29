import java.util.Scanner;
import static java.lang.System.out;
class Main{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
	
		int physics=input.nextInt();
		int chemistry = input.nextInt();
		int maths = input.nextInt();
		
		int Average = (physics+chemistry+maths)/3;
		if(Average>=80){
			out.println("Grade A, Level 4, above agency-normalized standards");
		}
		else if(Average>=70 && Average<=79){
			out.println("Grade B, Level 3, at agency-normalized standards");
		}
		else if(Average>=60 && Average<=69){
			out.println("Grade C, Level 2, below,but approaching agency-normalized standards");
		}
		else if(Average>=50 && Average<=59){
			out.println("Grade D, Level 1, well below agency-normalized standards");
		}
		else if(Average >=40 && Average<=49){
			out.println("Grade E, Level 1-, too below agency-normalized standards");
		}
		else {
			out.println("Grade R, Remedial standards");
		}
	}
}
		