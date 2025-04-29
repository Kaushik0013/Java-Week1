import java.util.Scanner;

public class l3problem7 {
    public static int getOtp(){
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean checkUniqueOtp(int[]otpArr){
        for(int i=0;i<otpArr.length;i++){
            for(int j=i+1;j<otpArr.length;j++){
                if(otpArr[i]==otpArr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[]otpArr= new int[10];
        for(int i=0; i<10;i++){
            otpArr[i]=getOtp();
            System.out.println("Otp Generated:"+otpArr[i]);

        }
        if(checkUniqueOtp(otpArr)){
            System.out.println("All otps are unique");
        }
        else{
            System.out.println("All otps are unique");
        }
    }
}
