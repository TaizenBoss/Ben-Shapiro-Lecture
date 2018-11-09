package tutorialPackage;
import java.util.Scanner;
public class finale {
	 
	
	   /**
	  	Checks if player has won tic-tac-toe along diagonal lines.
	  	@param board a 3x3 array that contains the tokens (x or o) played
	  	@param player the player to check for a winning sequence of marks
	  	@return true if player won, false otherwise
	   */
	   public static boolean wonDiagonal(int[][] board, char token) {
		   
		   
	   }//wonDiagonal
	 
	   /**
	  	Checks if player has won tic-tac-toe along straight lines.
	  	@param board a 3x3 array that contains the tokens (x or o) played
	  	@param player the player to check for a winning sequence of marks
	  	@return true if player won, false otherwise
	   */
	   public static boolean wonStraightLines(int[][] board, char token) {
		   
	   }//end wonStraightLines
	 
	   /**
	  	Checks if player has won. Calls the wonDiagonal and wonStraightLines methods
	  	@param board a 3x3 array that contains the tokens (x or o) played
	  	@param player the player to check for a winning sequence of marks
	  	@return true if player won, false otherwise
	   */
	   public static boolean win(int[][] board, char token) {
		   
	   }//end win
	 
	   /**
	  	Draws gameboard, player 1 is X, player 2 is O.
	  	@param board the gameboard filled with 0, 1, or 2s
	   */
	   public static void drawBoard(int[][] board) {
		   
	   }//end drawBoard
	  
	//comment each line of the main method
	   public static void main(String[] args)   {
	  	Scanner in = new Scanner(System.in);
	  	int[ ][] board = new int[3][3];
	 
	  	int player = 2;
	 
	  	drawBoard(board);
	  	while (win(board, player))
	  	{
	     	  if (player == 1)
	     	  {
	        	    player = 2;
	     	  }
	     	else
	     	{
	        	  player = 1;
	     	}
	 
	     	System.out.println("Player " + player + " choose a row: ");
	     	int row = in.nextInt();
	   	System.out.println("Player " + player + " choose a column: ");
	     	int column = in.nextInt();
	     	board[row][column] = player;
	     	drawBoard(board);
	  	}//end while

	  	System.out.println("Player " + player + " wins!");
	   }//end main
	}//end class

		// TODO Auto-generated method stub

	


