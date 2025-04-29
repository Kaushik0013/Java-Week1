import java.util.Random;
import java.util.Scanner;

public class problem8 {
    
       
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10;    
        }
        return ages;
    }

       
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

        
    public static void displayResults(String[][] results) {
        System.out.println("Age\tVoting Eligibility");
        System.out.println("------------------------");
        for (String[] entry : results) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = input.nextInt();

            
        int[] ages = generateAges(n);
        
            
        String[][] results = checkVotingEligibility(ages);
        
           
        displayResults(results);
        
        input.close();
    }
}
