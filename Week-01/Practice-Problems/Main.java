import java.util.*;

public class Main {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        String[] playerMoves = new String[5];
        String[] computerMoves = new String[5];
        String[] results = new String[5];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Round " + (i + 1) + " - Enter Rock, Paper or Scissors: ");
            playerMoves[i] = sc.nextLine();

            computerMoves[i] = moves[random.nextInt(3)];

            results[i] = playRound(playerMoves[i], computerMoves[i]);

            if (results[i].equals("Player Wins"))
                wins++;
            else if (results[i].equals("Computer Wins"))
                losses++;
            else
                draws++;

            System.out.println("Computer: " + computerMoves[i]);
            System.out.println("Result: " + results[i]);
            System.out.println();
        }

        double winPercentage = (wins / 5.0) * 100;

        System.out.println("----------- FINAL SUMMARY -----------");
        System.out.println("Round\tPlayer\t\tComputer\tResult");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t" + playerMoves[i] +
                    "\t\t" + computerMoves[i] + "\t\t" + results[i]);
        }

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}