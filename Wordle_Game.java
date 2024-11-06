/**
 * This is the Worlde_Game class.
 * This is where any player can play my own Wordle game.
 * This game we use an imported Scanner object.
 * The player will use the Scanner to input a string/word.
 * Then by using logic statements, it will locate and find where 
 * the characters are in the word and output the correct notation.
 * ? for the character is in the word but not in the right spot
 * X for the character is not in the word at all
 * And the character itself for it being in the right spot.
 * This will only be the first attempt for now.
 * Pre conditions include: 5 letter word and no repeating letters
 * @Jordan_Doctolero
 */

import java.util.Scanner;
//This imports a Scanner into my class.

public class Wordle_Game {
	
	/*
	 * This is where all the action happens.
	 * The class calls all playGame method under the main and goes in order to do each code.
	 * You will be able to input a word into a Scanner.
	 * The Scanner will output data that will show if the letter is right, not in the word, or in the wrong place.
	 */
	public static void main(String[] args) {
		String soln = new String ("basic");
	    //This instantiates a new String word called soln.
		//This is the word the Worlde user will have to guess.
		
		System.out.println("Welcome to Wordle! ");
		//This will print out the above text so the knows what to do.
		
		playGame(soln);
		//This calls the method below to run and it is passed the string I insatiated above.
		//This starts the game where the user has to guess the word hence Wordle.
		
	}
	
	/*
	 * This method is passed a string soln.
	 * This soln word is passed above in the main which is declared a String variable for the actual game word.
	 * It uses a scanner object to take the player guess and find if the letters are in the right spot,
	 * in the word but not the right spot, or not in the word at all.
	 * It uses logic statements to compute which output to print for the user.
	 * For now, it only runs the first attempt.
	 */
	private static void playGame(String soln)
	{
		Scanner gameReader=new Scanner(System.in);
		//This instatiates a new Scanner object into my class. 
		//Basically this will make the scanner work and the user can type inside the console.
		
		System.out.println("Make a 5 letter word guess that has no repeating letters: ");
		//This will print out the above text so the knows what to do.
		
		String playerGuess = new String (gameReader.next());
		//This instatiates a new Scanner object called playerGuess.
		//It is operated with gameReader and what ever word the user types in the console, it will output.
		
		System.out.println();
		//This skips a line to make it look neat.
		
		if(playerGuess.length()!=soln.length()
		 ||(playerGuess.charAt(0)==playerGuess.charAt(1))
		 ||(playerGuess.charAt(0)==playerGuess.charAt(2))
		 ||(playerGuess.charAt(0)==playerGuess.charAt(3))
		 ||(playerGuess.charAt(0)==playerGuess.charAt(4))
		 ||(playerGuess.charAt(1)==playerGuess.charAt(0))
		 ||(playerGuess.charAt(1)==playerGuess.charAt(2))
		 ||(playerGuess.charAt(1)==playerGuess.charAt(3))
		 ||(playerGuess.charAt(1)==playerGuess.charAt(4))
		 ||(playerGuess.charAt(2)==playerGuess.charAt(0))
		 ||(playerGuess.charAt(2)==playerGuess.charAt(1))
		 ||(playerGuess.charAt(2)==playerGuess.charAt(3))
		 ||(playerGuess.charAt(2)==playerGuess.charAt(4))
		 ||(playerGuess.charAt(3)==playerGuess.charAt(0))
		 ||(playerGuess.charAt(3)==playerGuess.charAt(1))
		 ||(playerGuess.charAt(3)==playerGuess.charAt(2))
		 ||(playerGuess.charAt(3)==playerGuess.charAt(4))
		 ||(playerGuess.charAt(4)==playerGuess.charAt(0))
		 ||(playerGuess.charAt(4)==playerGuess.charAt(1))
		 ||(playerGuess.charAt(4)==playerGuess.charAt(2))
		 ||(playerGuess.charAt(4)==playerGuess.charAt(3))
		)
		//This checks if the length of the word that the player guessed does not 
		//equal the actual win condition word length.
		//This also checks if there are any repeating characters in the players guess.
		//In this case, we do not want any repeating characters.
	     {
			System.out.println("Please enter a 5 letter word that has no reapting letters!");
			System.out.print("Disregard this following input and try again: ");
	    	//If the conditions are met, the text above prints.
	     }
		
		if(playerGuess.charAt(0)==soln.charAt(0))
		//This checks if the the character at the index of the play guessed word
		//equals the actual win condition character at that index.
		{
			System.out.print(soln.charAt(0));
			//If the conditions are met, the text above prints.
			//This prints the letter at the index.
		}
		
		else if(playerGuess.charAt(0)==soln.charAt(1)
		 ||(playerGuess.charAt(0)==soln.charAt(2))
		 ||(playerGuess.charAt(0)==soln.charAt(3))
		 ||(playerGuess.charAt(0)==soln.charAt(4))
		)
		//If all the above if's are false, it goes to this.
		//This checks if a single character at that index is equal to the win condition word character
		//at different indices.
		//This is to check if the character is in the word but not right spot.
	    {
	    	System.out.print("?");
	    	//If the conditions are met, the text above prints.
	    	//This means the letter is in the word but not the right spot.
	    }

		else
		//Else if the above conditions are not met, this logic statement runs.
		{
			System.out.print(("X"));
			//If the conditions are met, the text above prints.
			//This means the letter is not in the word at all.
		}
		
		if(playerGuess.charAt(1)==soln.charAt(1))
		//This checks if the the character at the index of the play guessed word
		//equals the actual win condition character at that index.
	     {
	    	System.out.print(soln.charAt(1));
			//If the conditions are met, the text above prints.
	    	//This prints the letter at the index.
	     }
		
		else if(playerGuess.charAt(1)==soln.charAt(0)
		 ||(playerGuess.charAt(1)==soln.charAt(2))
		 ||(playerGuess.charAt(1)==soln.charAt(3))
		 ||(playerGuess.charAt(1)==soln.charAt(4))
		)
		//If all the above if's are false, it goes to this.
		//This checks if a single character at that index is equal to the win condition word character
		//at different indices.
		//This is to check if the character is in the word but not right spot.
		{
			System.out.print("?"); 	 
			//If the conditions are met, the text above prints.
			//This means the letter is in the word but not the right spot.
		}

		else
		//Else if the above conditions are not met, this logic statement runs.
		{
			System.out.print(("X"));
			//If the conditions are met, the text above prints.
			//This means the letter is not in the word at all.
		}
		
		if(playerGuess.charAt(2)==soln.charAt(2))
		//This checks if the the character at the index of the play guessed word
		//equals the actual win condition character at that index.
	     {
	    	System.out.print(soln.charAt(2)); 
	    	//If the conditions are met, the text above prints.
	    	//This prints the letter at the index.
	     }
		
		else if(playerGuess.charAt(2)==soln.charAt(0)
		 ||(playerGuess.charAt(2)==soln.charAt(1))
		 ||(playerGuess.charAt(2)==soln.charAt(3))
		 ||(playerGuess.charAt(2)==soln.charAt(4))
		 )
		//If all the above if's are false, it goes to this.
		//This checks if a single character at that index is equal to the win condition word character
		//at different indices.
		//This is to check if the character is in the word but not right spot.
		 {
			System.out.print("?"); 	
			//If the conditions are met, the text above prints.
			//This means the letter is in the word but not the right spot.
		 }

		else
		//Else if the above conditions are not met, this logic statement runs.
		{
			System.out.print(("X"));
			//If the conditions are met, the text above prints.
			//This means the letter is not in the word at all.
		}
		
		if(playerGuess.charAt(3)==soln.charAt(3))
		//This checks if the the character at the index of the play guessed word
		//equals the actual win condition character at that index.
	     {
	    	System.out.print(soln.charAt(3)); 
	    	//If the conditions are met, the text above prints.
	    	//This prints the letter at the index.
	     }
		
		else if(playerGuess.charAt(3)==soln.charAt(0)
		 ||(playerGuess.charAt(3)==soln.charAt(1))
		 ||(playerGuess.charAt(3)==soln.charAt(2))
		 ||(playerGuess.charAt(3)==soln.charAt(4))
		 )
		//If all the above if's are false, it goes to this.
		//This checks if a single character at that index is equal to the win condition word character
		//at different indices.
		//This is to check if the character is in the word but not right spot.
		 {
			System.out.print("?"); 	 
			//If the conditions are met, the text above prints.
			//This means the letter is in the word but not the right spot.
		 }

		else
		//Else if the above conditions are not met, this logic statement runs.
		{
			System.out.print(("X"));
			//If the conditions are met, the text above prints.
			//This means the letter is not in the word at all.
		}
		
		if(playerGuess.charAt(4)==soln.charAt(4))
		//This checks if the the character at the index of the play guessed word
		//equals the actual win condition character at that index.
	     {
	    	System.out.println(soln.charAt(4)); 
	    	//If the conditions are met, the text above prints.
	    	//This prints the letter at the index.
	     }
		
		else if(playerGuess.charAt(4)==soln.charAt(0)
		 ||(playerGuess.charAt(4)==soln.charAt(1))
		 ||(playerGuess.charAt(4)==soln.charAt(2))
		 ||(playerGuess.charAt(4)==soln.charAt(3))
		 )
		//If all the above if's are false, it goes to this.
		//This checks if a single character at that index is equal to the win condition word character
		//at different indices.
		//This is to check if the character is in the word but not right spot.
		 {
			System.out.print("?"); 
			//If the conditions are met, the text above prints.
			//This means the letter is in the word but not the right spot.
		 }

		else
		//Else if the above conditions are not met, this logic statement runs.
		{
			System.out.print(("X"));
			//If the conditions are met, the text above prints.
			//This means the letter is not in the word at all.
		}
		
		if(playerGuess.equals(soln))
		//This checks if the the player guessed word is equal to the soln string that is passed
		//which is the win condition word that is instatiated above.
	     {
	    	System.out.print("You win!");
	    	//If the conditions are met, the text above prints.
	    	//This signifies the user has guessed the word and won Wordle.
	     }
		
		gameReader.close();
		//This closes the Scanner object I imported into the class.
	}

}
