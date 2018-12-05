package tutorialPackage;

public class LineItem {

	private int qty;
	private Product theProduct;
	
	public LineItem(int qty, Product theProduct) {
		this.qty = qty;
		this.theProduct = theProduct;
	}//end constructor
	
	public String toString() {
		return "Product: " + theProduct 
				+ "\nQuantity: " +qty;
				}
	public Product getProduct() {
		return theProduct;
	}
	public int getQty() {
		return qty;
	}
}//end class
