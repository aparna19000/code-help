import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameWon = false;

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        while (!gameWon && !boardFull()) {
            playerMove(scanner, currentPlayer);
            printBoard();
            gameWon = checkWin(currentPlayer);

            if (gameWon) {
                System.out.println("Player " + currentPlayer + " wins!");
            } else if (boardFull()) {
                System.out.println("It's a tie!");
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
            }
        }

        System.out.println("Game over!");
        scanner.close();
    }

    public static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    public static void playerMove(Scanner scanner, char currentPlayer) {
        int row, col;
        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid.");
            }
        }
    }

    public static boolean checkWin(char currentPlayer) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    public static boolean boardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
How it works:
The game board is represented by a 3x3 grid.
Players take turns entering their move by specifying a row and a column number (0-2).
The game checks if a player has won by forming a line of three marks horizontally, vertically, or diagonally.
If a player wins, the game announces the winner.
If the board is full and there is no winner, the game ends in a tie.
The game continues until either a player wins or the board is full. */
