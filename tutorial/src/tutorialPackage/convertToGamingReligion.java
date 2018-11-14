package tutorialPackage;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class convertToGamingReligion {

static Scanner scanint = new Scanner(System.in);
static Scanner scanstr = new Scanner(System.in);
static int UserHP= 50;
ArrayList Backpack = new ArrayList<>(); 
static int choice = scanint.nextInt();

public static void window1() {
	//public staticines window01 with no arguments
	    System.out.println("You die from the fall. Bad choice");
	    //System.out.printllns You die from the fall. Bad choice
	    thread.sleep(3000);
	    //thread.sleep(5000)s the program for 3 seconds
	    main();
	    //calls YourRoom so it goes back to the beginning
}//window1

	public static void door1() {
	//public staticines door1 with no arguments 
	  System.out.println ("You end up in your kitchen.");
	  //System.out.printllns You end up in your kitchen
	  thread.sleep(3000);
	  //thread.sleep(5000)s the program for 3 seconds
	  System.out.println("You hear a noise coming from the basement");
	  //System.out.printllns You head a noise coming from the basement
	  thread.sleep(3000);
	  //thread.sleep(5000)s the program for 3 seconds
	  System.out.println("Go to see what caused the noise? or Stay?");
	  // System.out.printllns "Go to see what caused the noise? or Stay?"
	  System.out.println("Choose 1 to Go, Choose 2 to Stay");
	  choice = scanint.nextInt();
	  //makes the variable choice and says "Go see what cause the noise? Or Stay?"
	  if(choice == 1){
	  //if the userchoice is equal to "Go" continue
	    basement1();
	  }
	    // calls basement1()
	  else if( choice == 2) {
	  // else if the choice is equal to "Stay" continue
	    kitchen1();
	    // calls kitchen1()
	  }
	  else { 
	  // if the anwser is something either than "Go" or "Stay" continue
	    System.out.printlln ("Invalid choice, Try again");
	    // System.out.printllns "Invalid choice, Try again"
	    door1();
	    // calls door1()
	  }
	public static basement1():
	// defines basement1 with no arguments
	  System.out.printlln ("You enter the Basement")
	  // System.out.printllns "You enter the Basement"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("False alarm, It was just a box")
	  // System.out.printllns "False alarm, It was just a box"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("There is however clothes for you to take")
	  // System.out.printllns There is however clothes for you to take
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("Would you like to take these clothes?")
	  // System.out.printllns Would you like to take these clothes?
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  
	  choice = int(input("Say 1 to take clothes. Say 2 to leave them"))
	  // makes the choice variable and System.out.printllns "Say yes to take clothes. Say no to leave them"
	  if choice == 1 and "Clothes" not in Backpack:
	  // if the user choice equals to Yes and clothes are not in the variable Backpack continue  
	    if "Clothes" in Backpack:
	    // if Clothes are in Backpack continue  
	      System.out.printlln ("You already have clothes. Why would you need more?")
	      // System.out.printllns "You already have clothes. Why would you need more?"
	    if "Clothes" not in Backpack:
	    // if Clothes are not in Backpack continue
	      Backpack.append("Clothes")
	      // goes to Backpack and adds the Item "Clothes to it"
	  else if choice == 2:
	  // if the user choice is equal to No continue  
	    System.out.printlln ("Thats alright, I also like being without clothes")
	    // System.out.printllns Thats alright, I also like being without clothes
	  else:
	  // if anything other than 'No' or 'no' or 'Yes' or 'yes' continue
	    System.out.printlln ("I don't think you understood the question")
	    //System.out.printllns "I don't think you understood the question"
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    basement1()
	    //calls the function basement1() to go to it
	  
	  System.out.printlln ("You suddenly remember your dad had a safe with guns.")
	  //System.out.printllns You suddenly remember your dad had a safe with guns.
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("There is however an alarm on the door to the room")
	  // System.out.printllns There is however an alarm on the door to the room
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("You do not know what the passcode to turn off the alarm is.")
	  // System.out.printllns "You do not know what the passcode to turn off the alarm is."
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds 
	  System.out.printlln ('''Your choices are
	  1. Continue Through the door anyways.
	  2. Go back to the kitchen''')
	  // System.out.printllns Your choices are
	  // 1. Continue Through the door anyways.
	  // 2. Go back to the kitchen
	  
	  choice = int(input("Say 1 to Continue, or Say 2 to go Back"))
	  // creates the variable choice and System.out.printllns "Say 1 to Continue, or Say 2 to go Back"
	  if choice == 1:
	  // if the choice is equal to 1 continue 
	    System.out.printlln ("Might as well go since we're down here.")
	    // System.out.printllns "Might as well go since we're down here."
	    gunroom()
	    // calls gunroom() to go there
	  else if choice == 2:
	  // else if the choice is equal to 2 continue  
	    System.out.printlln ("I'm not going to take that chance, it might be too loud.")
	    // System.out.printllns "I'm not going to take that chance, it might be too loud."
	    kitchen1()
	    //calls kitchen1() to go to that function
	  else:
	  // if the choice is anything other than 1 or 2 continue  
	    System.out.printlln ("Invalid choice, maybe you didn't understand?")
	    // System.out.printllns "Invalid choice, maybe you didn't understand?"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    basement1()
	    // calls the basement1() function to go there
	  
	public static kitchen1():
	// public staticines Kitchen1 with no arguments
	  System.out.printlln ("You return to the kitchen.")
	  //System.out.printllns You return to the kitchen
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ("You have to make a choice whether to leave the house and find people, or stay and make a hideout?")
	  //System.out.printllns "You have to make a choice whether to leave the house and find people, or stay and make a hideout?"
	  
	  choice = int(input("Enter 1 to leave, or Enter 2 to Stay"))
	  // creates the variable choice and System.out.printllns "Enter Leave to leave, or Enter Stay to Stay"
	  if choice == 1:
	  // if the user choice is equal to 'Leave' or 'leave' continue
	    System.out.printlln ("You leave the house to try and find people")
	    // System.out.printllns "You leave the house to try and find people"
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("The moment you leave the house you see people")
	    // System.out.printllns "The moment you leave the house you see people"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("The people you have found are your family members.")
	    // System.out.printllns "The people you have found are your family members."
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    Endgame()
	    // calls the function Endgame() to continue to it
	  else if choice == 2:
	  // else if the user choice = 'Stay' or 'stay' continue
	    System.out.printlln ("Ok, well if we're going to stay we might as well secure this place.")
	    //System.out.printllns "Ok, well if we're going to stay we might as well secure this place."
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("There's a couple of things that you could take apart.")
	    // System.out.printllns "There's a couple of things that you could take apart."
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Would you like to take apart the chair's, the table's, or the cabinet's?")
	    // System.out.printllns "Would you like to take apart the chair's, the table's, or the cabinet's?"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("There are 3 chair's and each chair gives 4 wood")
	    // System.out.printllns "There are 3 chair's and each chair gives 4 wood"
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("There is 1 table and it gives 10 wood")
	    // System.out.printllns "There is 1 table and it gives 10 wood"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln("There are 7 cabinets which give 3 wood each.")
	    // System.out.printllns "There are 7 cabinets which give 3 wood each."
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln("You require 21 wood to complete the house, you only have enough energy to take apart 1 item.")
	    // System.out.printllns "You require 21 wood to complete the house, you only have enough energy to take apart 1 item."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    choice = int(input("Enter 1 for chair's, 2 for table's, 3 for Cabinets"))
	    // creates the variable choice and System.out.printllns "Enter Ch for chair's, T for table's, C for Cabinets"
	    if choice == 1:
	    // if the user choice equals to 1 continue
	      System.out.printlln ("Calculating...")
	      // System.out.printllns "Calculating..."
	      thread.sleep(5000)(2)
	      //thread.sleep(5000)s the program for 2 seconds 
	      System.out.printlln ("...........")
	      // pritns ...........
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the frogram for 2 seconds
	      System.out.printlln ("I think you might need to practice your math a bit.")
	      // System.out.printllns "I think you might need to practice your math a bit."
	      kitchen1()
	      // calls the function kitchen1() to go back to it
	    else if choice == 2:
	    // else if the chocie is equal to 2 continue
	      System.out.printlln ("Calculating...")
	      // System.out.printllns "Calculating..."
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      System.out.printlln ("...........")
	      //System.out.printllns "..........."
	      thread.sleep(5000)(2)
	      System.out.printlln ("If only there was another table than you would be good.")
	      // System.out.printllns "If only there was another table than you would be good."
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("But sadly I think your math is a bit off")
	      // System.out.printllns "But sadly I think your math is a bit off"
	      kitchen1()
	      // call the function kitchen1() to go back to it
	    else if choice == 3:
	    // else if the choice is equal to 3 continue
	      System.out.printlln ("Calculating...")
	      //System.out.printllns "Calculating..."
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      System.out.printlln ("..........")
	      // System.out.printllns ".........."
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      System.out.printlln ("Well done sir! Your math is on point!")
	      // System.out.printllns "Well don sir! Your math is on point!"
	      thread.sleep(5000)(3)
	      //thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("Wow, that was some hard work.")
	      // System.out.printllns "Wow, that was some hard work."
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("I think you deserve some well rest, you'll continue tomorrow.")
	      // System.out.printllns "I think you deserve some well rest, you'll continue tomorrow."
	      thread.sleep(5000) (4)
	      // thread.sleep(5000)s the program for 4 seconds
	      wakeup()
	      // calls the function wakeup() to go to it
	    else:
	    // if anything else is written than 1, 2 or 3 continue
	      System.out.printlln ("I don't think you know your numbers.")
	      // System.out.printllns "I don't think you know your numbers."
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("Try again")
	      // System.out.printllns "Try again"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      kitchen1()
	      // calls the function kitchen1() to go back to it
	  else:
	  // if anything else is typed other than 1 or 2 continue
	    System.out.printlln("I don't think you understood the question.")
	    // System.out.printllns "I dont think you understood the question."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Try again")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(2)
	    //thread.sleep(5000)s the program for 2 seconds
	    kitchen1()
	    // calls the function kitchen1() to go back to it

	public static wakeup():
	// public staticines the fuction wakeup()
	  System.out.printlln ("Yawwwwn!")
	  // System.out.printllns Yawwwwn!
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ("That was a good rest don't you think?")
	  // System.out.printllns "That was a good rest don't you think?"
	  
	  choice=int(input("Enter 1 for Yes, or 2 for No"))
	  // creates the function choice and System.out.printllns "Enter 1 for Yes, or 2 for No"
	  if choice == 1:
	  // if the user choice is equal to 1 continue
	    System.out.printlln("You bet it was!")
	    // System.out.printllns "You bet it was!"
	    thread.sleep(5000)(1)
	    // thread.sleep(5000)s the program for 1 second
	    System.out.printlln("Now let's continue this journey shall we?")
	    // System.out.printllns "Now let's continue this journey shall we?"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    
	    choice=int(input("Enter 1 to continue, or 2 to stop"))
	    // creates the variable choice and System.out.printllns "Enter 1 to continue, or 2 to stop"
	    if choice== 1:
	    // if the user choice is equal to 1 continue
	      System.out.printlln("Great let's get back to securing this place!")
	      // System.out.printllns "Great let's get back to securing this place!"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      journeycontinue()
	      // calls the function journeycontinue to continue to it
	    
	    else if choice== 2:
	    // else if the choice is equal to 2 continue
	      System.out.printlln("You stopped the journey.")
	      // System.out.printllns "You stopped the journey"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      System.out.printlln ("Just kidding you can't stop this journey.")
	      // System.out.printllns "Just kidding you can't stop this journey"
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("Now let's continue and stop being lazy")
	      // System.out.printllns "Now let's continue and stop being lazy"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      journeycontinue()
	      // calls the function journeycontinue() to continue to it
	    else:
	    // if anything other than 1 or 2 is entered continue
	      System.out.printlln ("I don't think that you understood the question")
	      // System.out.printllns "I don't think that you understood the question"
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("Try again")
	      // System.out.printllns "Try again"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      wakeup()
	      // calls the function wake up to go back to it
	  
	  else if choice == 2:
	  // else if the user choice is equal to 2 continue
	    System.out.printlln("Well you have no choice we're continuing this journey!")
	    // System.out.printllns "Well you have no choice we're continuing this journey!"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    journeycontinue()
	  else:
	  // if the user choice is anything other than 1 or 2 continue
	    System.out.printlln ("I don't think that you understood the question")
	    // System.out.printllns "I don't think that you understood the question"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Try again")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    wakeup()
	    // calls the function wakeup() to continue to it

	public static journeycontinue():
	// public staticines journeycontinue()
	  System.out.printlln("Well we have baricaded the windows and doors already")
	  // System.out.printllns "Well we have baricaded the windows and doors already"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln("We might as well dismantle the table and chairs too.")
	  // System.out.printllns "We might as well dismantle the table and chairs too."
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln("What would you like to dismantle first?")
	  // System.out.printllns "What would you like to dismantle first?"
	  thread.sleep(5000)(2)
	  //thread.sleep(5000)s the program for 2 seconds
	  choice= int(input("Enter 1 for Tables, or 2 for chairs"))
	  // creates the variable choice and System.out.printllns "Enter 1 for Tables, or 2 for chairs"
	  if choice== 1:
	  // if the user choice is equal to 1 continue
	    System.out.printlln ("You begin to dismantle the tables.")
	    // System.out.printllns "You begin to dismantle the tables"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("As you dismantle one of the tables you find something wierd under it.")
	    // System.out.printllns "As you dismantle one of the tables you find something wierd under it."
	    thread.sleep(5000)(4)
	    // thread.sleep(5000)s the program for 4 seconds
	    System.out.printlln ("It is a secret passage...")
	    // System.out.printllns "It is a secret passage..."
	    thread.sleep(5000)(2)
	    //thread.sleep(5000)s the program for 2 seconds
	    secretpassageentrance()
	    // calls the function secretpassageentrance() to continue to it
	  else if choice== 2:
	  // else if the choice is equal to 2 continue
	    System.out.printlln ("You dismantle all of the chairs in a quick matter.")
	    // System.out.printllns "You dismantle all of the chairs in a quick matter."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Once you finish the chairs, you begin to dismantle all the tables.")
	    // System.out.printllns "Once you finish the chairs, you begin to dismantle all the tables."
	    thread.sleep(5000)(4)
	    // thread.sleep(5000)s the program for 4 seconds
	    System.out.printlln("Under one of the tables you find something rather wierd.")
	    // System.out.printllns "Under one of the tables you find something rather wierd"
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln("There is a secret passageway.")
	    // System.out.printllns "There is a secret passageway."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    secretpassageentrance()
	    // calls the function secretpassageentrance() to go to it
	  else:
	  // if anything else is typed continue
	    System.out.printlln ("I think you wrote the wrong number.")
	    // System.out.printllns "I think you wrote the wrong number."
	    System.out.printlln ("Try again")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    journeycontinue()
	    // calls the function journeycontinue() to go to it
	    
	public static secretpassageentrance():
	// public staticines the function secretpassageentrance
	  System.out.printlln ("Do you want to enter this secret passage?")
	  // System.out.printllns "Do you want to enter this secret passage?"
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  
	  choice=int(input("Enter 1 to go, or 2 to stay"))
	  // creates the variable choice and asks System.out.printllns "Enter 1 to go, or 2 to stay"
	  if choice == 1:
	  // if the choice is equal to 1 continue
	    System.out.printlln ("Ok here we go !")
	    // System.out.printllns "Ok here we go !"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    secretpassage()
	    // calls the function secretpassage to go to it
	  else if choice == 2:
	  // else if the user choice is equal to 2 continue
	    knockknock()
	    // calls the function knockknock() to go to it
	  else:
	  // if the user choice is something either than 1 or 2 continue
	    System.out.printlln ("I think you have misread the question")
	    // System.out.printllns "I think you have misread the question"
	    System.out.printlln ("Try again.")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    secretpassageentrance()
	    // calls the function secretpassageenetrance to go to it

	public static secretpassage():
	// public staticines the variable secretpassage() 
	  System.out.printlln ("You enter the Secret passage")
	  // System.out.printllns "You enter the Secret passage"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("There are 3 doors ahead of you.")
	  // System.out.printllns "There are 3 doors ahead of you."
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("Each are labeled Trap door. Do not Enter")
	  // System.out.printllns "Each are labeled Trap door. Do not Enter"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln("Do you want to Enter one of the doors or leave?")
	  // System.out.printllns "Do you want to Enter one of the doors or leave?"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  
	  choice= int(input("Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave."))
	  // creates the variable choice and System.out.printllns "Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave."
	  if choice== 1:
	  // if the user choice is equal to 1 continue
	    System.out.printlln ("You enter Trap door 1")
	    // System.out.printllns "You enter Trap door 1"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("It is infact a trap.")
	    // System.out.printllns "It is infact a trap."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("You die.")
	    // System.out.printllns "You die."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    secretpassage()
	    // calls the function secretpassage() to go to it
	  else if choice==2:
	  // else if the choice is equal to 2 continue
	    System.out.printlln ("You enter Trap door 2")
	    // System.out.printllns "You enter Trap door 2"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("It is infact a trap.")
	    // System.out.printllns "It is infact a trap."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("You die.")
	    // System.out.printllns "You die."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    secretpassage()
	    // calls the function secretpassage() to go to it
	  else if choice==3:
	  // else if the choice is equal to 3 continue
	    System.out.printlln ("You enter Trap door 3")
	    // System.out.printllns "You enter Trap door 3"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("It is infact a trap.")
	    // System.out.printllns "It is infact a trap."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("You die.")
	    // System.out.printllns "You die"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    secretpassage()
	    // calls the function secret passage() to go to it
	  else if choice==4:
	  // else if the user choice is equal to 4 continue
	    System.out.printlln ("Are you sure you want to go back?")
	    // System.out.printllns "Are you sure you want to go back?"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    
	    choice = int(input("Enter 1 for Yes, or 2 to go back to secret passage."))
	    // creates the variable choice and System.out.printllns "Enter 1 for Yes, or 2 to go back to secret passage."
	    if choice == 1:
	    // if the user choice is equal to 1 continue
	      System.out.printlln ("Ok! Let's Go!")
	      // System.out.printllns "Ok! Let's Go!"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      knockknock()
	      // calls the function knockknock() to go to it
	    else if choice == 2:
	    // else if the choice equals to 2 continue
	      System.out.printlln ("Alright! Let's go back!")
	      // System.out.printllns "Alright! Let's go back!"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      secretpassage()
	      // calls the function secretpassage() to go to it
	    else:
	    // if user choice is something other than 1 or 2 continue
	      System.out.printlln ("I think you have misread the question")
	      // System.out.printllns "I think you have misread the question"
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      System.out.printlln ("Try again")
	      // System.out.printllns "Try again"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      secretpassage()
	      // calls the function secretpassage() to go to it
	  else:
	  // if the user choice is something other than 1, 2, 3 or 4 continue
	    System.out.printlln ("I think you have misread the question")
	    // System.out.printllns "I think you have misread the question"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Try again")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    secretpassage()
	    // calls the function secretpassage() to go to it

	public static knockknock():
	// public staticines the variable knockknock()  
	  System.out.printlln ("You hear a knock coming from the door.")
	  // System.out.printllns "You hear a knock coming from the door."
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("Do you want to open the door?")
	  // System.out.printllns "Do you want to open the door?"
	  thread.sleep(5000)(1)
	  // thread.sleep(5000)s the program for 1 seconds
	  
	  choice=int(input("Enter 1 to open the door, or 2 to keep it closed"))
	  // creates the variable choice and System.out.printllns "Enter 1 to open the door, or 2 to keep it closed"
	  if choice == 1:
	  // if the choice is equal to 1 continue
	    System.out.printlln ("You open the door....")
	    // System.out.printllns "You open the door"
	    thread.sleep(5000)(5)
	    // thread.sleep(5000)s program for 5 seconds
	    System.out.printlln ("To your surprise it's someone you know.")
	    // System.out.printllns "To your surprise it's someone you know."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("It's.")
	    // System.out.printllns "It's."
	    thread.sleep(5000)(1)
	    // thread.sleep(5000)s the program for 1 second
	    System.out.printlln ("It's.")
	    // System.out.printllns "It's."
	    thread.sleep(5000)(1)
	    // thread.sleep(5000)s the program for 1 second.
	    System.out.printlln ("It's Your family they live!")
	    // System.out.printllns "It's Your family they live!"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    Endgame()
	    // calls the function Endgame() to continue to it
	  else if choice== 2:
	  // else if the choice is equal to 2 continue
	    System.out.printlln ("The noise is getting louder.")
	    // System.out.printllns "The noise is getting louder."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("You begin to hear whispers outside the door.")
	    // System.out.printllns "You begin to hear whispers outside the door."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Someone outside says.")
	    // System.out.printllns "Someone outside says."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("OPEN THE DOOR, OR WE WILL!")
	    // System.out.printllns "OPEN THE DOOR, OR WE WILL!"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("You're going to have to make a choice whether to open the door or not.")
	    // System.out.printllns "You're going to have to make a choice whether to open the door or not."
	    
	    choice= int(input("Enter 1 to open Door, Enter 2 to keep it closed."))
	    // creates variable choice and System.out.printllns "Enter 1 to open Door, Enter 2 to keep it closed."
	    if choice== 1:
	    // if the choice is equal to 1 continue
	      System.out.printlln ("You aproach the door quickly")
	      // System.out.printllns "You aproach the door quickly"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      System.out.printlln ("You can still go back if you'd like?")
	      // System.out.printllns "You can still go back if you'd like"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      
	      choice= int(input("Enter 1 to turn handle, Enter 2 to not open."))
	      // creates the variable choice and System.out.printllns "Enter 1 to turn handle, Enter 2 to not open"
	      if choice == 1:
	      // if the user choice is equal to 1 continue
	        System.out.printlln ("You slowly turn the handle.")
	        // System.out.printllns "You slowly turn the handle."
	        thread.sleep(5000)(2)
	        // thread.sleep(5000)s the program for 2 seconds
	        System.out.printlln ("The door opens.")
	        // System.out.printllns "The door opens."
	        thread.sleep(5000)(2)
	        // thread.sleep(5000)s the program for 2 seconds
	        System.out.printlln ("It's Your family.")
	        // System.out.printlln ("It's Your family.")
	        thread.sleep(5000)(3)
	        // thread.sleep(5000)s the program for 3 seconds
	        Endgame()
	        // calls the function endgame() to go to it
	      else if choice == 2:
	      // else if the user choice is equal to 2 continue
	        System.out.printlln("You step back and wait to see what happens.")
	        // System.out.printllns "You step back and wait to see what happens."
	        thread.sleep(5000)(3)
	        // thread.sleep(5000)s the program for 3 seconds
	        Bustdoor()
	        // calls the function Bustdoor() to go to it
	      else:
	      // if the user choice is anything other than 1 or 2 continue
	        System.out.printlln ("Invalid choice")
	        // System.out.printllns "Invalid choice"
	        thread.sleep(5000)(3)
	        // thread.sleep(5000)s the program for 3 seconds
	        System.out.printlln ("Try again")
	        // pritns "Try again"
	        thread.sleep(5000)(2)
	        // thread.sleep(5000)s the program for 2 seconds
	        knockknock()
	        // calls the function knock knock to go to it.
	    else if choice == 2:
	    // else if the choice is equal to 2 continue
	      System.out.printlln ("You patiently wait for what happens next.")
	      // System.out.printllns "You patiently wait for what happens next."
	      thread.sleep(5000)(3)
	      // thread.sleep(5000)s the program for 3 seconds
	      Bustdoor()
	      // calls the function Bustdoor() to go to it
	    else:
	    // if the user choose anything other than 1 or 2 continue
	      System.out.printlln("Invalid choice.")
	      // System.out.printllns "Invalid choice."
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      System.out.printlln("Try again")
	      // System.out.printllns "Try again"
	      thread.sleep(5000)(2)
	      // thread.sleep(5000)s the program for 2 seconds
	      knockknock()
	      // calls the function knockknock() to go to it.

	public static Bustdoor():
	// public staticines the function Bustdoor():
	  System.out.printlln ("The door gets busted down.")
	  // System.out.printllns "The door gets busted down."
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("It's your family.")
	  // System.out.printllns "It's your family."
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  Endgame()
	  // call the function Endgame() to go to it.
	    
	  

	public static gunroom():
	// public staticines the variable gunroom()  
	  System.out.printlln ("Ok, you don't have to continue if you dont want to.")
	  // System.out.printllns "Ok, you don't have to continue if you dont want to."
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ('''
	  1. Turn the handle and take the chance of the alarm going off?
	  2. Return to the kitchen?
	  ''')
	  //System.out.printllns
	  // 1. Turn the handle and take the chance of the alarm going off?
	  // 2. Return to the kitchen?
	  
	  choice = int(input("Enter 1 to enter the room, Enter 2 to return to kitchen"))
	  // creates the variable choice and System.out.printllns "Enter 1 to enter the room, Enter 2 to return to kitchen"
	  if choice == "1":
	  // if the user choice equals to 1 continue 
	    System.out.printlln ("BEEP! BEEP! BEEP!")
	    // System.out.printllns "BEEP! BEEP! BEEP!"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("....Groan....")
	    // System.out.printllns "....Groan...."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    gunroominside()
	    // calls the function gunroominside() to continue to it
	  else if choice == 2:
	  // else if the choice is equal to 2 continue
	    kitchen1()
	    // calls the function kitchen1() to go to it
	  else:
	  // if the user choice is something other than 1 or 2 continue
	    System.out.printlln ("I think you have misread the question")
	    // System.out.printllns "I think you have misread the question"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("Try again")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(1)
	    // thread.sleep(5000)s the program for 1 seconds
	    gunroom()
	    // calls the function gunroom() to go to it
	    

	public static gunroominside():
	// public staticines gun room inside
	  System.out.printlln ("Quickly! Grab a gun! THE ZOMBIES ARE COMING!")
	  // System.out.printllns "Quickly! Grab a gun! THE ZOMBIES ARE COMING!"
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ('''Your choice of guns are:
	  1: Pistol
	  2: Shotgun
	  ''')
	  //System.out.printllns '''Your choice of guns are:
	  // 1: Pistol
	  // 2: Shotgun
	  
	  choices = int(input("Enter 1 for Pistol, Enter 2 for Shotgun"))
	  // creates the variable choices and System.out.printllns "Enter 1 for Pistol, Enter 2 for Shotgun"
	  if choices == "1" and "Pistol" not in Backpack:
	  // if the user choice is equal to 1 and Pistol is not in Backpack continue
	    if "Pistol" in Backpack:
	    // if "Pistol" is already in the variable Backpakc continue
	      System.out.printlln ("You already have a Pistol you goof!")
	      // System.out.printllns "You already have a Pistol you goof!"
	    if "Pistol" not in Backpack:
	    // if "Pistol" is not in the variable Backpack continue
	      System.out.printlln ("Good choice, flexible gun with lots of options!")
	      //System.out.printllns "Good choice, flexible gun with lots of options!"
	      Backpack.append("Pistol")
	      // Adds the String Pistol to The variable Backpack
	  else if choices == "2" and "Shotgun" not in Backpack:
	  // else if the user choice is equal to 2 and Shotgun is not in Backpack continue
	    if "Shotgun" in Backpack:
	    // if the "Shotgun" string is in Backpack continue
	      System.out.printlln ("You already have a Pistol you goof!")
	      // System.out.printllns "You already have a Pistol you goof!"
	    if "Shotgun" not in Backpack:
	    // if "Shotgun" string is not in Backpack continue
	      System.out.printlln ("Good choice, Easy kills with this bad boy!")
	      // System.out.printllns "Good choice, Easy kills with this bad boy!"
	      Backpack.append("Shotgun")
	      // Adds the string "Shotgun" to the variable Backpack
	  else:
	  // if something else other than 1 or 2 is chosen continue
	    System.out.printlln ("Wasn't in the choices sorry")
	    // System.out.printllns "Wasn't in the choices sorry"
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    gunroominside()
	    //calls the function gunroominside to go to it
	    
	  System.out.printlln ("5 zombies are incoming!")
	  // System.out.printllns "5 zombies are incoming!"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("Are you going to run? Or are you going to fight?")
	  //System.out.printllns "Are you going to run? Or are you going to fight?"
	  
	  choice = int(input("Enter 1 to Run, or Enter 2 to fight!"))
	  // makes the variable choice and System.out.printllns "Enter 1 to Run, or Enter 2 to fight!"
	  if choice == 2:
	  // if the user choice is 1 continue
	    System.out.printlln ("PREPARE TO FIGHT!!")
	    // System.out.printllns "PREPARE TO FIGHT!!"
	    Fightnumber1()
	    // calls the function Fightnumber1() to go to it
	  else if choice == 1:
	  // else if the choice is equal to 2 continue
	    System.out.printlln ("You run right into the hoard of zombies and get caught.")
	    // System.out.printllns "You run right into the hoard of zombies and get caught."
	    thread.sleep(5000)(3)
	    //thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("You die sorry.")
	    // System.out.printllns "You die sorry."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    gunroominside()
	    // calls the function gunroominside() to continue to it
	  else:
	  // if anything else is written other than 1 or 2 continue
	    System.out.printlln ("I don't think you understood the question.")
	    // System.out.printllns  "I don't think you understood the question"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("Try again")
	    // System.out.printllns "Try again"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    gunroominside()
	    // calls the function gunroominside() to go back to it

	public static Fightnumber1():
	//public staticines Fightnumber1 with no parameters
	  System.out.printlln ("Intense music incoming!")
	  // System.out.printllns "Intense music incoming!"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("First zombie coming")
	  // System.out.printllns "First zombie coming"
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  choice = int(input("Enter 1 to shoot in the head or 2 in the chest"))
	  // creates the variable choice and asks the user "Enter 1 to shoot in the head"
	  if choice == 1:
	  // if the choice is equal to 1 continue
	    System.out.printlln ("You shoot the zombies in the head")
	    // System.out.printllns "You shoot the zombies in the head"
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    System.out.printlln ("They all die")
	    // System.out.printllns "They all die"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("Congratulations")
	    // System.out.printllns Congratulations
	  
	public static Endgame():
	// public staticines function Endgame()
	  System.out.printlln ("Congratulations!")
	  // System.out.printllns "Congratulations!"
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ("You have succesfully found your family!")
	  // System.out.printllns "You have succesfully found your family!"
	  thread.sleep(5000)(3)
	  //thread.sleep(5000)s the program for 3 seconds
	  System.out.printlln ("And without dying too!")
	  // System.out.printllns "And without dying too!"
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ("I hope....")
	  // System.out.printllns "I hope...."
	  thread.sleep(5000)(2)
	  // thread.sleep(5000)s the program for 2 seconds
	  System.out.printlln ("Would you like to play again or End?")
	  // System.out.printllns "Would you like to play again or End?"
	  thread.sleep(5000)(3)
	  // thread.sleep(5000)s the program for 3 seconds
	  
	  choice = int(input("Enter 1 to play again or 2 to End."))
	  // creates the variable choice and System.out.printllns "Enter 1 to play again or 2 to End."
	  if choice == 1:
	  // if the user choice is equal to 1 continue
	    System.out.printlln ("Good Luck!")
	    // System.out.printllns "Good Luck!"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    YourRoom()
	    // calls the function YourRoom() to go to it
	  else if choice == 2:
	  // else if the user choice is equal to 2 continue
	    System.out.printlln ("Ok that's Fine!")
	    // System.out.printllns "Ok that's Fine!"
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("Just press the Stop◻️ button at the top")
	    // System.out.printllns "Just press the Stop◻️ button at the top"
	  else:
	  // if user choice is anything other than 1 or 2 continue
	    System.out.printlln ("Come on it's the end of the game.")
	    // System.out.printllns "Come on it's the end of the game."
	    thread.sleep(5000)(2)
	    // thread.sleep(5000)s the program for 2 seconds
	    System.out.printlln ("And you still don't understand enter 1 or 2. Jeeze.")
	    // System.out.printllns "And you still don't understand enter 1 or 2. Jeeze."
	    thread.sleep(5000)(3)
	    // thread.sleep(5000)s the program for 3 seconds
	    Endgame()
	    // calls the function Endgame() to go to it.
	  
	public static void main(String[] args) {
		// creates YourRoom with no arguments  
		System.out.println ("This game will be based on your choices.");
		// System.out.printllns "This game will be based on your choices."
		System.out.println ("Choose Wisely.");
		// System.out.printllns "Choose Wisely."


		// imports randint from random

		// imports thread.sleep(5000) from time
		// sets UserHP to 50
		// makes a backpack which will be filled with items during gameplay

		// creates YourRoom with no arguments  
		System.out.printlln ("Your name is Rebly.");
		//System.out.printllns Your name is Rebly
		thread.sleep(4000);
		// thread.sleep(5000)s the program for 4 seconds
		System.out.printlln ("Rebly wakes up in their room.");
		// System.out.printllns UserName <- Choice of user + "wakes up in their room"
		thread.sleep(3000);
		//thread.sleep(5000)s the program for 3 seconds
		System.out.println ("You wake up with only underwear on.");
		// System.out.printllns "You wake up with only underwear on."
		thread.sleep(3000);
		//thread.sleep(5000)s the program for 3 seconds
		System.out.println ("You hear glass breaking outside.");
		// System.out.printllns "You hear glass breaking outside"
		thread.sleep(3000);
		//thread.sleep(5000)s the program for 3 seconds
		System.out.println ("You look out the window and zombies are overrunning the place.");
		// System.out.printllns "You look out the window and zombie are overrunning the place."
		thread.sleep(4000);
		//thread.sleep(5000)s the program for 4 seconds
		System.out.println ("You know you have to make quick decisions.");
		// System.out.printllns "You know you have to make quick decisions."
		thread.sleep(3000);
		//thread.sleep(5000)s the program for 3 seconds
		System.out.println (''Your options are\n" +
				"1: Jump out the Window(Potential Danger)\n" +
				"2: Walk out of the Room(Potential Danger\n)");
		// System.out.printllns "Your options are
		// 1: Jump out the Window(Potential Danger)
		// 2: Walk out of the Room(Potential Danger)
		System.out.println("Enter a Number for your Choice, Remember Both have potential Danger");
		// makes the variable choice and System.out.printllns "Enter a number for your Choice, Remember both have potential Danger"
		if choice == 1:
			// if the choice == 1 continues  
			window1()
			// continues through window01
		else if choice == 2:
				// if the choice is 2 continues
				door1()
				// continues through door01
		else:
					// if the anwser is different than 1 or 2 continue
					System.out.printlln ("Invalid choice, Try again")
					// System.out.printllns Invalid choice, Try again
}


YourRoom()
// calls the function YourRoom() which untimately starts the whole game



	}//end main

}//end class
