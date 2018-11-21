package tutorialPackage;

public class herotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StanLeeTribute h1 = new StanLeeTribute();
		StanLeeTribute h2 = new StanLeeTribute("Kakashi", "Sharingan", 30);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
	}

}
