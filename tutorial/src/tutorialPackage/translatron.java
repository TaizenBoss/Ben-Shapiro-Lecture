package tutorialPackage;
import java.util.Scanner;
public class translatron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner word = new Scanner(System.in);
		Scanner nums = new Scanner(System.in);
		int stay;
		int choice;
		String[] englishWords = {"friend",
								"basketball",
								"steal",
								"group of friends",
								"poor neighbourhood",
								"prepare to fight",
								"money",
								"excellent",
								"abondoned house",
								"gun",
								"about to",
								"air jordans",
								"Toronto",
								"advocating for",
								"asking a girl out"};
		
		
		String[] hoodWords = {"homie",
				"rock",
				"chored",
				"gang",
				"hood",
				"square up",
				"bread",
				"fire",
				"bando",
				"piece",
				"finna",
				"j's",
				"the 6",
				"reppin'",
				"shooting your shot"
				
		};
		System.out.print("Hello user. Welcome to the Hood-English Word Translator. Would you like to translate from\n1.Hood to English\n2.English to Hood\n\nEnter the number here: ");
		choice = nums.nextInt();
		if(choice == 2) {
		for(int i = 0; i < hoodWords.length; i++) {
			if(i == 0) {
			System.out.println("English Words in Translation Index: ");
			}
			System.out.println(englishWords[i] + "	");
		
		}
		System.out.print("\n\nWould you like to start translating, user?\nEnter 1 to start translating");
		stay = nums.nextInt();
		while(stay == 1) {
			System.out.println("\n\n");
			System.out.println("What word would you like translated into hood language, user?\nPlease enter your word here:");
			String engword  = word.nextLine();
		
		
			for(int i = 0; i < hoodWords.length; i++) {
				if(engword.equalsIgnoreCase(englishWords[i])) {
					System.out.println("The hood version of the word: " + hoodWords[i]);
					break;}
				else if(!engword.equalsIgnoreCase(englishWords[i]) && i == hoodWords.length-1) {
					System.out.println("Um, sorry. We don't have that word in our index. Please reread the list of words at the top and try again.\nEnter here: ");
					word.nextLine();
					String engword2 = word.nextLine();
					if(engword2.equalsIgnoreCase(englishWords[i])) {
						System.out.println("The hood version of the word: " + hoodWords[i]);
						break;}
				}
				}
			System.out.println("Would you like to continue,  user?\nEnter 1 to continue translating.");
			stay = nums.nextInt();
			}//end while		
			System.out.print("Bye, user!");
		}//end if choice == 2
		
		if(choice == 1) {
		for(int i = 0; i < hoodWords.length; i++) {
			if(i == 0) {
			System.out.println("Hood Words in Translation Index: ");
			}
			System.out.println(englishWords[i] + "	");
		
		}
		System.out.print("\n\nWould you like to start translating, user?\nEnter 1 to start translating");
		stay = nums.nextInt();
		while(stay == 1) {
			System.out.println("\n\n");
			System.out.println("What word would you like translated into hood language, user?\nPlease enter your word here:");
			String engword  = word.nextLine();
		
		
			for(int i = 0; i < hoodWords.length; i++) {
				if(engword.equalsIgnoreCase(englishWords[i])) {
					System.out.println("The hood version of the word: " + hoodWords[i]);
					break;}
				else if(!engword.equalsIgnoreCase(englishWords[i]) && i == hoodWords.length-1) {
					System.out.println("Um, sorry. We don't have that word in our index. Please reread the list of words at the top and try again.\nEnter here: ");
					word.nextLine();
					String engword2 = word.nextLine();
					if(engword2.equalsIgnoreCase(englishWords[i])) {
						System.out.println("The hood version of the word: " + hoodWords[i]);
						break;}
				}
				}
			System.out.println("Would you like to continue,  user?\nEnter 1 to continue translating.");
			stay = nums.nextInt();
			}//end while		
			System.out.print("Bye, user!");
		}
	}//end main

}//end class
