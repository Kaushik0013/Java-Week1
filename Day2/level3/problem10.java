import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		double first =input.nextDouble();
		double second= input.nextDouble();
		String op = input.nextLine();
		double result = 0.0;
		for(int i=0;i<1;i++){
			switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second != 0) { 
                        result = first / second;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return; 
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                    return; 
            }
        }
		System.out.println("Result: " + result);
	}
}