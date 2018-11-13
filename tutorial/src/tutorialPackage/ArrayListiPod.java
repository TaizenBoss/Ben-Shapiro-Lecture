package tutorialPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListiPod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> allSongs = new ArrayList<String>();
			ArrayList<String> artists = new ArrayList<>();

			allSongs.add("Lucid Dreams");
			artists.add("Juice Wrld");
			
			allSongs.add("The World is Yours");
			artists.add("Nas");
			
			allSongs.add("Don't Come Out the House");
			artists.add("21 Savage");
			
			allSongs.add("Right Hand");
			artists.add("Drake");
			
			allSongs.add("260");
			artists.add("Ghostface Killah");
			
			ArrayList<String> partyPlayList = new ArrayList<String>();
			
			for(int i = 0; i < allSongs.size(); i++) {
				System.out.println(i+1 + " " + allSongs.get(i) + " by " + artists.get(i));
			}
			System.out.println();
			
			System.out.println("Select menu option :\n" +
			"1. add song to libbrary \n" +
			"2. delete song from library \n" +
			"3. add song to party play list" + 
			"4. exit");
			
			Scanner input = new Scanner(System.in);
			int choice = input .nextInt();
			
			if(choice == 1) {//add song
				input.nextLine(); // clear extra enter character
				System.out.println("Enter title: ");
				allSongs.add( input.nextLine());
				System.out.println("Enter artist's name: ");
				artists.add( input.nextLine());

			}
			else if(choice == 2) {//delete from library
				//todo - check for valid number
				System.out.println("Enter song number to delete: ");
				allSongs.remove((input.nextInt()-1));
				artists.remove((input.nextInt()-1));

			}
			else if(choice == 3) {//add to party play list and print party play list with artist
				input.nextLine();
				System.out.print("Enter song name: ");
				partyPlayList.add(input.nextLine());
				 for(int i
			}
			

	}//end main

}//end class
