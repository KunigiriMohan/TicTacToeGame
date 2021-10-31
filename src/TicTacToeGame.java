import java.util.Scanner;
class TicTacToeGame
{
    public static void main(String[] args){

        char computerLetter = (chooseuserLetter() == 'X') ? 'O' : 'X';      //intializing which chareceter computer should use
    }
    /*
     * creating chooseuserLetter() method to get which symbol does user want
     * */

    public static char chooseuserLetter(){
        char user;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Symbol X or O");
        user = sc.next().charAt(0);                         // taking user input

        return (user);
    }
}