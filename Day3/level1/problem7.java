import java.util.Scanner;
import java.util.Arrays;
class problem7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number<=0){
            System.out.println("error");
            input.close();
        }
        int []even = new int[number/2+1];
        int []odd = new int[number/2+1];
        int evenIndex =0;
        int oddIndex=0;
        for(int i=1;i<=number;i++){
            if(number%2==0){
                even[evenIndex++]=i;
            }
            else{
                odd[oddIndex++]=i;
            }
        }
        System.out.println("Even numbers: " + Arrays.toString(Arrays.copyOf(even, evenIndex)));
        System.out.println("Odd numbers: " + Arrays.toString(Arrays.copyOf(odd, oddIndex)));



    }
    
}
