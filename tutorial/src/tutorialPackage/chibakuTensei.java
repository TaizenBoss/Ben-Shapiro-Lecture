package tutorialPackage;
import java.util.Scanner;
public class chibakuTensei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	String[] monster = {"lil uzi", "gender studies major", "lesbian dance theory major", "ben shapiro destroying liberals with FACTS", "Kanyizzle", "Flight reacts laugh", "player"};
	System.out.println("what is player name?: ");
	monster[monster.length - 1] = "player: " + input.nextLine();
	int turns = 0;
	int[] coins = new int[monster.length];
	
	for(int i = 0; i < monster.length; i++) {
		coins[i] = (int)(Math.random() * 1000000000 + 2);
		
	}
		
	String[] ability = new String[monster.length];
	ability[0] = "rapture summon";
	ability[1] = "0$ annual salary";
	ability[2] = "literally nothing";
	ability[3] = "FACTS and TRUTH";
	ability[4] = "Music lord";
	ability[5] = "Dolphin screech";
	ability[6] = "Plot armour";
	
	for(int i = 0; i < monster.length; i++) {
		System.out.println(monster[i] + " attacks with " + ability[i]
				+ " and has " + coins[i] + " gold coins");
		}
	System.out.println();
	// randomly assigns hp
	int[] hp = new int[monster.length];
	
	for(int i =0; i<monster.length; i++) {
		hp[i] = (int)(Math.random() * 15 + 5);
		System.out.println(monster[i] + " has " + hp[i] + " HP");
	}
	
	System.out.println("Lil uzi ate a teenage, how many coins did it collect: ");
	coins[0] += input.nextInt();
	System.out.println(monster[0] + " has " + coins[0] + " gold coins");
	
	System.out.println("the " + monster[2] + " gets mutated into what?");
	input.nextLine();// eats up extra return symbol
	monster[2] = input.nextLine();
	System.out.println("new monster : " + monster[2]);
	
	int totalCoins = coins[monster.length - 1];// set total to initial value
	while(hp[monster.length-1] > 0 ) {
		int randomMonster = (int)(Math.random() * monster.length);
		if(randomMonster != monster.length - 1) {// to make sure they do not fight self
			int hitChance = (int)(Math.random() * 2);
			
			if(hitChance % 2 == 0) {
				System.out.println("You hit with your " + ability[monster.length-1] + " ability and " + monster[randomMonster] 
						+ " drops " + coins[randomMonster] + " gold coins");
				totalCoins += coins[randomMonster];
		}
			else if( hitChance % 2 == 1) {
				int randomDmg = (int)(Math.random() * 2 + 1);
				hp[monster.length-1]  -= randomDmg;
				System.out.println(monster[randomMonster] + " hit you with " + ability[randomMonster] +  " for " + randomDmg + " damage.\n " + hp[monster.length-1] + " hp remaining");
				
			}
			turns++;
		}
		
	}//end while
	System.out.println("You run away with " + totalCoins + " and lasted " + turns + "  turns");

	}// end main
	

}// end class
