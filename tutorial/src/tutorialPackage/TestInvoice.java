package tutorialPackage;

public class TestInvoice {
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();

		if(c.getFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getFunds());
			System.out.printf("New funds total: $%.2f" ,  c.getFunds()); 
			System.out.print("\n\n");
		}
		
	
	}//end runInvoice

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoice run 1
				Customer c = new Customer("island", "Dr evil", 1230.0);
				Invoice in = new Invoice(c);
				in.addToOrder(new Product("flame Thower",123.80), 3);
				in.addToOrder(new Product("sharks", 105.2),2);
				in.addToOrder(new Product("lasers",50.5),20);
				runInvoice(c,in); //runs invoice
				
				//invoice run 2
				Customer dr = new Customer("Doofenshmirtz Evil Inc.", "Dr.Doofenshmirtz", 2500.00);
				Invoice DRin = new Invoice(dr);
				DRin.addToOrder(new Product("flame Thower-inator",5000.00), 1);
				DRin.addToOrder(new Product("sharks-inator", 5500.00),1);
				DRin.addToOrder(new Product("lasers-inator",1000000.00),1);
				runInvoice(dr, DRin);
				
				//invoice run 3
				Customer P = new Customer("Chum Bucket", "Plankton", 1000000.00);
				Invoice Pin = new Invoice(P);
				Pin.addToOrder(new Product("Drill",150.00), 15);
				Pin.addToOrder(new Product("Fake Krabby Patty Formula", 50.00),100);
				Pin.addToOrder(new Product("Chum",1.00),100000);
				runInvoice(P, Pin);
				
				//invoice run 4
				Customer G = new Customer("Hyrule Castle", "Ganandorf", 50000.00);
				Invoice Gin = new Invoice(G);
				Gin.addToOrder(new Product("Long Sword",250.00), 5);
				Gin.addToOrder(new Product("Armour Set", 5000 ),2);
				Gin.addToOrder(new Product("Tri-Force",1000000000),1);
				runInvoice(G, Gin);
			
				
			
			

			
	}//end main

}//end class
