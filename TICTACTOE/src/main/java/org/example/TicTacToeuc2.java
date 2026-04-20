import java.util.Random;

public class TicTacToeuc2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        // Generates 0 or 1. 0 = Human starts, 1 = Computer starts.
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("Toss Result:");
        if (isHumanTurn) {
            System.out.println("Human won the toss and starts first!");
        } else {
            System.out.println("Computer won the toss and starts first!");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}