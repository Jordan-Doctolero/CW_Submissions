import java.util.ArrayList;
//This imports the class so we can use ArrayLists.

/**
 * This is the second assignment with ArrayLists.
 * We are getting use to traversing through them and using its built in methods.
 * We make methods and understand how they work.
 * @Jordan_Doctolero
 */
public class ArrayToArrayLists {

	/*
	 * This is the main method where we will call all the methods we make below for the assignment.
	 */
	public static void main(String[] args) {
		//Task 1: 
		ArrayList<Integer> intArrList=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		intArrList.add(8);
		//This adds an element to the ArrayList.
		intArrList.add(2);
		//This adds an element to the ArrayList.
		intArrList.add(4);
		//This adds an element to the ArrayList.
		intArrList.add(1);
		//This adds an element to the ArrayList.
		System.out.println(checkFor4(intArrList));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		ArrayList<Integer> intArrLists=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		intArrLists.add(8);
		//This adds an element to the ArrayList.
		intArrLists.add(2);
		//This adds an element to the ArrayList.
		intArrLists.add(3);
		//This adds an element to the ArrayList.
		intArrLists.add(1);
		//This adds an element to the ArrayList.
		System.out.println(checkFor4(intArrLists));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		System.out.println();
		//This skips a line to make it look neater.
		
		//Task 2:
		ArrayList<Integer> intArrLister=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		intArrLister.add(8);
		//This adds an element to the ArrayList.
		intArrLister.add(5);
		//This adds an element to the ArrayList.
		intArrLister.add(9);
		//This adds an element to the ArrayList.
		intArrLister.add(5);
		//This adds an element to the ArrayList.
		intArrLister.add(2);
		//This adds an element to the ArrayList.
		intArrLister.add(4);
		//This adds an element to the ArrayList.
		intArrLister.add(1);
		//This adds an element to the ArrayList.
		intArrLister.add(5);
		//This adds an element to the ArrayList.
		ridAllFives(intArrLister);
		//This calls the method and is passed an ArrayList.
		System.out.println(intArrLister);
		//This prints said ArrayList.
		
		ArrayList<Integer> intArrListers=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		intArrListers.add(8);
		//This adds an element to the ArrayList.
		intArrListers.add(2);
		//This adds an element to the ArrayList.
		intArrListers.add(3);
		//This adds an element to the ArrayList.
		intArrListers.add(1);
		//This adds an element to the ArrayList.
		ridAllFives(intArrListers);
		//This calls the method and is passed an ArrayList.
		System.out.println(intArrListers);
		//This prints said ArrayList.
		
		System.out.println();
		//This skips a line to make it look neater.
		
		//Task 3:
		ArrayList<Integer> numssss=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		numssss.add(8);
		//This adds an element to the ArrayList.
		numssss.add(5);
		//This adds an element to the ArrayList.
		numssss.add(9);
		//This adds an element to the ArrayList.
		numssss.add(5);
		//This adds an element to the ArrayList.
		numssss.add(2);
		//This adds an element to the ArrayList.
		numssss.add(4);
		//This adds an element to the ArrayList.
		numssss.add(1);
		//This adds an element to the ArrayList.
		numssss.add(5);
		//This adds an element to the ArrayList.
		System.out.println(bubbleSort(numssss));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		nums.add(3);
		//This adds an element to the ArrayList.
		nums.add(5);
		//This adds an element to the ArrayList.
		nums.add(2);
		//This adds an element to the ArrayList.
		nums.add(100);
		//This adds an element to the ArrayList.
		nums.add(-63);
		//This adds an element to the ArrayList.
		nums.add(4);
		//This adds an element to the ArrayList.
		nums.add(1);
		//This adds an element to the ArrayList.
		nums.add(0);
		//This adds an element to the ArrayList.
		System.out.println(bubbleSort(nums));
		//This prints out the method that is passed an ArrayList and skips a line.
	}
	
	/*
	 * Task 1: Create a method checkFor4() that is passed an ArrayList.
	 * Returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	 */
	public static int checkFor4(ArrayList<Integer> nums)
	{
	     for (int i=0;i<nums.size();i++) 
	     //While the traverser is less than the size of the ArrayList, this runs.
	     {
        	if (nums.get(i)==4) 
        	//If the number at the index using .get is equal to 4, this runs.
             	{
                     return i; 
                     //This returns the index of the first 4.
            	}
        }
        	return -1; 
       		//Else it returns -1.
	
	}
	
	/*
	 * Task 2: Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. 
	 * The ArrayList will have any 5’s deleted from nums.
	 * Ex: subtract5FromAll4( {5, 5, 0, 8, 5, 20})-------turns nums into----->{0, 8, 20}
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
	     for (int i=0;i<nums.size();i++) 
	     //While the traverser is less than the size of the ArrayList, this runs.
	     {
             	if (nums.get(i)==5) 
           	//If the number at the index using .get is equal to 5, this runs.
            	{
            	     nums.remove(i);
            	     //This removes the number at the index of i using .remove.
            	}
             }
	}
	
	/*
	 * Task 3: Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
	 */
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nums)
	{
		int counter=3;
		//This declares an int variable and sets it equal to 3.
		while(counter!=0)
		//While our counter does not equal 0, this will run.
		{
			counter=0;
			//This resets our counter variable to 0.
			int temp=0;
			//This declares a temp int variable and sets it equal to 0.
			for(int i=0;i<nums.size()-1;i++)
			//This foor loop goes through the array it is passed until the traverser is greater than the arraylist size-1.
			{
				if(nums.get(i)>nums.get(i+1))
				//If the num that gets from the ArrayList at the index is greater than the num that gets from the ArrayList at the index+1, this will run.
				{
				     temp=nums.get(i);
				     //This sets our temp variable equal to the number at the index by using .get.
				     nums.set(i, nums.get(i + 1));
				     //This sets the number at that index to the number at the next position or index+1 using .get.
				     nums.set(i+1, temp);
				     //This sets the number at the next position or index+1 equal to what we set the temp equal to in the first part.
				     counter++;
				     //This adds 1 to the counter.
				}
			}	
		}
		return nums;
		//This returns the arrayList.
	}
}
