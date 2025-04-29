import java.util.Random;
import java.util.Scanner;

public class problem10 {
    
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60;
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int students = scores.length;
        double[][] stats = new double[students][3];
        
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = Math.round(avg * 100.0) / 100.0;
            
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = percentage;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student Scores:");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                               (int)stats[i][0] + "\t" + Math.round(stats[i][1]) + "\t" + stats[i][2] + "%\t" + grades[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int students = input.nextInt();
        
        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        
        displayScorecard(scores, stats, grades);
        
        input.close();
    }
}

