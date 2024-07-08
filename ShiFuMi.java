import java.util.Random;
import java.util.Scanner;

public class ShiFuMi {
    public static void main(String[] args) {
        int player1Score = 0;
        int player2Score = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (Math.abs(player1Score - player2Score) <= 1) {
                String[] arr = {"\uD83D\uDDFF", "\uD83D\uDCDC", "✂️"};
                Random random = new Random();

                // Get user input
                System.out.println("Enter your choice (rock, paper, scissors): ");
                String gameChoice = scanner.nextLine().toLowerCase();

                String player1 = switch (gameChoice) {
                    case "rock" -> "\uD83D\uDDFF";
                    case "paper" -> "\uD83D\uDCDC";
                    case "scissors" -> "✂️";
                    default -> {
                        System.out.println("Invalid choice, try again.");
                        yield "";
                    }
                };

                String player2 = arr[random.nextInt(arr.length)];

                String result = shifumi(player1, player2);
                System.out.println("Player: " + player1 + " - Computer: " + player2);
                System.out.println(result);

                if (result.equals("Player wins")) {
                    player1Score++;
                } else if (result.equals("Computer wins")) {
                    player2Score++;
                }

                System.out.println("Score: Player - " + player1Score + " : Computer - " + player2Score);
            }
        }

        System.out.println("Final Score: Player - " + player1Score + " : Computer - " + player2Score);
        if(player1Score > player2Score){
            System.out.println("You won the game");
        } else {
            System.out.println("Computer wins the game, you lost.");
        }
    }

    public static String shifumi(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Tie";
        }
        switch (player1) {
            case "\uD83D\uDDFF" -> {
                if (player2.equals("✂️")) {
                    return "Player wins";
                }
                return "Computer wins";
            }
            case "\uD83D\uDCDC" -> {
                if (player2.equals("\uD83D\uDDFF")) {
                    return "Player wins";
                }
                return "Computer wins";
            }
            case "✂️" -> {
                if (player2.equals("\uD83D\uDCDC")) {
                    return "Player wins";
                }
                return "Computer wins";
            }
        }
        return "Invalid input";
    }
}
