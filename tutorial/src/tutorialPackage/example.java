package tutorialPackage;

import java.util.Scanner; // imports scanner

public class example {
			

	public static void main(String[] args) {
		String plainText = "Chibaku tenzei";
		int shiftValue = 100;
		char x = ' ';
		String encrypted = "";
		for(int i = 0; i < plainText.length(); i++) {
		 if(plainText.charAt(i) + shiftValue > 122) {
			x = (char)((plainText.charAt(i)%122)+96);
			encrypted += x;
			System.out.println(encrypted);}
		}
		
	}
}//end class


