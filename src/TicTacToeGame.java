
class TicTacToeGame {
    ////assign a Char 1D array as a static
    static char[] board = new char[10];

    /**
     *  method for creating empty Char array
     */
    void createBoard() {
        for (int i = 1; i < board.length; i++)
        {
            board[i]= ' ';
        }

    }

    public static void main(String[] args) {
        TicTacToeGame t = new TicTacToeGame();      //Creating Object of Class
        t.createBoard();                            //Calling creatBoard method
    }
}