/**
 * @Jordan_Doctolero
 * This is a homework/classwork assignment.
 * This is to practice loops specifically for loops.
 * We use for loops and if statements to create specific conditions for it to run.
 * It is 3 different problems we had to solve.
 */
public class Loops_Intro_Practice {

	/*
	 * This is the main method where all the method I created below will be called.
	 * It will be passed parameters in order to run and execute what we want it to do.
	 */
	public static void main(String[] args) {
	 //Task 1:
	 System.out.println(countLetters("bbb", 'b')); 
	 //This calls the countLetters method and runs it with the passed parameters. Then, it skips a line.
	 System.out.println(countLetters("bbss", 's'));
	 //This calls the countLetters method and runs it with the passed parameters. Then, it skips a line.
	 System.out.println();
	 //This skips a line to make it neater.
	
	 //Task 2:
	 System.out.println(getFactorial(5));
	 //This calls the getFactorial method and runs with the passed parameters. Then, it skips a line.
	 System.out.println();
	 //This skips a line to make it neater.
	 
	 //Task 3:
	 System.out.println(getIfRepeats("accde"));
	 //This calls the getIfRepeats method and runs with the passed parameters. Then, it skips a line.
	 System.out.println();
	 //This skips a line to make it neater.
	
	}
	
	//Task 1:
	
	/*
	 * Create a method countLetters() that is passed a String and a char.
	 * It returns how many times that passed char shows up in the passed String. 
	 */
	public static int countLetters(String str, char letter)
	{
	   int count=0;
	   //This declares an in variable.
	   for(int i=0; i<str.length(); i++)
	   //This is the loop that declares i as an int to start as 0.
	   //If i is less than the string length, the code will run.
	   //It will come back up to the update and add 1.
	   //The for will run until i is greater than or equal to the string length.
	   {
		   if(str.charAt(i)==letter)
		   //If the character of a string at the index of whatever I is
		   //AND it is equal the character passed, it will run.
		   {
			   count++;
			   //It adds 1 to count.
		   }
	   }
	   return count;
	   //This returns whatever the output is after the loop condition.
	   //OR it returns the initial amount of count if the conditions above are not met.
    }
	
    //Task 2:
	
	/*
	 * Create a method getFactorial() that is passed an int.
	 * It returns the factorial of that int (a factorial is a number multiplied by each number before it. 
	 */
	public static int getFactorial(int x)
	{
	  int factorial = 1;
	  //This declares an in variable.
      for (int i = 1; i <= x; i++) 
      //This is the loop that declares i as an int to start as 1.
   	  //If i is less than or equal to the passed int, it will run.
   	  //It will come back up to the update and add 1.
   	  //The for will run until i is greater than the string length.
      {
         factorial *= i;
         //The above for runs and then after it will multiply the factorial number by the new i.
      } 
         return factorial;
         //This returns whatever the output is after the loop condition.
  	     //OR it returns the initial amount of count if the conditions above are not met.
    }
	
	//Task 3:
	
	/*
	 * Create a method getIfRepeats() that will return true if the passed String.
	 * Has two of the same letter next to each other, and prints false if not.
	 */
	public static boolean getIfRepeats(String str)
	{
	  for (int i = 0; i < str.length() - 1; i++) 
	  //This is the loop that declares i as an int to start as 0.
      //If i is less than the string length, the code will run.
      //It will come back up to the update and add 1.
	  //The for will run until i is greater than or equal to the string length.
	  {
		 if (str.charAt(i) == str.charAt(i + 1)) 
		 //If the character of the string at the index of i after the update occurs
		 //AND the character of the string at the index of i after the update occurs +1
	     //ARE the same, it will run.
	  {
        return true;
        //This returns true if the conditions above from the if and loop are met.
      }
     
	}
	    return false;
	    //This returns false in any other case.
   }
}
