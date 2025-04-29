import java.util.Scanner;

public class problem7 {
    public static boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        else{
            return age>=18;
        }
        
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[]studentAges = new int[10];
        for(int i=0;i<studentAges.length;i++){
            System.out.print("Enter age of student"+(i+1)+":");
            studentAges[i]=input.nextInt();
        }
        for(int i=0;i<studentAges.length;i++){
            System.out.println("Student"+(i+1)+"(Age:"+studentAges[i]+")can vote:" + canStudentVote(studentAges[i]));
        }
        input.close();


    }
}
