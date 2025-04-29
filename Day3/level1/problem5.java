import java.util.Scanner;
class problem5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int []multiplicationResult =new int[4];
        for(int i=6;i<=9;i++){
            multiplicationResult[i-6]=num*i;
            System.out.println(num+"*"+i+"="+multiplicationResult[i-6]);
        }
        input.close();
    }

    
}
