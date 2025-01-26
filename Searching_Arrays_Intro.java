/**
 * This is the Searching Arrays Intro Assignment.
 * This is a bit late because I am sick and basically it is hard for me to even get up but I still want to get this done.
 * We search through Arrays to check and count for 4's.
 * @Jordan_Doctolero
 */
public class Searching_Arrays_Intro {

	/*
	 * This is the main method.
	 * This is where I will be calling all the methods I had to make for the different problems on the assignment.
	 */
	public static void main(String[] args) {
	int[] array1= {3,4,4};
	//This declares an int array.
	int[] array2= {1,2,3};
	//This declares an int array.
	int[] array3= {4,4,4,4};
	//This declares an int array.
	//Task 1:To check Task 1
	System.out.println(checkFor4(array1));
	//This calls the method and is passed the first array and prints.
	System.out.println(checkFor4(array2));
	//This calls the method and is passed the second array and prints.
	System.out.println();
	//This skips a line to make it look neater.
	
	//Task 2:To check Task 2
	System.out.println(countFor4(array1));
	//This calls the method and is passed the first array and prints.
	System.out.println(countFor4(array2));
	//This calls the method and is passed the second array and prints.
	System.out.println();
	//This skips a line to make it look neater.
	
	//Task 3:To check Task 3
	System.out.println(checkForFour4(array1));
	//This calls the method and is passed the first array and prints.
	System.out.println(checkForFour4(array2));
	//This calls the method and is passed the second array and prints.
	System.out.println(checkForFour4(array3));
	//This calls the method and is passed the third array and prints.

	}
	
	/*
	 * Task 1: Create a method checkFor4() that is passed an int array and returns true if that array has a 4 
	 * and false if that array has no 4's. 
	 */
	public static boolean checkFor4(int[]array)
	{
		for(int i=0;i<array.length;i++)
		//This for loop will loop until the iter is equal to the array length.
		{
			if(array[i]==4)
			//If the element of the array is equal to 4, this runs.
			{
				return true;
				//Returns true if the if statement is ran.
			}
		}
		
		return false;
		//If the for loop is ran and it does not have a 4, it will return false.
	}
	
	/*
	 * Task 2:Create a method countFor4() that is passed an int array and returns how many times 4 shows up in the array. 
	 */
	public static int countFor4(int[]array)
	{
		int count=0;
		//This declares an int variable declared to start as 0.
		for(int i=0;i<array.length;i++)
		//This for loop will loop until the iter is equal to the array length.
		{
			if(array[i]==4)
			//If the element of the array is equal to 4, this runs.
			{
				count++;
				//It adds one to count.
			}
		}
		
		return count;
		//it returns count to show how many 4's there are in the array
	}
	
	/*
	 * Task 3:Create a method checkForFour4() that is passed an int array and return true if the array has exactly four 4's in it. 
	 */
	public static boolean checkForFour4(int[] array)
	{
		int count=0;
		//This declares an int variable declared to start as 0.
		for(int i=0;i<array.length;i++)
		//This for loop will loop until the iter is equal to the array length.
		{
			if(array[i]==4)
			//If the element of the array is equal to 4, this runs.
			{
				count++;
				//It adds one to count.
					
			}
		}
		if(count==4)
		//If count is equal to 4, this runs.
		{
			return true;
			//It will return true.
		}
		
		return false;
		//If the for loop is ran and it does not have four 4's, it will return false.
	}

}
