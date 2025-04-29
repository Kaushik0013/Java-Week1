import java.util.Scanner;

public class l3problem5 {
    public static boolean checkPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        else{
            for(int i=2;i<=num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean checkNeonNumber(int num){
        int square =(int) Math.pow(num,2);
        int sum=0;
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        return sum==num;
    }
    public static boolean checkSpyNumber(int num){
        int product =1;
        int sum=0;
        while(num>0){
            sum+=num%10;
            product*=num%10;
            num/=10;
        }
        return sum==product;
    }
    public static boolean checkAutoMorphicNumber(int num){
        int square = (int)Math.pow(num,2);
        int temp =num;

        while(temp>0){
            if(square%10!=temp%10){
                return false;
            }
            square/=10;
            temp/=10;
        }
        return true;
       
    }
    public static boolean checkBuzzNumber(int num){
        return (num%7==0||num%10==7);
        }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        System.out.println("Is Prime Number? " + checkPrimeNumber(num));
        System.out.println("Is Neon Number? " + checkNeonNumber(num));
        System.out.println("Is Spy Number? " + checkSpyNumber(num));
        System.out.println("Is Automorphic Number? " + checkAutoMorphicNumber(num));
        System.out.println("Is Buzz Number? " + checkBuzzNumber(num));

        input.close();
    }
}


