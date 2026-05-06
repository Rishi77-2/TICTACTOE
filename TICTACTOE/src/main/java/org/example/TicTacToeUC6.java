public class TicTacToeUC6 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        // Entry point of the program. Places a sample move.
        placeMove(0, 0, 'X');
        System.out.println("Symbol at board[0][0]: " + board[0][0]); // Expected 'X'
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     * Hint: Assume the move is already validated.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}