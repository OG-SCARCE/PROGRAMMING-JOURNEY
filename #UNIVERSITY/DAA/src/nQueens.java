import java.util.*;

class nQueens {

    List<List<String>> result = new ArrayList<>();

    // Recursive calls count karne ke liye
    int calls = 0;

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // Board fill with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0, n);

        // Total recursive calls print
        System.out.println("Total Recursive Calls: " + calls);

        return result;
    }

    public void solve(char[][] board, int row, int n) {

        // Har function call pe increment
        calls++;

        // Agar sab rows complete ho gayi
        if (row == n) {

            // Final board valid hai ya nahi
            if (isValid(board, n)) {

                List<String> temp = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    temp.add(new String(board[i]));
                }

                result.add(temp);
            }

            return;
        }

        // Har column try karna padega
        for (int col = 0; col < n; col++) {

            // Queen placing
            board[row][col] = 'Q';

            // Next row
            solve(board, row + 1, n);

            // Backtrack
            board[row][col] = '.';
        }
    }

    // Pura board check karne ke liye
    public boolean isValid(char[][] board, int n) {

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                if (board[row][col] == 'Q') {

                    // Same column check
                    for (int i = 0; i < n; i++) {

                        if (i != row && board[i][col] == 'Q') {
                            return false;
                        }
                    }

                    // Same row check
                    for (int j = 0; j < n; j++) {

                        if (j != col && board[row][j] == 'Q') {
                            return false;
                        }
                    }

                    // Upper left diagonal
                    int i = row - 1;
                    int j = col - 1;

                    while (i >= 0 && j >= 0) {

                        if (board[i][j] == 'Q') {
                            return false;
                        }

                        i--;
                        j--;
                    }

                    // Upper right diagonal
                    i = row - 1;
                    j = col + 1;

                    while (i >= 0 && j < n) {

                        if (board[i][j] == 'Q') {
                            return false;
                        }

                        i--;
                        j++;
                    }

                    // Lower left diagonal
                    i = row + 1;
                    j = col - 1;

                    while (i < n && j >= 0) {

                        if (board[i][j] == 'Q') {
                            return false;
                        }

                        i++;
                        j--;
                    }

                    // Lower right diagonal
                    i = row + 1;
                    j = col + 1;

                    while (i < n && j < n) {

                        if (board[i][j] == 'Q') {
                            return false;
                        }

                        i++;
                        j++;
                    }
                }
            }
        }

        return true;
    }
}