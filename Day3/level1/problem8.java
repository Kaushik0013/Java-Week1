import java.util.Scanner;
import java.util.Arrays;
class problem8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int maxFactor = 10;
        int []factors = new int[maxFactor];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(index==maxFactor){
                    maxFactor*=2;
                    factors = Arrays.copyOf(factors,maxFactor);
                }
                factors[index++]=i;
                
            }

        }
        System.out.println("Factors of " + number + ": " + Arrays.toString(Arrays.copyOf(factors, index)));
        
        input.close();
    }
    
}
