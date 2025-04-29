import java.util.Scanner;
class problem6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double []heights = new double[11];
        double sum=0.0;
        
        for(int i=0;i<heights.length;i++){
            System.out.println("Enter height"+(i+1)+":");
            heights[i]=input.nextDouble();
            sum=sum+heights[i];
            
            
        }
        double meanHeight = sum/heights.length;
        System.out.println(meanHeight);
       
        input.close();
    }
}
