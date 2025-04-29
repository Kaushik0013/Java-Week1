import java.util.Random;
import java.util.Scanner;

public class l3problem12 {
    
;
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];;

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90);;
            scores[i][1] = 10 + random.nextInt(90);;
            scores[i][2] = 10 + random.nextInt(90); ;
        }
        return scores;
    }

;
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];;

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];;
            double average = (double) total / 3;
            double percentage = ((double) total / 300) * 100;;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

;
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                               (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
        }

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    ;
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

    ;
        int[][] scores = generateScores(numStudents);

    ;
        double[][] results = calculateResults(scores);

    ;
        displayScorecard(scores, results);

        scanner.close();
    }
}

