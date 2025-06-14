import java.util.Scanner;

public class tictactoe {
     static char[] board = {'1','2','3','4','5','6','7','8','9'};
     static char currentPlayer = 'X';
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     boolean endGame = false;

     while(!endGame){
         printBoard();
         System.out.println("Player " + currentPlayer +" play your game");
         int move;
         try{
             move = sc.nextInt();
         }catch (Exception e){
             System.out.println("enter between 1-9");
             sc.next();//clear invalid input;
             continue;
         }
         if (move < 1 || move > 9 || board[move - 1] == 'X' || board[move - 1] == 'O'){
             System.out.println("invalid move, go between 1-9");
             continue;
         }
         board[move - 1] = currentPlayer;
         if(checkWinner()){
             printBoard();
             System.out.println("Player" + currentPlayer + " won");
             endGame = true;
         }else if(isBoardFull()){
             printBoard();
             System.out.println("It's a draw!");
             endGame = true;
         }else{
             currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
         }
    
     }
     sc.close();
    }

    private static boolean isBoardFull() {
        for (char c : board){
            if(c !='X' && c != 'O') return false;
        }
        return true;
    }

    private static boolean checkWinner() {
        int [][] winCombos = {
                {0,1,2}, {3,4,5}, {6,7,8}, // rows
                {0,3,6}, {1,4,7}, {2,5,8}, // columns
                {0,4,8}, {2,4,6} //diagonals
        };
        for (int[] combo : winCombos) {
            if (board[combo[0]] == currentPlayer &&
                    board[combo[1]] == currentPlayer &&
                    board[combo[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }
    static void printBoard() {
        System.out.println("\n");
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---|---|---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---|---|---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }
}
