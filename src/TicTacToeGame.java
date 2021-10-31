import java.util.Scanner;

public class TicTacToeGame {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        char[] board = new char[10];        //creating board array of length 10
        showBoard(board);
        char inputChoice = chooseLetter();      //storing symbol choosen by user to inputChoice variable
        for(int k=0;k<=9;k++) {
            int i = input.nextInt();
            board[i] = inputChoice;
            showBoard(board);
        }
    }
    /*
     * Creating showBoard() to show TicTacToe Game board to user
     * */

    public static void showBoard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " |" + board[9]);
        System.out.println("-----------");
    }

    /*
     * Creating chooseLetter() method to choose which symbol user method
     * */

    public static char chooseLetter() {
        System.out.println("\n" + "Enter your choice: X | O");
        char choice = input.next().charAt(0);
        return choice;                                      //chooseLetter method returning choice of user
    }
}