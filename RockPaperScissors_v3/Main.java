import uulib.Console;

class Main {
    // entry point
    public static void main(String[] args) {

        // print program title
        System.out.println("Rock Paper Scissors Game");

        // first player inputs move
        char player1 = Console.getChar("Player 1, please enter your move (R, P or S) ");

        //ensure user 1's input is valid (R, P or S) before continuing
        while (player1 != 'R' && player1 !='P' && player1 !='S') {
            player1 = Console.getChar("Player 1, please enter a valid move (R, P or S) ");
        }
        
        // second player inputs move
        char player2 = Console.getChar("Player 2, please enter your move (R, P or S) ");

        //ensure user 2's input is valid (R, P or S) before continuing
        while (player2 != 'R' && player2 !='P' && player2 !='S') {
            player2 = Console.getChar("Player 2, please enter a valid move (R, P or S) ");
        }

        // decide the winner
        if (player1 == 'R' && player2 == 'S' || player1 == 'S' && player2 == 'P' || player1 == 'P' && player2 == 'R' ) {
            System.out.println("Player 1 Wins");
        } else if (player1 == 'S' && player2 == 'R' || player1 == 'P' && player2 == 'S' || player1 == 'R' && player2 == 'P' ) {
            System.out.println("Player 2 Wins");
        } else  {
            System.out.println("Draw");
        }
    }
}