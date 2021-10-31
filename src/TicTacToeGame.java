import java.util.Scanner;
import java.util.Random;

class TicTacToeGame
{
    static final char var = chooseuserLetter();                    //intialising var with letter choosen by user
    static char board[]= new char[10] ;                         //creating char array of board
    static char computerLetter = (var == 'X') ? 'O' : 'X';      //intializing which chareceter computer should use

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            board[i] = ' ';                     //creating empty array
        }
        Random ran = new Random();
        int l =ran.nextInt(2);                      //taking random variable to decide who will play first
        if (l==0)
        {
            for (int i = 0; i <= 9; i++) {               // when user play first
                showboard(board);
                Scanner sc = new Scanner(System.in);
                int k = sc.nextInt();
                if (board[i] == ' ')
                {
                    board[k] = var;
                    board[computerChoice()] = computerLetter;
                    showboard(board);
                }
                else
                {
                    System.out.println("Enter another  Position");
                }
            }
        }
        else
        {
            for (int i = 0; i <= 9; i++) {                  //when computer play first
                showboard(board);
                Scanner sc = new Scanner(System.in);
                board[computerChoice()] = computerLetter;
                showboard(board);
                int k = sc.nextInt();
                if (board[i] == ' ')
                {
                    board[k] = var;
                    showboard(board);
                }
                else
                {
                    System.out.println("Enter another  Position");
                }
            }
        }
    }

    /*
     * Creating chooseuserLetter() method to choose which symbol user method
     * */

    public static char chooseuserLetter(){
        char user;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Symbol");
        user = sc.next().charAt(0);

        return (user);
    }
    /*
     * Creating computerChoice() method to get which position would computer want move
     * */

    public static int computerChoice(){
        int k=1;
        Random ran = new Random();
        int i = ran.nextInt(9)+1;
        if (board[i] == ' ') {
            board[i] = computerLetter;
        }
        else
        {
            i = ran.nextInt(9) + 1;

            if (board[i] == ' ')
            {
                board[i] = computerLetter;
            }
            else
            {
                i = ran.nextInt(9) + 1;
                board[i] = computerLetter;
            }
        }
        k++;
        return i;
    }

    /*
     * Creating showBoard() method to show TicTacToe board after every move
     * */

    public static void showboard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
}