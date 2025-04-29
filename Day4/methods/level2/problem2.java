import java.util.Scanner;
public class problem2 {
    public static int sumUsingRecursion(int num){
        if(num==1){
            return 1;
        }
        return num+ sumUsingRecursion(num-1);
    }
    public static int sumOfNaturalNumbers(int num){
        return (num*(num+1))/2;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        if(num<=0){
            System.out.println("Not a natural number");
            return;
        }
        int sumRecursion = sumUsingRecursion(num);
        int sumFormula = sumOfNaturalNumbers(num);
        System.out.println("the sum using recursion is:"+ sumRecursion);
        System.out.println("The sum of n natural numbers is:"+ sumOfNaturalNumbers(num));

        if(sumRecursion==sumFormula){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Doesnt match");
        }
        input.close();

    }
}
