package level2;

import java.util.Scanner;

public class problem9 {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
  
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
 
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Please enter valid marks (0-100). Try again.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }
        
   
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = (totalMarks / 3.0);
            
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
     
        System.out.println("\nStudent Report:");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%7d | %7d | %8d | %5d | %10.2f%% | %5c\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        
        input.close();
    }
}
