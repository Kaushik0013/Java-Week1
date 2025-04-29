import java.util.Scanner;
public class problem2 {
    public static int calculateNoOfHandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = input.nextInt();
        if(n<2){
            System.out.println("Atleast 2 students are needed");
        }
        else{
            int maxHandshakes = calculateNoOfHandshakes(n);
            System.out.println("the max number of handshakes are:"+maxHandshakes);

        }
        
        input.close();
    }
    
}
