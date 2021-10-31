import java.util.Scanner;
import java.util.Random;

public class TicTacToeGame
{
    static final char var = chooseuserLetter();         //storing charecter store by user var variable
    static char board[]= new char[10] ;

    static char computerLetter = (var == 'X') ? 'O' : 'X';      //intializing which chareceter computer should use


    public static void main(String[] args){
        for (int i =0;i<=9;i++)
        {
            board[i]=' ';
        }
        for( int i =0;i<=9;i++)0
        {
            showBoard(board);                           //calling showBoard method to show game board to user befor move
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();                        //taking input from user to move to which position
            if (board[k] == ' ') {
                board[k] = var;
                board[computerChoice()] = computerLetter;
                showBoard(board);
            }
            else
            {
                System.out.println("Enter another  Position");
            }
        }
    }
    /*
     * Creating chooseLetter() method to choose which symbol user method
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
    public static void showBoard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
}