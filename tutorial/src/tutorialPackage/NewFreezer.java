package tutorialPackage;
import java.util.Scanner;
import java.util.Random;
public class NewFreezer {
// slave auction
// tall men - 200$
// child m/f - 250$
// thanos - 1000$

	
			
	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);
		Scanner scanNums = new Scanner(System.in);
		double tallMenCost = 200;
		double childCost = 250;
		double thanosCost = 1000;
		final double Tax = 0.05;
		double cost = 0;
		int trueqty;
		
		System.out.println("Hello shopper, would you like to participate in the secret slave auction?\nPress 1 to continue.\nPress 2 to exit.");
		int stay = scanNums.nextInt();				
		
		System.out.print("What is your name, shopper?");// prompting user
		
		String name = scanWords.nextLine();// input and store name
		System.out.println("Welcome, " + name + ", to the secret slave auction!");
		
		while(stay == 1) {
		System.out.println("\nWhat would you like to buy " + name + " ? enter a number:"
				+ " \n1. Tall male"
				+ "\n2.  Male or female child"
				+ "\n3.  Thanos");
		
		int choice = scanNums.nextInt();
		

			System.out.print("How many would you like to buy?");
			
			int Quantity = scanNums.nextInt();
		
			if (choice == 1) {
					cost = tallMenCost * Quantity;
			System.out.printf("Tax is: %.2f\n", cost * Tax);
			double totalCost = cost + cost * Tax;
			System.out.printf("Total with tax is: %.2f\n", totalCost);}
			
				else if ( choice == 2) {
					cost =  childCost * Quantity;
					System.out.printf("Tax is: %.2f\n", cost * Tax);
					double totalCost = cost + cost * Tax;
					System.out.printf("Total with tax is: %.2f\n", totalCost);}
			
				else if (choice == 3) {
					cost = thanosCost * Quantity;
					System.out.printf("Tax is: %.2f\n", cost * Tax);
					double totalCost = cost + cost * Tax;
					System.out.printf("Total with tax is: %.2f\n", totalCost);}
			
					else {
						System.out.println("Sorry we don't have any of those");}
		System.out.println("\nWould you like to continue buying, " + name  + "?\n "
				+ "0. Exit\n"
				+ "1. Continue buying");
				
		 stay = scanNums.nextInt();	
		 	if(stay == 0) {
		 		System.out.println("Enjoy your slaves!  :)");
		 	}
		}
	
			
		
		
				
	/*	Random rand =  new Random();
		int g =rand.nextInt(3)+1;
		if (g == 3) {
			System.out.println("Special Deal! You can now buy Thanos Shoes!!!!\n Press 1 to buy Thanos Shoes at 5000$ a pair!");
			int choice2 = scanNums.nextInt();
			if (choice2 == 1) {
				System.out.println("Great! how many would you like to buy?");
				int thanosShoesCost = 5000;
				int qty = scanNums.nextInt();
				double cost2 = thanosShoesCost * qty;
				System.out.println("The cost will be: " + cost2);
			}
			else {
				System.out.print("Ok. Maybe next time");
			}
*/
		}
		}

	


