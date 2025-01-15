/**
 * This is the Arrays Intro Assignment.
 * We are making different Arrays to get used to it.
 * We start to understand what Arrays do.
 * @Jordan_Doctolero
 */

public class Arrays_Intro {

	/*
	 * This is the method where we will make the actual arrays.
	 * These wll be from the assignment of numbers 1-7.
	 */
	public static void main(String[] args) {
		
		/*
		 * Task 1:
		 * Create an empty array that is meant to represent doubles. Name it doubArr.
		 * Repeat this for arrays that represent ints, booleans, String objects, and Circle objects. 
		 */
		
		double [] doubArr;
		//This is a double Array with that is empty.
		int [] intArr;
		//This is an int Array with that is empty.
		boolean [] booleanArr;
		//This is a boolean Array with that is empty.
		String [] stringArr;
		//This is a string object Array with that is empty.
		Circle [] circleArr;
		//This is a circle object Array with that is empty.
		
		/*
		 * Task 2: 
		 * Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.
		 */
		
		int[] values= {7, -12, 88, -88, 0, 5, 2000};
		//This is an int array that is set saved to 7 int numbers.
		
		/*
		 * Task 3: 
		 * Create an array that represents 5 String objects with default values. 
		 * Name the array fruitsArr. In the comment for this task, state what each element's default value is. 
		 * State what the default value for ints, doubles, booleans, and any reference data type is as well. 
		 */
		
		String[] fruitsArr=new String[5];
		//This is a String array that deos not have any values but it has how many elements that it will print, which is 5.
		//Each's string element of this array has a default value of null.
		//The default values for ints is 0 and doubles are 0.0.
		//The default values for booleans are false.
		//The default values for any reference data type is null.
		
		/*
		 * Task 4: 
		 * Change the 2nd element in fruitsArr to "Bapple" .
		 */
		
		fruitsArr[1]="Bapple";
		//This calls the the second element because of index in fruitsArr and we change it to Bapple.
		
		/*
		 * Task 5:
		 * Change the last element in fruitsArr to "Zanana" . Accomplish this without typing the number "4" 
		 * and instead accessing the arrays length.
		 */
		
		fruitsArr[fruitsArr.length-1]="Zanana";
		//This calls the the last element by accesing the length and subtracting one in fruitsArr and we change it to Zanna.
		System.out.println("Task 5:");
		//This prints out the text.
		System.out.println(fruitsArr[4]);
		//I use this to test to see if it works.
		
		/*
		 * Task 6:
		 * To verify you did number 4 correctly, print out the second element of fruitsArr.
		 */
		
		System.out.println("");
		//This skips a line to make it look neater.
		System.out.println("Task 6:");
		//This prints out the text.
		System.out.println(fruitsArr[1]);
		//I use this to test to see if number 4 works.
		
		/*
		 * Task 7:
		 * Create a loop that one by one prints out each element in fruitsArr.
		 */
		
		System.out.println("");
		//This skips a line to make it look neater.
		System.out.println("Task 7:");
		//This prints out the text.
		for(int i=0; i<fruitsArr.length;i++)
		//This is a for loop that goes through the length of the array.
		{
			System.out.println(fruitsArr[i]);
			//This prints out each element one by one.
		}
		
	}
}
