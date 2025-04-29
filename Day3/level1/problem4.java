import java.util.Scanner;
class problem4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[]numbers= new double[10];
        double total = 0.0;
        int index = 0;
        while(true){
            System.out.println("Enter a number");
            double num = input.nextDouble();
            if(num<=0){
                break;
            }
            numbers[index]=num;
            index++;
            if(index==10){
                break;
            }
        }
        System.out.println("numbers entered");
        for(int i=0; i<index;i++){
            System.out.print(numbers[i] + " ");
            total+=numbers[i];
        }
        System.out.println("Total sum" + total);
        input.close();
      

    }
}