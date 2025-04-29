import java.util.Scanner;
class problem3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int []table = new int[10];

        for(int i=0; i<table.length;i++){
            table[i]=num*(i+1);
        }

        for(int i =0; i<table.length;i++){
            System.out.println(num+"*"+(i+1)+"="+table[i]);
        }
        input.close();
    }
}
