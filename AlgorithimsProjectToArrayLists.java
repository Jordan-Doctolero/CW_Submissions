import java.util.ArrayList;
//This imports the class so we can use ArrayLists.

/**
 * This is the Converting arr algs to ArrayList algs Project Assignment.
 * We use the base of the Algorithims project.
 * We then make them work for ArrayLists.
 * It combines all the differnet coding techniques we've learned.
 * @Jordan_Doctolero
 */
public class AlgorithimsProjectToArrayLists {

	/*
	 * This is the main method.
	 * This is where I will be calling all the different methods I made for each problem to solve.
	 * It will have different arrays and different tasks.
	 * ALL USING ARRAYLISTS.
	 */
	public static void main(String[] args) {
		//Task 1:
		ArrayList<Integer> smallNum=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		smallNum.add(9);
		//This adds an element to the ArrayList.
		smallNum.add(2);
		//This adds an element to the ArrayList.
		smallNum.add(8);
		//This adds an element to the ArrayList.
		smallNum.add(3);
		//This adds an element to the ArrayList.
		System.out.println(smallestNum(smallNum));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		ArrayList<Integer> smallNums=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		smallNums.add(3);
		//This adds an element to the ArrayList.
		smallNums.add(8);
		//This adds an element to the ArrayList.
		smallNums.add(5);
		//This adds an element to the ArrayList.
		smallNums.add(4);
		//This adds an element to the ArrayList.
		smallNums.add(1);
		//This adds an element to the ArrayList.
		System.out.println(smallestNum(smallNums));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		System.out.println();
		//This skips a line to make it look neater.
		
		//Task 2:
		ArrayList<Integer> smallIndex=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		smallIndex.add(3);
		//This adds an element to the ArrayList.
		smallIndex.add(6);
		//This adds an element to the ArrayList.
		smallIndex.add(1);
		//This adds an element to the ArrayList.
		System.out.println(smallestIndex(smallIndex));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		ArrayList<Integer> smallIndexs=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		smallIndexs.add(2);
		//This adds an element to the ArrayList.
		smallIndexs.add(1);
		//This adds an element to the ArrayList.
		smallIndexs.add(4);
		//This adds an element to the ArrayList.
		System.out.println(smallestNum(smallIndexs));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		System.out.println();
		//This skips a line to make it look neater.
		
		//Task 3: 
		ArrayList<Integer> theAverage=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		theAverage.add(3);
		//This adds an element to the ArrayList.
		theAverage.add(3);
		//This adds an element to the ArrayList.
		theAverage.add(3);
		//This adds an element to the ArrayList.
		System.out.println(theAverage(theAverage));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		ArrayList<Integer> theAverages=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		theAverages.add(1);
		//This adds an element to the ArrayList.
		theAverages.add(2);
		//This adds an element to the ArrayList.
		theAverages.add(3);
		//This adds an element to the ArrayList.
		System.out.println(theAverage(theAverages));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		System.out.println();
		//This skips a line to make it look neater.
 		
 		//Task 4:
		ArrayList<Integer> evenOrOdd=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		evenOrOdd.add(2);
		//This adds an element to the ArrayList.
		evenOrOdd.add(4);
		//This adds an element to the ArrayList.
		evenOrOdd.add(6);
		//This adds an element to the ArrayList.
		evenOrOdd.add(8);
		//This adds an element to the ArrayList.
		System.out.println(evenOdd(evenOrOdd));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
		ArrayList<Integer> evenOrOdds=new ArrayList<Integer>();
		//This instaitates a new Integer ArrayList.
		evenOrOdds.add(2);
		//This adds an element to the ArrayList.
		evenOrOdds.add(3);
		//This adds an element to the ArrayList.
		evenOrOdds.add(4);
		//This adds an element to the ArrayList.
		evenOrOdds.add(5);
		//This adds an element to the ArrayList.
		evenOrOdds.add(6);
		//This adds an element to the ArrayList.
		System.out.println(evenOdd(evenOrOdds));
		//This calls and prints out the method that is passed an ArrayList and skips a line.
		
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 5:
 		ArrayList<Integer> isFive=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		isFive.add(4);
 		//This adds an element to the ArrayList.
 		isFive.add(3);
 		//This adds an element to the ArrayList.
 		isFive.add(5);
 		//This adds an element to the ArrayList.
 		isFive.add(5);
 		//This adds an element to the ArrayList.
 		isFive.add(1);
 		//This adds an element to the ArrayList.
 		replaceConsecutiveFives(isFive);
 		//This calls the method and passes it an int array.
 		System.out.println(isFive);
 		//This prints by calling the method then skips a line to make it look neat.
 		
 		ArrayList<Integer> isFives=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		isFives.add(3);
 		//This adds an element to the ArrayList.
 		isFives.add(4);
 		//This adds an element to the ArrayList.
 		isFives.add(5);
 		//This adds an element to the ArrayList.
 		isFives.add(6);
 		//This adds an element to the ArrayList.
 		isFives.add(7);
 		//This adds an element to the ArrayList.
 		isFives.add(8);
 		//This adds an element to the ArrayList.
 		replaceConsecutiveFives(isFives);
 		//This calls the method and passes it an int array.
 		System.out.println(isFives);
 		//This prints by calling the method then skips a line to make it look neat.

 		System.out.println();
 		//This skips a line to make it look neater.

 		//Task 6:
 		ArrayList<Integer> three=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		three.add(6);
 		//This adds an element to the ArrayList.
 		three.add(4);
 		//This adds an element to the ArrayList.
 		three.add(7);
 		//This adds an element to the ArrayList.
 		three.add(7);
 		//This adds an element to the ArrayList.
 		three.add(7);
 		//This adds an element to the ArrayList.
 		System.out.println(threeRepeat(three,7));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		
 		ArrayList<Integer> threes=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		threes.add(3);
 		//This adds an element to the ArrayList.
 		threes.add(6);
 		//This adds an element to the ArrayList.
 		threes.add(3);
 		//This adds an element to the ArrayList.
 		threes.add(8);
 		//This adds an element to the ArrayList.
 		threes.add(1);
 		//This adds an element to the ArrayList.
 		System.out.println(threeRepeat(threes,3));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 7:
 		ArrayList<Integer> totalNum=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		totalNum.add(5);
 		//This adds an element to the ArrayList.
 		totalNum.add(5);
 		//This adds an element to the ArrayList.
 		totalNum.add(5);
 		//This adds an element to the ArrayList.
 		totalNum.add(3);
 		//This adds an element to the ArrayList.
 		totalNum.add(4);
 		//This adds an element to the ArrayList.
 		totalNum.add(5);
 		//This adds an element to the ArrayList.
 		totalNum.add(1);
 		//This adds an element to the ArrayList.
 		totalNum.add(5);
 		//This adds an element to the ArrayList.
 		totalNum.add(2);
 		//This adds an element to the ArrayList.
 		totalNum.add(5);
 		//This adds an element to the ArrayList.
 		System.out.println(intSearcher(totalNum,5));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		
 		ArrayList<Integer> totalNums=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		totalNums.add(1);
 		//This adds an element to the ArrayList.
 		totalNums.add(4);
 		//This adds an element to the ArrayList.
 		totalNums.add(6);
 		//This adds an element to the ArrayList.
 		totalNums.add(9);
 		//This adds an element to the ArrayList.
 		totalNums.add(1);
 		//This adds an element to the ArrayList.
 		totalNums.add(0);
 		//This adds an element to the ArrayList.
 		totalNums.add(3);
 		//This adds an element to the ArrayList.
 		totalNums.add(6);
 		//This adds an element to the ArrayList.
 		totalNums.add(1);
 		//This adds an element to the ArrayList.
 		System.out.println(intSearcher(totalNums,1));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 8:
 		ArrayList<Integer> alterArr=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		alterArr.add(9);
 		//This adds an element to the ArrayList.
 		alterArr.add(8);
 		//This adds an element to the ArrayList.
 		alterArr.add(7);
 		//This adds an element to the ArrayList.
 		alterArr.add(6);
 		//This adds an element to the ArrayList.
 		alterArray(alterArr);
 		//This calls the method and passes it an int array.
 		System.out.println(alterArr);
 		//This prints by calling the method then skips a line to make it look neat.
 		
 		ArrayList<Integer> alterArrs=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		alterArrs.add(4);
 		//This adds an element to the ArrayList.
 		alterArrs.add(3);
 		//This adds an element to the ArrayList.
 		alterArrs.add(2);
 		//This adds an element to the ArrayList.
 		alterArrs.add(1);
 		//This adds an element to the ArrayList.
 		alterArray(alterArrs);
 		//This calls the method and passes it an int array.
 		System.out.println(alterArrs);
 		//This prints by calling the method then skips a line to make it look neat.
 		
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 9:
 		ArrayList<Integer> shift=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		shift.add(1);
 		//This adds an element to the ArrayList.
 		shift.add(2);
 		//This adds an element to the ArrayList.
 		shift.add(3);
 		//This adds an element to the ArrayList.
 		shiftRight(shift);
 		//This calls the method and passes it an int array.
 		System.out.println(shift);
 		//This prints by calling the method then skips a line to make it look neat.
 		
 		ArrayList<Integer> shifter=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		shifter.add(5);
 		//This adds an element to the ArrayList.
 		shifter.add(4);
 		//This adds an element to the ArrayList.
 		shifter.add(3);
 		//This adds an element to the ArrayList.
 		shiftRight(shifter);
 		//This calls the method and passes it an int array.
 		System.out.println(shifter);
 		//This prints by calling the method then skips a line to make it look neat.
 		
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 10:
 		ArrayList<Integer> arr=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		arr.add(9);
 		//This adds an element to the ArrayList.
 		arr.add(2);
 		//This adds an element to the ArrayList.
 		arr.add(6);
 		//This adds an element to the ArrayList.
 		arr.add(2);
 		//This adds an element to the ArrayList.
 		insertionSort(arr);
 		//This calls the method and passes it an int array.
 		System.out.println(arr);
 		//This prints by calling the method then skips a line to make it look neat.
 		
 		ArrayList<Integer> arrs=new ArrayList<Integer>();
 		//This instaitates a new Integer ArrayList.
 		arrs.add(24);
 		//This adds an element to the ArrayList.
 		arrs.add(-53);
 		//This adds an element to the ArrayList.
 		arrs.add(1);
 		//This adds an element to the ArrayList.
 		arrs.add(0);
 		//This adds an element to the ArrayList.
 		arrs.add(4);
 		//This adds an element to the ArrayList.
 		arrs.add(100);
 		//This adds an element to the ArrayList.
 		arrs.add(99);
 		//This adds an element to the ArrayList.
 		insertionSort(arrs);
 		//This calls the method and passes it an int array.
 		System.out.println(arrs);
 		//This prints by calling the method then skips a line to make it look neat.

	}
	
	/*
	 * Task 1: Return the smallest number in the array. 
	 */
	public static int smallestNum(ArrayList<Integer> nums)
	{
		int temp=nums.get(0);
		//This declares a temp int set equal to the nums arraylist at the index 0 using .get.
		for(int i=0;i<nums.size();i++) 
		//It goes through the array as long as the traverser is less than the array size.
		{
            		if(nums.get(i)<temp) 
            		//This runs if the number at index using .get is less than the temp int.
            	{
            	temp=nums.get(i);
            	//This sets the temp int equal to the number at index of the arraylist using .get.
            }
        }
        	return temp;
        	//This returns temp which is now the smallest number in the array.
	}
	
	/*
	 * Task 2: Return the index of the smallest number in the array.
	 */
	public static int smallestIndex(ArrayList<Integer> nums)
	{
	    int smallestIndex=0;
	    //This declares an int variable set equal to 0.
	    for(int i=0;i<nums.size();i++)
	    //It goes through the array as long as the traverser is less than the array size.
	    {
	    	if(nums.get(i)<nums.get(smallestIndex)) 
	    	//This runs if the number at index using .get is less than the number at what smallestIndex is using .get.
	    	{
	           smallestIndex=i;
	           //It sets the int variable equal to the current index.
	    	}
	    }
	        return smallestIndex;
	        //Returns the index of the smallest number.
	 }
    
	/*
	 * Task 3: Return the average of all numbers in the array. 
	 */
	public static int theAverage(ArrayList<Integer> nums)
	{
		int theAverage=0;
		//This declares an int variable set equal to 0.
		for(int i=0;i<nums.size();i++)
		//It goes through the array as long as the traverser is less than the array size.
		{
			theAverage+=nums.get(i);
			//This adds the int vairable while setting it equal to the num at the index using .get.
		}
		return theAverage/nums.size();
		//Returns the total number and subtracts by its size to find its average.
	}
	
	/*
	 * Task 4: Return true if all numbers in the array are even, and return false otherwise.
	 */
	public static boolean evenOdd(ArrayList<Integer> nums)
	{
		int counter=0;
		//This declares an int variable set equal to 0.
		for(int i=0;i<nums.size();i++)
		//It goes through the array as long as the traverser is less than the array size.
		{
			if(nums.get(i)%2==0)
			//This runs if the number at the index using .get modulous 2 is 0. Checks if it is even.
			{
				counter++;
				//Adds one to counter int.
			}
		}
		
		if(counter==nums.size())
		//This runs if the counter is equal to the size of the array meaning each element is even.
		{
			return true;
			//Returns true.
		}
		
		return false;
		//Else it returns false.
	}
	
	/*
	 * Task 5: If the array ever has two consecutive 5's, change them to 0's. 
	 * (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 */
	 public static void replaceConsecutiveFives(ArrayList<Integer> nums) 
	 {	 
	     for(int i=0;i<nums.size();i++) 
	     //It goes through the array as long as the traverser is less than the array size.	 
	     {
	     	if(nums.get(i)==5 && nums.get(i+1)==5) 
		//This runs if the number at the index using .get is equal to 5 and the number at the index+1 using .get is equal to 5.
		{
			nums.set(i,0);
			//This uses .set to set the number at the index to 0.
			nums.set(i+1,0);
			//This uses .set to set the number at the index+1 to 0.
	        }

	    }
	}
	 
	/*
	 * Task 6: Return true if any number shows up three times in a row, and return false otherwise. 
	 */
	 public static boolean threeRepeat(ArrayList<Integer> nums, int number) 
	 {
		 for(int i=0;i<nums.size();i++) 
		 //It goes through the array as long as the traverser is less than the array size.
	     	 {
			 if(nums.get(i)==number && nums.get(i+1)==number && nums.get(i+2)==number) 
			 //If the number at index, index+1, and index+2 are equal to the number passed-all using .get-this runs.
			 {
				return true;
				//Return true;
	         }
	    		 }
		return false;
		//Else returns false.
	}
	
	/*
	 * Task 7: Pass an array of ints and an int to be searched for. 
	 * Return how many times that int shows up in the array. 
	 * (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 */
	 public static int intSearcher(ArrayList<Integer> nums, int number)
	 {
		 int counter=0;
		 //This declares an int set equal to 0.
		 for(int i=0;i<nums.size();i++) 
		 //It goes through the array as long as the traverser is less than the array size.
	     {
			 if(nums.get(i)==number) 
			 //If the number at index using .get is equal to the number passed, this runs. 
			 {
				counter++;
				//Adds one to the counter.
	         }	 
	    }
		return counter;
		//Returns counter which is how many times a number appears.
	 }
	 
	 /*
	  * Task 8: Alter an array so that is the backwards version of the array initially passed 
	  * (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	  */
	 public static void alterArray(ArrayList<Integer> nums)
	 {
		 for(int i=0;i<nums.size()/2;i++) 
		 //It goes through the array as long as the traverser is less than the array size/2.
		 {
			 int temp=nums.get(i);
			 //This sets a temp int equal to the number at the index using .get.
			 nums.set(i, nums.get(nums.size()-1-i));
			 //This sets the number at the idex using .get to the number at arrays size-1-the traverser using .get.
			 nums.set(nums.size()-1-i,temp);
			 //This sets the element of the array at size-1-traverser using .set to what temp is.
		 }
	 }
	 
	 /*
	  * Task 9: Shift all elements in an array to the right. 
	  * (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	  */
	 public static void shiftRight(ArrayList<Integer> nums)
	 {
		 int lastElement=nums.get(nums.size()-1);
		 //This delcares an int that is set equal to the last element of the array using .get.
		 for(int i=nums.size()-1;i>0;i--) 
		 //It goes through the array as long as the traverser is greater than 0.
		 {
			 nums.set(i, nums.get(i-1));
			 //This sets the num at the index using .set to the element of nums at the traverser-1 using .get.
	     }
		 
		 nums.set(0, lastElement);
		 //This sets the first element at the index 0 using .set to the last element.
	 }
	 
	 /*
	  * Task 10: Use either selection sort or insertion sort to sort an array. 
	  * (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
	  */
	 public static void insertionSort(ArrayList<Integer> nums) 
	 {
	     for(int i=1;i<nums.size();i++) 
	     //It goes through the array as long as the traverser is less than the array size.
	     {
		 int insert=nums.get(i);
		 //This int is set equal to the array at the index using .get which we will be inserting.
	         int j=i-1;
	         //This int is set equal to the traverser-1 which will be the number before the one we are checking/inserting.
	         while(j>=0 && nums.get(j)>insert) 
	         //While j is greater or equal to 0 and the number of the array at the index using .get of j is greater than the number we are inserting, this will run.
	         {
	        	 nums.set(j+1, nums.get(j));
	        	 //This uses .set to set the index of j+1 to the index of nums at j using .get.
	             j--;
	             //Subtracts 1 from j to either keep checking or exit the loop.
	         }
	         
	        nums.set(j+1, insert);
	        //This set the number at index+1(The number after the number we are checking) to the number we are inserting/sorting.
	        }
	    }
}

