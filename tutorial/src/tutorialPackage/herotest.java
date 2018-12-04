package tutorialPackage;

public class herotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StanLeeTribute h1 = new StanLeeTribute();
		StanLeeTribute h2 = new StanLeeTribute("Kakashi", "Sharingan", 30, 500, 20);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
		
		while(h1.getHp() >0){
		h2.fight(h1);
		System.out.println(h1.getHp());
	}//end while hero1 health does not equal 0

	}//end main
}//end class
