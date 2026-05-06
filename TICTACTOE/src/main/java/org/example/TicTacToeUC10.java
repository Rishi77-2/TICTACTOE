public class TicTacToeUC10 {

    // Simulating a full board to test the draw condition
    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    public static void main(String[] args) {
        // Entry point of the program. Tests draw detection logic.

        System.out.println("Checking a full board...");
        System.out.println("Is the game a draw? " + isDraw()); // Expected: true

        // Let's open up a cell to test the false condition
        System.out.println("\nOpening cell at (2,2)...");
        board[2][2] = '-';

        System.out.println("Is the game a draw now? " + isDraw()); // Expected: false
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output: true if draw, false otherwise.
     */
    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                // If we find even one empty cell, the game is not a draw
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        // If the loops finish without finding an empty cell, it's a draw
        return true;
    }
}