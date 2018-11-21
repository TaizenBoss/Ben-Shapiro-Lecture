package tutorialPackage;

public class testRec {

	public static void main(String[] args) {
	
		rec r1 = new rec();
		rec r2 = new rec(100, 200, 300, 100);
		
		r2.translate(5, 20);
		System.out.println(r1.toString());
		System.out.println(r2.toString());

		r1.getx();
		r1.setx(9+10);
	}

}
