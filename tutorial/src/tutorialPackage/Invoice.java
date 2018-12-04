package tutorialPackage;
import java.util.ArrayList;
public class Invoice {

	private Customer customer;
	private 	ArrayList<LineItem>  lineItem = new ArrayList<>();

	public Invoice(Customer customer) {
		this.customer = customer;
	}
	
	public void addToOrder(Product product , int qty) {
		lineItem.add(new LineItem(qty, product ));
	}
	
	public boolean canAfford(Customer customer){
		
	}
	
	public double amountDue() {
		
	}
	
}//end class
