package tutorialPackage;
import java.util.Scanner;
public class Problem_set {


			
	
	
	public static void main(String[] args) {
		// TODO-generated method stub	
		
		//initializes variable newName
		String newName = "";
		// creates scanner called scanWords
		Scanner scanWords = new Scanner(System.in);
		
		// prints Enter your name user:
		System.out.println("Enter your name user:");
		
		//
		String name = scanWords.nextLine();
		name = name.toLowerCase();
		
		int length = name.length();
		int s = length;
		int e = length-1;
		for (int g = length;g  >= 0 ; g--) {
			newName += name.substring(s, e);
			s--;	e--;
		}
		System.out.println(newName);
		
	
	}
		
}
	
	

		
		
			
				

	


