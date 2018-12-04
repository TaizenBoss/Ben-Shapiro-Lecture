package tutorialPackage;

public class TestInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Product laser = new Product("laser", 2000);
			System.out.print(laser.toString());
			
			Customer DrDoofenshmirtz = new Customer("Doofenshmirtz Evil Inc.", 
					"Dr.Doofenshmirtz", 10000);
			DrDoofenshmirtz.addFunds(1000);
			
			
	}//end main

}//end class
