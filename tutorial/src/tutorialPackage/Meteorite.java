package tutorialPackage;

public class Meteorite {
	String[] powers = {"Tenseigan", "Byakugan", "Rinnegan", "Mangekyo Sharingan", "Sharingan"};
	
	public Meteorite() {}
	
	public void mutate(StanLeeTribute h) {
		int r = (int)(Math.random() * powers.length);
		String newPower = powers[r];
		h.setPowers(newPower);
		System.out.println(h.toString());
	}
}
