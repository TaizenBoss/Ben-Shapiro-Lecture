package tutorialPackage;
import java.util.Random;
public class Tutorial1 {
	
		public static void main(String[] args) {
			/*String[] studentsArray = {"thanos" , "peter parker" , "shrek" , "Barney" , "bradley", "Sasuke"};
			int[] gradesNum = {12, 10, 12, 10, 11, 12};
			
			int[] exam1 = {100, 83, 35, 46, 67, 89};
			int[] exam2 = {91, 90, 15, 12, 36, 75};
			int[] exam3 = {96, 87, 60, 49, 95, 80};
			
			/*Random r = new Random();
			
			for(int i = 0; i < exam1.length; i++) {
				exam1[i]= r.nextInt(101);
				exam2[i]= r.nextInt(101);
				exam3[i]= r.nextInt(101);
			}
			END BLOCK*/
			/*
			System.out.println("Name: " + studentsArray[0]);
			System.out.println("Grade: " + gradesNum[0]);
			System.out.println("Exam 1: " + exam1[0]);
			System.out.println("Exam 2: " + exam2[0]);
			System.out.println("Exam 3: " + exam3[0] + "\n");
			
			System.out.println("Name: " + studentsArray[5]);
			System.out.println("Grade: " + gradesNum[5]);
			System.out.println("Exam 1: " + exam1[5]);
			System.out.println("Exam 2: " + exam2[5]);
			System.out.println("Exam 3: " + exam3[5] + "\n");
			
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println("name: " + studentsArray[i]);
			}
			System.out.println();
			
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println(studentsArray[i] + " " + gradesNum[i] + " " + exam1[i] + " " 
			+ exam2[i] + " " + exam3[i] + " ");
				}
			System.out.println();
			
			for(int i = 0; i < studentsArray.length; i++) {
				System.out.println( i+1 + ". " + studentsArray[i] + " " + gradesNum[i] + " " 
			+ exam1[i] + " " + exam2[i] + " " + exam3[i] + " ");
				}
			System.out.println();
			
			for(int i = 0; i < studentsArray.length; i ++) {
			 int avg = (exam1[i] + exam2[i] + exam3[i])/3;
			 System.out.println("The average of " + studentsArray[i] + " is " + avg);
			}
			System.out.println();
			
			for(int i = 0; i < studentsArray.length; i++) {
				if(exam3[i] > 79) {
					System.out.println(studentsArray[i] + " scored higher than 79 on exam 3.");
				}
			}
			System.out.println();
			
			for(int i = 0; i < studentsArray.length; i++) {
				if(exam1[i] < 50) {
					exam1[i] = 40;
					System.out.println(studentsArray[i] + "'s grade is now 40");
				}
			}END BLOCK*/
	
		/*	for(int i = 0; i < studentsArray.length; i++) {
				System.out.println("name: " + studentsArray[i] + " " + "grades: " + exam1[i]);
			}
			
			for(int i = 0; i < exam1.length; i++) {
				avg += exam1[i];
			}
			
			avg = avg/exam1.length;
			System.out.println("Class avg: " + avg);		END OF BLOCK*/
			
			
			
			
			
			String[] superheroes = {"sanic" , 
													"black panta" , 
													"pedro parkero" , 
													"bling bling boy"  , 
													"sans"};
			
			System.out.println(superheroes[0]);
			System.out.println();
			
			System.out.println(superheroes[superheroes.length-1]);
			System.out.println();
			
			for(int i = 0; i <= superheroes.length-1; i++ ) {
				System.out.println(superheroes[i]);
			}// end for
			System.out.println();
			
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
				System.out.print("Superhero: " + superheroes[i] + " " +
												  "	Superpower: " + superpowers[i] + " " + 
												  "	Human?: " + isHuman[i] + "\n\n");
												}//end for
			System.out.println();
			
			for(int i = 0; i <= superheroes.length-1; i++) {
				System.out.print(i + " Superhero: " + superheroes[i] + " " +
												  "	Superpower: " + superpowers[i] + " " + 
												  "	Human?: " + isHuman[i] + "\n\n");
												}//end for
			System.out.println();
			
			superpowers[1] = "none";
			superpowers[5] = "none";
			
			for(int i = 0; i < superheroes.length; i++) {
				if(isHuman[i] == false) {
					superpowers[i] = "none";
				}
			}

			for(int i = 0; i <= superheroes.length-1; i++) {
				System.out.print(i + " Superhero: " + superheroes[i] + " " +
												  "	Superpower: " + superpowers[i] + " " + 
												  "	Human?: " + isHuman[i] + "\n\n");
												}//end for
			
			
			
		}//end main
}// end class
	
				
		
		
		
		
		
		    