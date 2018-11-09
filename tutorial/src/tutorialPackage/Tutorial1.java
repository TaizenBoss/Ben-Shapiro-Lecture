package tutorialPackage;
import java.util.Random;
public class Tutorial1 {
	
		public static void main(String[] args) {
			int avg = 0;
			String[] studentsArray = {"thanos" , "peter parker" , "shrek" , "Barney" , "bradley"};
			int[] gradesNum = {12, 10, 12, 10, 11};
			
			int[] exam1 = new int[studentsArray.length];
			int[] exam2 = new int[studentsArray.length];
			int[] exam3 = new int[studentsArray.length];
			
			Random r = new Random();
			
			for(int i = 0; i < exam1.length; i++) {
				exam1[i]= r.nextInt(101);
				exam2[i]= r.nextInt(101);
				exam3[i]= r.nextInt(101);
			}
			
			System.out.println("Name: " + studentsArray[0]);
			System.out.println("Grade: " + gradesNum[0]);
			System.out.println("Exam 1: " + exam1[0]);
			System.out.println("Exam 2: " + exam2[0]);
			System.out.println("Exam 3: " + exam3[0]);
			
			System.out.println("Name: " + studentsArray[4]);
			System.out.println("Grade: " + gradesNum[4]);
			System.out.println("Exam 1: " + exam1[4]);
			System.out.println("Exam 2: " + exam2[4]);
			System.out.println("Exam 3: " + exam3[4]);
			
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println("name: " + studentsArray[i]);
			}
			
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println(studentsArray[i] + " " + gradesNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i] + " ");
				
			}
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println( i+1 + ". " + studentsArray[i] + " " + gradesNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i] + " ");
				
			}
			for(int i = 0; i < studentsArray.length; i ++) {
				avg = 
			}
	
		/*	for(int i = 0; i < studentsArray.length; i++) {
				System.out.println("name: " + studentsArray[i] + " " + "grades: " + exam1[i]);
			}
			
			for(int i = 0; i < exam1.length; i++) {
				avg += exam1[i];
			}
			
			avg = avg/exam1.length;
			System.out.println("Class avg: " + avg);		END OF BLOCK*/
			/*
			
			
			
			
			String[] superheroes = {"sanic" , 
													"black panta" , 
													"pedro parkero" , 
													"bling bling boy"  , 
													"sans"};
			
			System.out.println(superheroes[0]);
			System.out.println(superheroes[superheroes.length-1]);
			
			for(int i = 0; i <= superheroes.length-1; i++ ) {
				System.out.println(superheroes[i]);
			}// end for
			
			String[] superpowers = {"fast",
													  "de schrength",
													  "spooder",
													  "barz",
													  "levitation"};
			
			Boolean[] isHuman = {false,
													true,
													true,
													true,
													false};
			
			for(int i = 0; i <= superheroes.length-1; i++) {
				System.out.print("	Superhero: " + superheroes[i] + "\n" +
												  "	Superpower: " + superpowers[i] + "\n" + 
												  "	Human?: " + isHuman[i] + "\n\n");
												}//end for
			
			for(int i = 0; i <= superheroes.length-1; i++) {
				System.out.println(superheroes[i] +  "       " + superpowers[i] + "       " + isHuman[i]);
				}//end for
			
			superpowers[1] = "none";
			superpowers[5] = "none";
			
			for(int i = 0; i <= superheroes.length; i++) {
				if(isHuman[i] == false) {
					superpowers[i] = "none";
					System.out.println(superpowers[i]);
				}
			}
		END OF BLOCK	*/
			
			
			
			
		}//end main
}// end class
	
				
		
		
		
		
		
		    