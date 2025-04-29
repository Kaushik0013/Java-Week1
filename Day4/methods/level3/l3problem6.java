import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class l3problem6 {
     public static int[] findFactors(int num) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }
    

    public static int findGreatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2];
    }
    
  
    public static int sumOfFactors(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            sum += factor;
        }
        return sum;
    }
    

    public static long productOfFactors(int num) {
        long product = 1;
        for (int factor : findFactors(num)) {
            product *= factor;
        }
        return product;
    }
    

    public static long productOfCubesOfFactors(int num) {
        long product = 1;
        for (int factor : findFactors(num)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    
  
    public static boolean isPerfectNumber(int num) {
        return sumOfFactors(num) - num == num;
    }
    

    public static boolean isAbundantNumber(int num) {
        return sumOfFactors(num) - num > num;
    }
    

    public static boolean isDeficientNumber(int num) {
        return sumOfFactors(num) - num < num;
    }
    
    
    public static boolean isStrongNumber(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }
    
    
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        int num = 28; 
        
        System.out.println("Factors: ");
        for (int factor : findFactors(num)) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        System.out.println("Greatest Factor: " + findGreatestFactor(num));
        System.out.println("Sum of Factors: " + sumOfFactors(num));
        System.out.println("Product of Factors: " + productOfFactors(num));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(num));
        System.out.println("Is Perfect Number? " + isPerfectNumber(num));
        System.out.println("Is Abundant Number? " + isAbundantNumber(num));
        System.out.println("Is Deficient Number? " + isDeficientNumber(num));
        System.out.println("Is Strong Number? " + isStrongNumber(num));


    }
}
