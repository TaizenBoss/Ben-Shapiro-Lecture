package tutorialPackage;

public class Customer {

	private String secretLairLocation;
	private String Name;
	private double evilFunds;
	
	public Customer(String secretLairLocation, String Name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.Name = Name;
		this.evilFunds = evilFunds;
	}
	
	public String toString() {
		return "Secret Lair Location: " + secretLairLocation 
				+ "\nName: " + Name 
				+ "\nEvil Funds: " + evilFunds;
 	}
	
	public void addFunds(double deposit) {
		evilFunds += deposit;
	}
	public String getLair() {
		return secretLairLocation;
	}
	
	public String getName() {
		return Name;
	}
	
	public double getFunds() {
		return evilFunds;
	}
}
