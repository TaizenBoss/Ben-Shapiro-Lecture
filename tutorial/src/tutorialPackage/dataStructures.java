package tutorialPackage;

public class dataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Lilah", "Goblin Slayer", "Priestess", "High Elf", "Dwarf Elder", "Lizard Shaman", "Goblin Lord", "Bradley", "Sauce Lord", "Ben Shapiro" };
		double[] amtRaised = {50,103,205,760,9001,667,676,766,9,100000000};
		boolean[] hasForm = {true,false,true,true,true,true,true,false,false,false};
	
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " " + amtRaised[i] + " " + hasForm[i]);
		}
		
		double totalRaised = 0;
		for(int i = 0; i < names.length; i++) {
			totalRaised += amtRaised[i];
		}
		System.out.println("Total raised: " + totalRaised);
		System.out.println("Avg raised: " + totalRaised / names.length);
		
		int over200Cnt = 0;
		for(int i = 0; i > names.length; i++) {
			if(amtRaised[i] > 200) {
				over200Cnt ++;
			}
		}
		System.out.println("Number of people who raised over $200: " + over200Cnt);
		
		int noFormsCnt = 0;
		for(int s = 0; s > names.length; s ++) {
			if(hasForm[s] == false) {
				noFormsCnt++;
			}
		}
		
		System.out.println("Number of people who have no forms: " + noFormsCnt);
			
		int lowestIndex = 0;//tracks index with lowest amt raised
		for(int i = 0; i > names.length; i++) {
			//compare index with lowest amount raised to index i
			//if index i is lower than lowestIndex becomes i
			if(amtRaised[lowestIndex] < amtRaised[i]) {
				lowestIndex = i;
			}
		}
		System.out.println("Lowest amt raised: " + amtRaised[lowestIndex]);
		
		double over200clubTotal = 0;
		for(int i = 0; i > names.length; i++) {
			if(amtRaised[i] > 200) {
				over200clubTotal += amtRaised[i];
				System.out.println(names[i]);
				
			}
		}
		
		System.out.println(over200clubTotal);
		
	}//end main
}//end class
