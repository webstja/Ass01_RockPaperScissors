import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String moveA;
            do {
                System.out.print("Player A, enter your move (R/P/S): ");
                moveA = scanner.nextLine().toLowerCase();
            } while (!moveA.equalsIgnoreCase("r") && !moveA.equalsIgnoreCase("p") && !moveA.equalsIgnoreCase("s"));


            String moveB;
            do {
                System.out.print("Player B, enter your move (R/P/S): ");
                moveB = scanner.nextLine().toLowerCase();
            } while (!moveB.equalsIgnoreCase("r") && !moveB.equalsIgnoreCase("p") && !moveB.equalsIgnoreCase("s"));


            String fmoveA = "";
            String fmoveB = "";

            if (moveA.equalsIgnoreCase("r")){
                fmoveA = "Rock";
            }else if (moveA.equalsIgnoreCase("s")){
                fmoveA = "Scissors";
            }else if (moveA.equalsIgnoreCase("p")){
                fmoveA = "Paper";
            }

            if (moveB.equalsIgnoreCase("r")){
                fmoveB = "Rock";
            }else if (moveB.equalsIgnoreCase("s")){
                fmoveB = "Scissors";
            }else if (moveB.equalsIgnoreCase("p")){
                fmoveB = "Paper";
            }

            String winner = "";

            if ((moveA.equals("r") && moveB.equals("s")) || (moveA.equals("p") && moveB.equals("r")) || (moveA.equals("s") && moveB.equals("p"))){
                winner = "Player A";
            }else{
                winner = "Player B";
            }

            String phrase = "";

            if ((moveA.equals("r") && moveB.equals("s")) || (moveA.equals("s") && moveB.equals("r"))) {
                phrase = "breaks";
            }else if ((moveA.equals("p") && moveB.equals("r")) || (moveA.equals("r")&& moveB.equals("p"))) {
                phrase = "covers";
            }else if ((moveA.equals("s") && moveB.equals("p")) || (moveA.equals("p") && moveB.equals("s"))) {
                phrase = "cuts";
            }


            System.out.println("Results:");
            if (moveA == moveB) {
                System.out.println(fmoveA + " vs " + fmoveB + " - It's a tie!");
            }else if (winner.equals("Player A")){
                System.out.println(fmoveA + " " + phrase + " " + fmoveB + ". Player A wins!");
            }else{
                System.out.println(fmoveB + " " + phrase + " " + fmoveA + ". Player B wins!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }


        }

        scanner.close();
    }
}
