package tutorialPackage;

public class StanLeeTribute {
	private String power;
	private String name;
	private int age;
	
	public StanLeeTribute() {}
	
	public StanLeeTribute(String name, String power, int age) {
		this.name = name;
		this.power = power;
		this.age = age;
	}
	
	public String toString() {
		return "name: " + name +" power: " + power;
	}
	public void setPowers(String newPower) {
		power = newPower;
	}
	
	
	
	
}//end class