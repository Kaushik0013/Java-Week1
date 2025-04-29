import java.util.Scanner;
import java.util.Arrays;

public class l3problem2 {

    
        public static int countDigits(int num) {
            int count = 0;
            while (num > 0) {
                num /= 10;
                count++;
            }
            return count;
        }
    
        public static int[] storeDigits(int num) {
            int size = countDigits(num); 
            int[] digits = new int[size];
    
            for (int i = size - 1; i >= 0; i--) { 
                digits[i] = num % 10;
                num /= 10;
            }
    
            return digits;
        }
    
        public static boolean isDuckNumber(int num) {
            int[] digits = storeDigits(num);
            for (int i = 1; i < digits.length; i++) { 
                if (digits[i] == 0) {
                    return true;
                }
            }
            return false;
        }
    
        public static boolean isArmstrongNumber(int num) {
            int[] digits = storeDigits(num);
            int power = digits.length;
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, power);
            }
            return sum == num;
        }
    
        public static int[] findLargestAndSecondLargest(int num) {
            int[] digits = storeDigits(num);
            int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
    
            for (int digit : digits) {
                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit > secondLargest && digit != largest) {
                    secondLargest = digit;
                }
            }
    
            return new int[]{largest, secondLargest};
        }
    
        public static int[] findSmallestAndSecondSmallest(int num) {
            int[] digits = storeDigits(num);
            int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
    
            for (int digit : digits) {
                if (digit < smallest) {
                    secondSmallest = smallest;
                    smallest = digit;
                } else if (digit < secondSmallest && digit != smallest) {
                    secondSmallest = digit;
                }
            }
    
            return new int[]{smallest, secondSmallest};
        }
    
        public static void main(String[] args) {
            int num = 153; 
            System.out.println("Number: " + num);
    
            System.out.println("Count of digits: " + countDigits(num));
    
            System.out.println("Digits array: " + Arrays.toString(storeDigits(num)));
    
            System.out.println("Is Duck Number: " + isDuckNumber(num));
    
            System.out.println("Is Armstrong Number: " + isArmstrongNumber(num));
    
      
            int[] largestNumbers = findLargestAndSecondLargest(num);
            System.out.println("Largest Digit: " + largestNumbers[0] + ", Second Largest: " + largestNumbers[1]);
    
            int[] smallestNumbers = findSmallestAndSecondSmallest(num);
            System.out.println("Smallest Digit: " + smallestNumbers[0] + ", Second Smallest: " + smallestNumbers[1]);
        }
}

    
