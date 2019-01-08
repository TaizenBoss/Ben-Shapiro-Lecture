package tutorialPackage;
import java.util.Scanner;
import java.util.Random;
public class oldFreezer {
	
static int menuChoice = 0;
static Scanner scanW = new Scanner(System.in);// scan word inputs
static Scanner scanN = new Scanner(System.in);//scan int inputs
static Random randI = new Random();
static int userGuess;//takes in users guess

	public static int guess() {
		int g = randI.nextInt(999999)+1;
		return g;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your name so we can get started! :");
		String name = scanW.nextLine();//takes in users name
			System.out.println("Hello " + name + ", Would you like to play our guessing game?\n Press 1 to play.\n Press 2 to quit."
				+ "");
			menuChoice = scanN.nextInt();// takes in whether user wants to play or not
			if(menuChoice == 2 ) {//if user chooses to exit, tell them goodbye
				System.out.println("Alright, goodbye!");
			}
		
		while (menuChoice != 2) {//begins game and loops until menu choice != 1
			
			System.out.println("Ok, " + name + ",  let's begin the game!");
			int answer = guess();//stores a random number between 1 and 1 million

			int userGuess = 0;
				
			while (userGuess != answer) {
				System.out.println("Choose a number between 1 and 1000000(million): \n");
				userGuess = scanN.nextInt();//takes in users first guess
				
				System.out.println("answer = " + answer);
					
					if(userGuess == answer) {//if users guess is the answer
						System.out.println("Congragulations! You guessed the correct number which was:"	
								+ answer + "\n Would you like to play again?\n Press 1 to play again. \n Press 2 to quit.");
						
						menuChoice = scanN.nextInt();//congragulates and asks if user wishes to play again, and stores their answer
						if(menuChoice == 2) {
							System.out.println("Have a good day, " + name + "!");
							break;//if they do not wish to play anymore, end the game
						}
					}
					
					else if(userGuess > answer) {
						System.out.println("Too high! Try again.\n");
						}// if users guess is too high, tells user their guess is too high
					
					else if (userGuess < answer) {
							System.out.println("Too low! Try again\n");
					}// if users guess is too low, tells user their guess is too low
					
				
					}//end while (userGuess != answer)
			
		
				}//end while (menuChoice != 1)
				
		
		}//end main
}//end class

	