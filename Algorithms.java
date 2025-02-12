/**
 * This is the first Algorithms assignment we have.
 * We are creating and testing the BubbleSort Method.
 * We use for each loops to print each section of the array and made a bubble sort method to sort the arrays.
 * @Jordan_Doctolero
 */
public class Algorithms {

	/*
	 * This is the main method where all the magic of printing each element after the sort comes from.
	 */
	public static void main(String[] args) {
		int[] numssss={9,2,8,3};
		//This declares an int array of out of order numbers.
		int[] numbers={9,8,7,6,5,4,3,2,1,0};
		//This declares an int array of out of order numbers.
        
		bubbleSort(numssss);
		//This calls the bubbleSort method and we pass it the first int array to organize it.
       
		for (int num : numssss) 
		//This for each loop goes through the first array and prints each element.
		 {
			 System.out.print(num + " ");
			 //This prints out the num and adds a space.
		 }
        
        System.out.println();
        //This skips a line to make it look neater.
        
        bubbleSort(numbers);
        //This calls the bubbleSort method and we pass it the second int array to organize it.
       
        for (int num : numbers) 
        //This for each loop goes through the second array and prints each element.
		 {
			 System.out.print(num + " ");
			 //This prints out the num and adds a space.
		 }

	}
	
	/*
	 * This is the bubbleSort method where all the magic will happen.
	 * This is where it will sort all the numbers in a set array.
	 */
	public static void bubbleSort(int[]nums)
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
			for(int i=0;i<nums.length-1;i++)
			//This foor loop goes through the array it is passed until the traverser is greater than the array length-1.
			{
				if(nums[i]>nums[i+1])
				//If the num at the index is greater than the num at the index+1, this will run.
				{
					temp=nums[i];
					//This sets our temp variable equal to the number at the index.
					nums[i]=nums[i+1];
					//This sets the number at that index to the number at the next position or index+1.
					nums[i+1]=temp;
					//This sets the number at the next position or index+1 equal to what we set the temp equal to in the first part.
					counter++;
					//This adds 1 to the counter.
				}
			}		
		}
	}
}
