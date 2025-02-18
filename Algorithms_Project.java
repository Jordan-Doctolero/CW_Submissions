/**
 * This is the Algorithms Project Assignment.
 * We solve 10 different problems dealing with Algorithms and Arrays.
 * We do a variety of different problems from searching through an Array to building an Algorithm to sort it.
 * It combines all the differnet coding techniques we've learned.
 * @Jordan_Doctolero
 */
public class Algorithms_Project {

	/*
	 * This is the main method.
	 * This is where I will be calling all the different methods I made for each problem to solve.
	 * It will have different arrays and different tasks.
	 */
	public static void main(String[] args) {
		//Task 1:
		int[] numssss={9,2,8,3};
		//This declares a new int array.
		int[] nums1={3,8,5,4,1};
		//This declares a new int array.
		System.out.println(smallestNum(numssss));
		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
		System.out.println(smallestNum(nums1));
		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
		System.out.println();
		//This skips a line to make it look neater.
		
		//Task 2:
		int[] arrNum={3,6,1};
		//This declares a new int array.
		int[] numArr={2,1,4};
		//This declares a new int array.
		System.out.println(smallestIndex(arrNum));	
		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
		System.out.println(smallestIndex(numArr));
		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
		System.out.println();
		//This skips a line to make it look neater.
		
		//Task 3: 
		int[] forAverage={3,3,3};
		//This declares a new int array.
		int[] aAverage={1,2,3};
		//This declares a new int array.
 		System.out.println(theAverage(forAverage));	
 		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
 		System.out.println(theAverage(aAverage));
 		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 4:
 		int[] evenOrOdd={2,4,6,8};
 		//This declares a new int array.
 		int[] evenOdd={2,3,4,5,6};
 		//This declares a new int array.
 		System.out.println(evenOdd(evenOrOdd));
 		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
 		System.out.println(evenOdd(evenOdd));
 		//This prints by calling the method and passing it an int array then skips a line to make it look neat.
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 5:
 		int[] isFive={4,3,5,5,1};
 		//This declares a new int array.
 		int[] isItFive={3,4,5,6,7,8};
 		//This declares a new int array.
 		replaceConsecutiveFives(isFive);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
 		replaceConsecutiveFives(isItFive);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
 		System.out.println();
 		//This skips a line to make it look neater.

 		//Task 6:
 		int[] three={6,4,7,7,7};
 		//This declares a new int array.
 		int[] noThree={3,6,3,8,1};
 		//This declares a new int array.
 		System.out.println(threeRepeat(three,7));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		System.out.println(threeRepeat(noThree,3));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 7:
 		int[] totalNums= {5,5,5,3,4,5,1,5,2,5};
 		//This declares a new int array.
 		int[] numbers= {1,4,6,9,1,0,3,6,1};
 		//This declares a new int array.
 		System.out.println(intSearcher(totalNums,5));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		System.out.println(intSearcher(numbers,1));
 		//This prints by calling the method and passing it an int array and an int then skips a line to make it look neat.
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 8:
 		int[] numArrs={9,8,7,6};
 		//This declares a new int array.
 		int[] numArrss= {4,3,2,1};
 		//This declares a new int array.
 		alterArray(numArrs);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
 		alterArray(numArrss);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 9:
 		int[] shifter= {1,2,3};
 		//This declares a new int array.
 		int[] rightShift={5,4,3};
 		//This declares a new int array.
 		shiftRight(shifter);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
 		shiftRight(rightShift);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
 		System.out.println();
 		//This skips a line to make it look neater.
 		
 		//Task 10:
 		int[] arr={9,2,6,2};
 		//This declares a new int array.
 		insertionSort(arr);
 		//This calls the method and passes it an int array.
 		System.out.println();
 		//This skips a line to make it look neater.
        	int[] arrs={24,-53,1,0,4,100,99};
        	//This declares a new int array.
        	insertionSort(arrs);
        	//This calls the method and passes it an int array.
        	System.out.println();
        	//This skips a line to make it look neater.
	}
	
	/*
	 * Task 1: Return the smallest number in the array. 
	 */
	public static int smallestNum(int[] nums)
	{
	int temp=nums[0];
	//This declares a temp int set equal to the nums array at the index 0.
	for(int i=0;i<nums.length;i++) 
	//It goes through the array as long as the traverser is less than the array length.
	{
            if(nums[i]<temp) 
            //This runs if the number at index is less than the temp int.
            {
            	temp=nums[i];
            	//This sets the temp int equal to the number at index.
            }
        }
        return temp;
        //This returns temp which is now the smallest number in the array.
	}
	
	/*
	 * Task 2: Return the index of the smallest number in the array.
	 */
	public static int smallestIndex(int[] nums)
	{
	     int smallestIndex=0;
	     //This declares an int set equal to 0.
	     for(int i=0;i<nums.length;i++)
	     //It goes through the array as long as the traverser is less than the array length.
	     {
	    	if(nums[i]<nums[smallestIndex]) 
	    	//This will run if the number at the index is less than the number at the int variable.
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
	public static int theAverage(int[] nums)
	{
	     int theAverage=0;
	     //This declares an int set equal to 0.
	     for(int i=0;i<nums.length;i++)
	     //It goes through the array as long as the traverser is less than the array length.
	       {
			theAverage+=nums[i];
			//This adds the int vairable while setting it equal to the num at the index.
		}
		return theAverage/nums.length;
		//Returns the total number and subtracts by its length to find its average.
	}
	
	/*
	 * Task 4: Return true if all numbers in the array are even, and return false otherwise.
	 */
	public static boolean evenOdd(int[] nums)
	{
		int counter=0;
		//This declares an int set equal to 0.
		for(int i=0;i<nums.length;i++)
		//It goes through the array as long as the traverser is less than the array length.
		{
			if(nums[i]%2==0)
			//This runs if the number at the index modulous 2 is 0. Checks if it is even.
			{
				counter++;
				//Adds one to counter int.
			}
		}
		
		if(counter==nums.length)
		//This runs if the counter is equal to the length of the array meaning each element is even.
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
	 public static void replaceConsecutiveFives(int[] nums) 
	 {
		 int[]copyArr=new int[nums.length];
		 //This declares an int copy Array set equal to the original array's length.
		 
		 for(int i=0;i<nums.length;i++) 
		 //It goes through the array as long as the traverser is less than the array length.	
		 {
			 copyArr[i] = nums[i];
			 //This sets the copy Array at the index equal to the number at that index.
			 //This is to copy the original array into a new array.
		 }
		 for(int i=0;i<copyArr.length;i++) 
		 //It goes through the array as long as the traverser is less than the array length.	 
	     	 {
			 if(nums[i]==5 && nums[i+1]==5) 
			 //This runs if the number at the index is equal to 5 and the number at the index+1 is equal to 5.
			 {
				 copyArr[i]=0;
				 //Sets the first number at index equal to 0.
				 copyArr[i+1]=0;
				 //Sets the number at index+1 equal to 0.		 
	         	 }

	    	 }
		 for (int num : copyArr) 
		 //This for each loop goes through the first array and prints each element.
		 {
			 System.out.print(num + " ");
			 //This prints out the num and adds a space.
		 }
	}
	 
	/*
	 * Task 6: Return true if any number shows up three times in a row, and return false otherwise. 
	 */
	 public static boolean threeRepeat(int[] nums, int number) 
	 {
		 for(int i=0;i<nums.length;i++) 
		 //It goes through the array as long as the traverser is less than the array length.
	     	 {
			if(nums[i]==number && nums[i+1]==number && nums[i+2]==number) 
			//If the number at index, index+1, and index+2 are equal to the number passed, this runs.
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
	 public static int intSearcher(int[] nums, int number)
	 {
	     int counter=0;
	     //This declares an int set equal to 0.
	     for(int i=0;i<nums.length;i++) 
	     //It goes through the array as long as the traverser is less than the array length.
	     {
	     	if(nums[i]==number) 
	        //If the number at index is equal to the number passed, this runs. 
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
	 public static void alterArray(int[] nums)
	 {
		 int[]copyArr=new int[nums.length];
		 //This declares an int copy Array set equal to the original array's length.
		 for(int i=0;i<copyArr.length/2;i++) 
		 //It goes through the array as long as the traverser is less than the array length/2.
		 {
			 int temp=nums[i];
			 //This sets a temp int equal to the number at the index.
			 copyArr[i]=nums[nums.length-1-i];
			 //This sets the copy Array number at the idex equal to the number at arrays length-1-the traverser.
			 copyArr[copyArr.length-1-i]=temp;
			 //This sets the element at the copy Array length-1-traverser equal to what temp is.
		 }
		 
		 for (int num : copyArr) 
		 //This for each loop goes through the first array and prints each element.
		 {
			 System.out.print(num + " ");
			 //This prints out the num and adds a space.
		 }
	 }
	 
	 /*
	  * Task 9: Shift all elements in an array to the right. 
	  * (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	  */
	 public static void shiftRight(int[] nums)
	 {
		 int[]copyArr=new int[nums.length];
		 //This declares an int copy Array set equal to the original array's length.
		 int lastElement=nums[nums.length-1];
		 //This delcares an int that is set equal to the last element of the array.
		 for(int i=copyArr.length-1;i>0;i--) 
		 //It goes through the array as long as the traverser is greater than 0.
		 {
			copyArr[i]=nums[i-1];
			//This sets the copy Array at the index equal to the element of nums at the traverser-1.
	     	 }
		 
		 copyArr[0]=lastElement;
		 //This sets the first element of the copy Array equal to the last element.
		  	 
		 for(int num : copyArr)
		 //This for each loop goes through the first array and prints each element.
		 {
			 System.out.print(num + " ");
			 //This prints out the num and adds a space.
		 }
	 }
	 
	 /*
	  * Task 10: Use either selection sort or insertion sort to sort an array. 
	  * (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
	  */
	 public static void insertionSort(int[] nums) 
	 {
	     for(int i=1; i<nums.length;i++) 
	     //It goes through the array as long as the traverser is greater than 0.
	     {
		 int insert=nums[i];
		 //This int is set equal to the array at the index which we will be inserting.
	         int j=i-1;
	         //This int is set equal to the traverser-1 which will be the number before the one we are checking/inserting.
	         while(j>= 0 && nums[j]>insert) 
	         //While j is greater or equal to 0 and the number of the array at the index of j is greater than the number we are inserting, this will run.
	         {
	             nums[j+1]=nums[j];
	             //Sets the number at index+1 equal to the number at index j.
	             j--;
	             //Subtracts 1 from j to either keep checking or exit the loop.
	         }
	         
	        nums[j+1]=insert;
	        //This set the number at index+1(The number after the number we are checking) equal to the number we are inserting/sorting.
	        }
	        
	        for (int num : nums) 
	        //This for each loop goes through the first array and prints each element.
	        {
	        	System.out.print(num + " ");
	        	//This prints out the num and adds a space.
	        }
	    }
}
