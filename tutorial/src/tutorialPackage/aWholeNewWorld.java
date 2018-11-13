package tutorialPackage;
import java.util.ArrayList;
public class aWholeNewWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create new ArrayList object
		ArrayList<Integer> grades = new ArrayList<>();
		int num;
		//useful methods for Array List
		grades.add(76);//adds to array list
		grades .add(86);
		grades.add(90, 1);//insert 90 at index 1
		grades.remove(0);// remove first item (at index 0)in ArrayList
		grades.get(0);//return index 0
		num = grades,get(1);//assign value of index 1 to num
		grades.size();//return lengtj of ArrayList
		grades.add(35);
		grades.add(75);
		
		//print ArrayList
		for(int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
		}
		
		grades.remove(1);
		
		for(int grade: grades ) {//enhanced for loop
			System.out.println(grades);
			}
		
		
		
		
		
		
	}//end main

}//end class
