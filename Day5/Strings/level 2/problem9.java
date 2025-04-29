import java.util.Random;
import java.util.Scanner;

public class problem9 {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userWinPercent = ((double) userWins / totalGames) * 100;
        double computerWinPercent = ((double) computerWins / totalGames) * 100;

        return new String[][] {
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"User Win %", String.format("%.2f", userWinPercent)},
            {"Computer Win %", String.format("%.2f", computerWinPercent)}
        };
    }

    public static void displayResults(String[][] results) {
        System.out.println("Result Statistics");
        System.out.println("-----------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of games to play:");
        int totalGames = input.nextInt();
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < totalGames; i++) {
            System.out.println("Enter your choice (Rock, Paper, Scissors):");
            String userChoice = input.next();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            
            String winner = determineWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
                System.out.println("You Win!");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Computer Wins!");
            } else {
                System.out.println("It's a Draw!");
            }
        }
        
        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(stats);
        
        input.close();
    }
}
