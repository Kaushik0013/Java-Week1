import java.util.Scanner;

public class problem1 {
    public static int[]findFactors(int num){
        int count = 0;
        for(int i =1; i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[]factors = new int[count];
        int index = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static int sumOfFactors(int[]factors){
        int sum=0;
        for(int factor:factors){
            sum+=factor;
        }
        return sum;
    }
    public static int productOfFactors(int[]factors){
        int product = 1;
        for(int factor:factors){
            product*=factor;
        }
        return product;
    }
    public static int sumOfSquaresOfFactors(int[]factors){
        int sum=0;
        for(int factor:factors){
            sum+=(int)Math.pow(factor, 2);
        }
        return sum;
    }

    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int num=input.nextInt();
        int[]factors = findFactors(num);
        System.out.print("Factors:");
        for(int factor:factors){
            System.out.print(factor+" ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        
        input.close();

    }
}

