import java.util.Scanner;

public class TicTacToeuc3 {

    public static void main(String[] args) {
        // Entry point to verify the input handling
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Use Case 3 focuses on basic input reading.
     * @return The integer value entered by the user.
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");

        // Reading the integer input from the console
        int slot = sc.nextInt();

        return slot;
    }
}