package tutorialPackage;
import java.util.Scanner;
public class encrypto {

	public static String encrypt(String plainText, int shiftValue) {
		String encrypted ="";
		char x = ' ';
		plainText =  plainText.toLowerCase();
		for (int i = 0; i < plainText.length(); i++) {
			if(plainText.charAt(i) == ' ') {
				encrypted+= " ";
			}
			else if(plainText.charAt(i) + shiftValue < 122) {
				 x = (char)(plainText.charAt(i) + shiftValue);
				 encrypted += x;}
				
			else if(plainText.charAt(i) + shiftValue > 122) {
				  x = (char)(((plainText.charAt(i)+shiftValue)%122)+96);
					  encrypted += x;
				
			}
		}// end for
		
		return encrypted;
	}//end encrypt
	
	public static String decrypt(String encryptedText, int shiftValue) {
		String encrypted ="";
		char x = ' ';
		encryptedText =  encryptedText.toLowerCase();
		for (int i = 0; i < encryptedText.length(); i++) {
			if(encryptedText.charAt(i) == ' ') {
				encrypted+= " ";
				}
			else if(encryptedText.charAt(i)-shiftValue >= 96) {
				 x = (char)(encryptedText.charAt(i) - shiftValue);
				 encrypted += x;
			}
			else if(encryptedText.charAt(i)-shiftValue < 96) {
				x = (char)(122-(96 % (encryptedText.charAt(i) -shiftValue)));
				encrypted += x;
			}
		}// end for
		
		return encrypted;
	}//end decrypt
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanWords = new Scanner(System.in);
		Scanner scanNums = new Scanner(System.in);
		System.out.println("Alright user, what would you like to encrypt? Please enter here: ");
		String message = scanWords.nextLine();
		System.out.println("Ok! Now please enter in your desired shift value here: ");
	    int key = scanNums.nextInt();
		System.out.println(encrypt(message, key));
		System.out.println(decrypt(encrypt(message,key), key));
		
		
		
	
	}// end main

}//end class
