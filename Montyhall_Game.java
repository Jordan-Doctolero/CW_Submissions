/**
 * This is the Montyhall_Game class.
 * This is where any player can play my own Monty Hall game.
 * This game we use an imported Scanner object.
 * The player will use the Scanner to input an int and strings.
 * Then by using logic statements, it will locate and find the user door and win door.
 * It will also find a revealed door depending on what the user picks.
 * It will print out at the end if they win or lose.
 * @Jordan_Doctolero
 */

import java.util.Scanner;
//This imports a Scanner into my class.

public class Montyhall_Game {
	
	private static Scanner theReader = new Scanner(System.in);
	//This instatiates a new Scanner attribute object.
	//This can be called anywhere in the class or methods below.
	//This is to store the user Input and it can read it to find the information that we need to run the game.
	
	/*
	 * This is where all the action happens.
	 * The class calls all the methods under the main and goes in order to do each code.
	 * You will be able to input a word into a Scanner.
	 * The Scanner will output data that will be interactive to show the chosen door and wrong door.
	 * It will also ask to swap or stay and tell you if you win or lose.
	 */
	public static void main(String[] args) {
	
	//Task 1:
	int winDoor=pickRandomDoor();
	//This creates a new int variable that is assigned the class above.
	
	/**
	 * In the actual game, below are two lines of code that do not run.
	 * I use this in order to test the game.
	 * When I run the actual game, I will add // to make them ineligible to be code to run.
	 */
	System.out.println(winDoor);
	//This prints out all the information from the method that it is the print statement and skips a line.
	System.out.println();
	//This skips a line to make it look neat.
	
	//Task 2:
	int userDoor=pickUserDoor();
	//This creates a new int variable that is assigned the class above.
	System.out.println(userDoor + ".");
	//This prints out all the information from the method that it is the print statement and skips a line.
	//It also adds a period to look nice.
	System.out.println();
	//This skips a line to make it look neat.
	
	//Task 3:
	int revealedDoor=showWrongDoor(userDoor, winDoor);
	//This creates a new int variable that is assigned the class above.
	System.out.println(revealedDoor + ".");
	//This prints out all the information from the method that it is the print statement and skips a line.
	//It also adds a period to look nice.
	System.out.println();
	//This skips a line to make it look neat.
	
	//Task 4/5:
	swapOrStayAndReveal(userDoor, winDoor, revealedDoor);
	//This creates a new int variable that is assigned the class above.
	//This prints out all the information from the method that it is the print statement and skips a line.
	//It also adds a period to look nice.
	System.out.println();
	//This skips a line to make it look neat.
	
	theReader.close();
	//This closes the Scanner object I imported into the class.
	
	}
	/*
	 * This method uses math.random to generate a random door 1-3.
	 * This will be the win door condition that will be used through the whole game.
	 */
	 private static int pickRandomDoor()
	 {
		 return((int)(Math.random()*3+1));
		 //This returns a random number as an int using Math.random class.
	 }

	 
	 /*
	  * This method is to do when the user says they want to choose a specific door.
	  * It uses logic statements to make this happen.
	  * Depending on which way they type it and the door chosen, it will return that door.
	  * It uses a scanner to find the user input.
	  */
	 private static int pickUserDoor()
	 {
	     System.out.println("Choose a door using one, two, or three: ");
	     //This prints out the text above.
	     String theInput = theReader.nextLine();
	     //This instatiates a new Scanner object called theInput.
		 //It is operated with theReader and what ever word the user types in the console, it will output.
	     System.out.println();
	     //This skips a line to make it look neat.
	     
	     
	     if(theInput.equals("one")||theInput.equals("One")||theInput.equals("1"))
	     //This checks if the user Inputs one in different various ways.
	     {
	    	 System.out.print("You chose Door ");
	    	 return 1;
	    	 //If the conditions are met, the text above prints and returns the number door.
	     }
	     
	     if(theInput.equals("two")||theInput.equals("Two")||theInput.equals("2"))
	     //This checks if the user Inputs two in different various ways.
	     {
	    	 System.out.print("You chose Door ");
	    	 return 2;
	    	 //If the conditions are met, the text above prints and returns the number door.
	     }
	     
	     if(theInput.equals("three")||theInput.equals("Three")||theInput.equals("3"))
	     //This checks if the user Inputs three in different various ways.
	     {
	    	 System.out.print("You chose Door ");
	    	 return 3;
	    	 //If the conditions are met, the text above prints and returns the number door.
	     }
	     
	     else
	     //Else if the above conditions are not met, this logic statement runs.
	     {
	    	 System.out.println("Run the code again.");
	    	 return 0;
	    	 //If the conditions are met, the text above prints signifying to run again cause they messed up.
	     }
		 
	 }
	 
	 
	 /*
	  * This method is to do when we need the wrong door to be revealed.
	  * It uses logic statements to make this happen.
	  * It is passed 2 variables that are passed above in the main for each.
	  * It uses a scanner to find the user input.
	  * It also uses math.random for when both user and win door are equal to select a random wrong door.
	  */
	 private static int showWrongDoor(int x, int y)
	 {
		 if(x==1 && y==2)
		 //This checks if the userdoor(x) is a certain and windoor(y) are the a different door.
		 //This is in order to find the wrong door and know which door to reveal.
		 {
			 System.out.print("The wrong Door is ");
			 return 3;
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 if(x==1 && y==3)
		 //This checks if the userdoor(x) is a certain and windoor(y) are the a different door.
	     //This is in order to find the wrong door and know which door to reveal.
		 {
			 System.out.print("The wrong Door is ");
			 return 2;
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 if(x==2 && y==1)
		 //This checks if the userdoor(x) is a certain and windoor(y) are the a different door.
		 //This is in order to find the wrong door and know which door to reveal.	
		 {
			 System.out.print("The wrong Door is ");
			 return 3;
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 if(x==2 && y==3)
		 //This checks if the userdoor(x) is a certain and windoor(y) are the a different door.
		 //This is in order to find the wrong door and know which door to reveal.
		 {
			 System.out.print("The wrong Door is ");
			 return 1;
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 if(x==3 && y==1)
		 //This checks if the userdoor(x) is a certain and windoor(y) are the a different door.
		 //This is in order to find the wrong door and know which door to reveal.
		 {
			 System.out.print("The wrong Door is ");
			 return 2;
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 if(x==3 && y==2)
		 //This checks if the userdoor(x) is a certain and windoor(y) are the a different door.
		 //This is in order to find the wrong door and know which door to reveal.
		 {
			 System.out.print("The wrong Door is ");
			 return 1;
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 if(x==1 && y==1)
		 //This checks if the userdoor(x) and windoor(y) are the same.
		 //This is in order to find the wrong door and know which door to reveal.
	     //We have to do this in a different way by using math.random.
		 {
			 System.out.print("The wrong Door is ");
			 return (int)(Math.random()*2+2);
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 
		 else
		 //Else if the above conditions are not met, this logic statement runs.
		 {
			 int randomNumber=(int)(Math.random()*2+4);
			 //This makes a new int variable that is a math.random class that is an int.
			 //This is for I can work when user door and win door are both the same.
			 //It either is a value of 4 or 5 which we can use below.
			 
			 if(x==2 && y==2 && randomNumber==4)
		     //This checks if the userdoor(x) and windoor(y) are the same.
			 //This is in order to find the wrong door and know which door to reveal.
			 //We have to do this in a different way by using math.random.
			 //If the random number int is 4 then this runs.
			 {
				 System.out.print("The wrong Door is ");
				 return 1;
				 //If the conditions are met, the text above prints and returns the number door.
			 }
			 
			 if(x==2 && y==2 && randomNumber==5)
			 //This checks if the userdoor(x) and windoor(y) are the same.
		     //This is in order to find the wrong door and know which door to reveal.
			 //We have to do this in a different way by using math.random.
		     //If the random number int is 5 then this runs.
			 {
				 System.out.print("The wrong Door is ");
				 return 3;
				 //If the conditions are met, the text above prints and returns the number door.
			 }
		 }
		 
		 if(x==3 && y==3)
		 //This checks if the userdoor(x) and windoor(y) are the same.
		 //This is in order to find the wrong door and know which door to reveal.
		 //We have to do this in a different way by using math.random.
		 {
			 System.out.print("The wrong Door is ");
			 return (int)(Math.random()*2+1);
			 //If the conditions are met, the text above prints and returns the number door.
		 }
		 
		 else
		 //Else if the above conditions are not met, this logic statement runs.
		 {
			 return 0;
			 //If the conditions are met, the text above prints and returns the number door.
		 }	 	
		 
	 }
	 
	 
	 /*
	  * This method is to do when the user says they want to swap or stay at their chosen door.
	  * It uses logic statements to make this happen.
	  * It is passed 3 variables that are passed above in the main for each.
	  * It uses a scanner to find the user input.
	  */
	 private static void swapOrStayAndReveal(int x, int y, int z)
	 {
		 System.out.println("Would you like to Swap your chosen door? ");
		 //This prints out the text above.
		 String theInputs = theReader.nextLine();
		 //This instatiates another  Scanner object called theInputs.
	     //It is operated with theReader and what ever word the user types in the console, it will output.
		  
		 if(theInputs.equals("Yes")||theInputs.equals("yes"))
		 //This checks if the user inputed a capital or lower case y or yes.
		{
			 
		if (y==x)
			//This checks to see if winDoor(y) is equal to userDoor(x).
		{
			System.out.println("You lose:(");
			//If the conditions are met, the text above prints.
		}
			 
			else if (z!=x)
			//This checks to see if revealedDoor(z) is equal to userDoor(x).
			{
				System.out.println("You win!");
			    //If the conditions are met, the text above prints.
			}
			
			else 
			//Else if the above conditions are not met, this logic statement runs.
			{
				System .out.println("You lose:(");
				//If the conditions are met, the text above prints.
			}
			
		}
		
		 else if(theInputs.equals("No")||theInputs.equals("no"))
		//This checks else if the user inputed a capital or lower case n or no.
		{
			if (y==x)
			//This checks to see if winDoor(y) is equal to userDoor(x).
			{
				System.out.println("You win!");
				//If the conditions are met, the text above prints.
			}
			else 
			//Else if the above conditions are not met, this logic statement runs.	
			{
				System.out.println("You lose:(");
				//Else if the above conditions are not met, this logic statement runs.
			}
		}
		 
		 
		else
		//Else if the above conditions are not met, this logic statement runs.
		{
			System.out.println("Please try again");
			//If the conditions are met, the text above prints.
		}
	 }
}
