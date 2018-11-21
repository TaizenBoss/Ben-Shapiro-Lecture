package tutorialPackage;

public class Meteorite {
	String[] powers = {"tail whip", "splash", "fire wheel", "Mangekyo Sharingan"};
	
	public Meteorite() {}
	
	public void mutate(StanLeeTribute h) {
		int r = (int)(Math.random() * powers.length);
		String newPower = powers[r];
		h.setPowers(newPower);
		System.out.println(h.toString());
	}
}
