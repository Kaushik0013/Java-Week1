import java.util.Arrays;
import java.util.Scanner;

public class l3problem4 {
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
    public static int[]reverseArray(int num){
        int[]digits = storeDigits(num);
        int left = 0; 
        int right = digits.length-1;
        while(left <right){
            int temp = digits[left];
            digits[left]= digits[right];
            digits[right]=temp;
            left++;
            right--;
        }
        return digits;
    }
    public static boolean checkArrays(int[]arr1, int[]arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
        }
    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int []arr1, int[]arr2) {
        int[] digits = storeDigits(num);
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Stored digits: " + Arrays.toString(storeDigits(number)));
        System.out.println("Reversed digits: " + Arrays.toString(reverseDigits(storeDigits(number))));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }
}
