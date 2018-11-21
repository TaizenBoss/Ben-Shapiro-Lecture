package tutorialPackage;

public class rec {
	//instance variable or attributes

	private int x;
	private int y;
	private int width;
	private int height;
	
	//constructor
	public rec() {
		x = 10;
		y = 10;
		width = 50;
		height = 100;
	}//rec
	
	public rec(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}//end rec with parameters
	
	public int getx() {
		return this.x;
	}//end getx
	
	public void setx(int x) {
		this.x = x;
	}//end setx
	
	public void translate(int moveX, int moveY) {
	x += moveX;
	 y += moveY;
	}//end translate
	
	public String toString() {
		return "x: " + x +
					"y: " + y + 
					"width: " + width + 
					"height: " + height;
	}//end toString
	
}//end class