import java.util.Random;
import java.util.Scanner;
public class RockPaperScrissors
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Choose your move (r - Rock, p - Paper, s - Scrissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("Tied Game !");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("s")) {
                    System.out.println("Congratulations, You Won!");
                } else if (computerMove.equals("p")) {
                    System.out.println("Sorry, You Lost!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("Congratulations, You Won!");
                } else if (computerMove.equals("s")) {
                    System.out.println("Sorry, You Lost!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("Congratulations, You Won!");
                } else if (computerMove.equals("r")) {
                    System.out.println("Sorry, You Lost!");
                }
            }

            System.out.println("Do you want to play again ? (y - Yes / n - No)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y"))
            {
                break;
            }

        }
    }
}
