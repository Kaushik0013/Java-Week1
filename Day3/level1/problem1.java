import java.util.Scanner;
class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[]ages = new int[10];
        for(int i=0; i<ages.length;i++){
            System.out.println("Enter student age"+(i+1)+":");
            ages[i]=input.nextInt();
        }
        for(int age:ages){
            if(age<0){
                System.out.println("Invalid age");
            }
            else if(age>=18){
                System.out.println("Can vote");
            }
            else{
                System.out.println("Cannot vote");
            }
        }
        input.close();
       
    }
    
}
