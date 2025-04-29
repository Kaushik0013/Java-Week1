import java.util.Arrays;
import java.util.Scanner;

public class l3problem3 {
    public static int countDigits(int num){
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static int []storeDigits(int num){
        int size = countDigits(num);
        int[]digits=new int[size];
        for(int i= size -1;i>=0;i--){
            digits[i] =num%10;
            num/=10;

        }
        return digits;
    }
    public static int []sumOfDigits(int num){
        int []digits =storeDigits(num);
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=digits[i];
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int num){
        int []digits = storeDigits(num);
        int sumOfSquare = 0;
        for(int digit:digits){
            sumOfSquare+=Math.pow(digit, 2);
        }
        return sumOfSquare;
    }
    public static boolean checkHarshadNumber(int num){
        int sum = sumOfDigits(num);
        return num%sum==0;
    }
    public static int[][] digitFrequency(int num){
        int[] digits = storeDigits(num);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
         System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Stored digits: " + Arrays.toString(storeDigits(number)));
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }
}


