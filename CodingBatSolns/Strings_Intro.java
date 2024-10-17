/**
 * This assignment we imported a Scanner object that we will use to input a string/word.
 * It will then call on methods I created outside the main to locate and find output values.
 * It will then output those values in the console.
 * You are able to adapt and change the string/word just by typing in the scanner.
 * @Jordan_Doctolero
 */

import java.util.Scanner;
//This imports a Scanner into my class.

/**
 * This is where all the action happens.
 * The class calls all the methods under the main and goes in order to do each code.
 * You will be able to input a work into the Scanner.
 * Then the Scanner will output data that we wanted it to output.
 */
public class Strings_Intro {
	
	public static void main(String[] args) {
		System.out.println("Input a word below:");
		//This will print out the above text show the useer knows what to do.
		
		//Task 1(Start):
		Scanner myReader=new Scanner(System.in);
		//This instatiates a new Scanner object into my class. 
		//Basically this will make the scanner work and I can type inside the console.
		
		String myWord = new String( myReader.next() );
		//This instatiates a new object called myWord.
		//It is operated with myReader and what ever word I type in the console, it will output.
		
		//Task 2:
		printSecondAndLastLetter( myWord );
		//This calls the method I made below the main method and does what I made it do.
		//I passed it a string with myWord.
		//It calls the myWord object I used to output it in the console.
		
		//Task 3:
		System.out.println("Index of 'e': " + findTheE(myWord));
		//This prints out the text then adds on and calls the method I mad below.
		//It is passed the myWord object again and uses it to print the output of the method below.
		
		//Task 4:
		System.out.println("The length of the word: " + getLength(myWord));
		//This prints out the text then adds on and calls the method I mad below.
		//It is passed the myWord object again and uses it to print the output of the method below.
		
		//Task 5:
		printFirstAndLastThree(myWord);
		//This calls the method I made below the main method and does what I made it do.
		//I passed it a string with myWord.
		//It calls the myWord object I used to output it in the console.
		
		//Task 1(End):
		myReader.close();
		//This closes the Scanner object I imported into the class.
		
		}
	
		/**
		 * This is a method that is passed a String.
		 * It will print the second and last letters of a string word.
		 */
		public static void printSecondAndLastLetter(String str)
		{
			System.out.println("Second character: " + str.charAt(1));
			//This prints out the text then it adds on a string that will be passed in the Scanner.
			//It then locates the character at the index of 1 which will be printing the Second Character.
		
			System.out.println("Last character: " + str.charAt(str.length() - 1));
			//This prints out the text then it adds on a string that will be passed in the Scanner.
			//It then finds the index of the last character by finding the length of the strength that is passed.
			//It then will subtract 1 from the length to find the last Character.
        
		}

		/**
		 * This is a method that is passed a String.
		 * It will locate and return the index of a letter e if it is including in a string.
		 * If not, it will return a -1 to show there is no letter e in the string.
		 */
		public static int findTheE(String str)
		{
			return(str.indexOf('e'));
			//This finds the index of e of the string that I passed it.
			//If it finds the e, it will return the index.
			//If it doesn't finds the e, it will return a -1.
		
		}

		/**
		 * This is a method that is passed a String.
		 * It will return the length of a string word. 
		 */
		public static int getLength(String str)
		{
			return(str.length());
			//This finds the length of the string that I passed it.
			//It will then return its length.
		
		}
	
		/**
		 * This is a method that is passed a String.
		 * It will print the first and last three letters of a string word.
		 */
		public static void printFirstAndLastThree(String str)
		{
		System.out.println("The first three leters: " + str.substring(0,3));
		//This prints out the text then it adds on a string that will be passed in the Scanner.
		//It is a substring so it only will print out part of the string.
		//The 0-3 index prints out the first three letters of the string passed.
		
        System.out.println("The last three leters: " + str.substring(str.length()-3, str.length()));
        //This prints out the text then it adds on a string that will be passed in the Scanner.
        //It is a substring so it only will print out part of the string.
      	//The first part identifies the length of the string and subtracts 3 then it goes through
        //the rest of the string length.
        //This prints the last three letters of the string.
        
		}
	}
