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
		if(customer.getFunds() - amountDue() < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public double amountDue() {
		double total = 0;
		for(int i = 0; i < lineItem.size(); i++) {
			total +=lineItem.get(i).getProduct().getPrice() * lineItem.get(i).getQty();
		}
			return total;
		}
	
	public void printInvoice() {
		for(int i =  0; i < lineItem.size(); i++) {
			System.out.print("Line Item " + (i +1) + "[qty: " + lineItem.get(i).getQty());
			System.out.print(", Product Name: " + lineItem.get(i).getProduct().getName());
			System.out.printf(", Price: $%.2f" , lineItem.get(i).getProduct().getPrice());
			System.out.printf("]] Total: %.2f\n" , lineItem.get(i).getQty() * lineItem.get(i).getProduct().getPrice());
			}
			System.out.printf("Total DUE: $%.2f\n" , amountDue());
			if(canAfford(this.customer) == true) {
				System.out.println("****** " + customer.getName() +" Purchase APPROVED!!!!!!!!!\n");
				
			}
		
	}//end printInvoice
}//end class
