package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        // instanz a new string array thats the same length of the board length
        String[] column = new String[board.length];
       //for loop interating though the board
        for (int row = 0; row < board.length; row++) {
           // set column = to the board
            column[row] = board[row][value];

        }
        // return the column
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
       // we want to get to see if the values in the roq are the same kind
        String[] row = getRow(rowIndex);
        return allValuesTheSame(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
       // same as before but this time we want to get the columns
        String[] row = getColumn(columnIndex);
        return allValuesTheSame(row);
    }

    public String getWinner() {
        // i have to check the row
        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];

            }
        }
        // check the column
        for (int i = 0; i < board.length; i++) {
           //if statement - is the column
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }
        //from the left to the right
        String[] diagonal = getDiagonal();
        if (allValuesTheSame(diagonal)) {
            return diagonal[0];

        }
        // from the right to the left
        String[] otherDiagonal = getOtherDiagonal();
        if (allValuesTheSame(otherDiagonal)) {
            return otherDiagonal[0];
        }
        return null;
    }

    private boolean allValuesTheSame(String[] row) {
        // iterate thought the row
        for (int i = 0; i < row.length; i++) {
            // if statement
            if (!row[i].equals(row[0])) {
                return false;
            }
        }
        return true;
    }
        public String[] getDiagonal () {
            String[] diagonal = new String[board.length];
            for (int i = 0; i < board.length; i++) {
                diagonal[i] = board[i][i];
            }
            return diagonal;
        }

        public String[] getOtherDiagonal () {
            String[] diagonal = new String[board.length];
            for (int i = 0; i < board.length; i++) {
                int row = board.length - 1 - i;
                diagonal[i] = board[row][i];
            }
            return diagonal;
        }

        public String[][] getBoard () {
            return board;
        }
    }

