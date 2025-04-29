import java.util.Scanner;
import static java.lang.System.out;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		int count=0;
		if(num==0){
			count=1;
		}
		else{
			while(num!=0){
				num=num/10;
				count++;
			}
		}
		out.println(count);
	}
}