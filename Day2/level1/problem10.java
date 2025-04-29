import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		double num = input.nextDouble();
		while(true){
			if(num!=0){
				total+=num;
				num = input.nextDouble();
			}
			else{
				break;
			}
		}
		System.out.println(total);
	}
}
			