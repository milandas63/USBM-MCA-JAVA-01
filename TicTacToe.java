import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char currentPlayer = 'X';
        boolean isGameWon = false;
        
        while (true) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter row and column (e.g., 1 2): ");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            
            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;
                isGameWon = checkWin(board, currentPlayer, row, col);
                
                if (isGameWon) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                
                if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    break;
                }
                
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
    
    static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }
    
    static boolean checkWin(char[][] board, char player, int row, int col) {
        return (board[row][0] == player && board[row][1] == player && board[row][2] == player) || 
               (board[0][col] == player && board[1][col] == player && board[2][col] == player) || 
               (row == col && board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
               (row + col == 2 && board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
    
    static boolean isBoardFull(char[][] board) {
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
