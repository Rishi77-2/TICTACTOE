package org.example;

public class TicTacToeUC5 {

    // Simulating a board with some empty and taken cells for testing
    static char[][] board = {
            {'-', '-', '-'},
            {'-', 'x', '-'},
            {'-', '-', '-'}
    };

    public void main(String[] args) {
        // Entry point of the program. Tests the validation logic.
        System.out.println("Move at (1,1): " + isValidMove(1, 1)); // Expected false (taken by 'X')
        System.out.println("Move at (0,0): " + isValidMove(0, 0)); // Expected true (empty '-')
        System.out.println("Move at (3,3): " + isValidMove(3, 3)); // Expected false (out of bounds)
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     */
    static boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == '-') {
                return true;
            }
        }
        return false;
    }
}