package tutorialPackage;

public class StanLeeTribute {
	private String power;
	private String name;
	private int age;
	private int hp;
	private int damage;
	
	public StanLeeTribute() {
		name = "Naruto";
		power = "Talk no jutsu";
		age = 30;
		hp = 100;
		damage = 10;
				
	}//end default StanLeeTribute
	
	public StanLeeTribute(String name, String power, int age, int hp, int damage) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.hp = hp;
		this.damage = damage;
	}//end StanLeeTribute with param
	
	public int getHp() {
		return hp;
	}//end getHp
	
	public int getDamage() {
		return damage;
	}//end getDamage
	
	public void setHp(int newHp) {
		this.hp = newHp;
	}//end setHp
	
	public String toString() {
		return "name: " + name +" power: " + power;
	}//end toString
	
	public void setPowers(String newPower) {
		power = newPower;
	}//end setPowers
	
	public void fight(StanLeeTribute h) {
		h.setHp(h.getHp() - damage);
		
	}//end fight
	
	
}//end class