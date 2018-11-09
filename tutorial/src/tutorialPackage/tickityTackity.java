package tutorialPackage;
import java.util.Scanner;
public class tickityTackity {

	static char[][] gameboard = new char[3][3];
	
	public static boolean winStraight(char[][] board, char token) {
		for(int row = 0; row <board.length; row++) {
			for(int col = 0; col < board[row].length; col++){
				if(board[0][0] == token & board[0][1] == token & board[0][2] == token) {
					System.out.println("Player 1 wins");
					return true;
				}
					
				
					 else if(board[1][0] == token & board[1][1] == token & board[1][2] == token) {
							System.out.println("Player 1 wins");
							return true;
					 }
				
					 else if(board[2][0] == token & board[2][1] == token & board[2][2] == token) {
						 System.out.println("Player 1 wins");
						 return true;
					 }
					 else if(board[0][0] == token & board[1][0] == token & board[2][0] == token) {
						 System.out.println("Player 1 wins");
							return true;
					 }
					 else if(board[0][1] == token & board[1][1] == token & board[2][1] == token) {
						 System.out.println("Player 1 wins");
							return true;
					 }
					 else if(board[0][2] == token & board[1][2] == token & board[2][2] == token) {
						 System.out.println("Player 1 wins");
							return true;
					 }
					 else {
						 return false;
					 }
			}
		}//end for
		
		return true;
}//end winStraight
	
	
	public static char changeBoard(int tRow, int tColumn, int player) {
		if(player == 1) {
		gameboard[tRow-1][tColumn-1] = 'X';}
		else if(player == 2) {
			gameboard[tRow-1][tColumn-1] = 'O';}
		return ' ';
	}//end changeBoard
	
	public static char drawBoard() {
		for(int row = 0; row <gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++){
				System.out.print(gameboard[row][col]);
			}
			System.out.println();
		}
		return ' ';
	}//end drawBoard
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanNums = new Scanner(System.in);
		/*char[] board = new char[3];
		board[0] = '-';
		board[1] = '-';
		board[2] = '-';*/
		
		drawBoard();
		
		System.out.println("Hello users. Let's begin our Tic Tac Toe game. You will need 2 players to play");
		int player = 1;
		int turns = 0;
		
		while(turns != gameboard.length) {
			while(winStraight(gameboard, 'X') != true & winStraight(gameboard, 'O') != true) {
				if(player == 1) {
					System.out.println("\n\nPlayer X, please enter in the row you'd like to play on:");
					int tokenRow = scanNums.nextInt();
					System.out.println("Excellent. Now please enter in the column you'd like to play on:");
					int tokenCol = scanNums.nextInt();
					changeBoard(tokenRow, tokenCol, player);
					drawBoard();
					player = 2;
					turns++;
					winStraight(gameboard, 'X');
					winStraight(gameboard, 'O');
				}// end if player == 1
				if(player == 2) {
					System.out.println("\n\nPlayer O, please enter in the row you'd like to play on:");
					int tokenRow = scanNums.nextInt();
					System.out.println("Excellent. Now please enter in the column you'd like to play on:");
					int tokenCol = scanNums.nextInt();
					changeBoard(tokenRow, tokenCol, player);
					drawBoard();
					player = 1;
					turns++;
					winStraight(gameboard, 'X');
					winStraight(gameboard, 'O');
				}//end while win conditions have not been met
		}//end while turns != gameboard.length
	}		
		
		
		
		
		
	  
	}//end main
}//end class