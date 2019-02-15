public class Queen extends Piece {
    public Queen(int x, int y) {
        super(x, y);
    }

    public boolean isValid(Board board, int row, int col) {
        int i, j;

        for (i = 0; i < col; i++) {
            if (board.getBoard()[row][i] != null)
                return false;
        }
        
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.getBoard()[i][j] != null)
                return false;
        }

        for (i = row, j = col; j >= 0 && i < board.getBoard().length; i++, j--) {
            if (board.getBoard()[i][j] != null) 
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return " Q ";
    }
}