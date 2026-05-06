import java.util.Random;

public class TicTacToeUC7 {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        // Entry point of the program. Triggers the computer move.
        computerMove();
        System.out.println("Computer has made a move. Check board state to verify.");
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random rand = new Random();
        int row, col;

        do {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        } while (!isValidMove(row, col));

        placeMove(row, col, computerSymbol);
    }

    // --- Helper methods required for UC7 to function ---
    static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}