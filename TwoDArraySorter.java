/**
 * This is one of the last assignments for the year.
 * This took me a while because I did not understand what the top-down, left-right meant till Alan explained it to me.
 * Once I understood it, I was able to do it.
 * This was a intersting but fun one.
 * @Jordan_Doctolero
 */
public class TwoDArraySorter {

	/*
	 * This is the main method where all the magic happens.
	 * We will declare arrays to sort.
	 * We will call the methods we create below the main method to make it sort.
	 */
	public static void main(String[] args) {
		
		//Task 1:
		double[][] theArray=
		//This declares a new double 2D array.
		{
				{3.4, 3.1, 2.9, 4.1},
				{1.1, 0.9, 2.4, 8.1}
				//This has two rows and four columns.
		};
		
		System.out.println("Task 1:");
		//This prints out the text and skips a line.
		System.out.println("Before:");
		//This prints out the text and skips a line.
		arrayPrinter(theArray);
		//This calls the method and is passed the array declared above.
		
		arraySorterOne(theArray);
		//This calls the method and is passed the array declared above.
		System.out.println(" ");
		
		System.out.println("After:");
		//This prints out the text and skips a line.
		arrayPrinter(theArray);
		//This calls the method and is passed the array declared above.
		
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 2:
		double[][] theArrays=
		//This declares a new double 2D array.
		{
				{3.4, 3.1, 2.9, 4.1},
				{1.1, 0.9, 2.4, 8.1}
				//This has two rows and four columns.
		};
		
		System.out.println("Task 2:");
		//This prints out the text and skips a line.
		System.out.println("Before");
		//This prints out the text and skips a line.
		arrayPrinter(theArrays);
		//This calls the method and is passed the array declared above.
		
		arraySorterTwo(theArrays);
		//This calls the method and is passed the array declared above.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		System.out.println("After");
		//This prints out the text and skips a line.
		arrayPrinter(theArrays);
		//This calls the method and is passed the array declared above.

	}
	
	/*
	 * Task 1:
	 * Create a method that is passed a 2-D array of doubles 
	 * and sorts it from left-right, top-down order.
	 */
	public static void arraySorterOne(double[][] nums)
	{
		int rows=nums.length;
		//This declares a new int of the length of the whole array for rows.
        int cols=nums[0].length;
        //This declares a new int of the length of the whole 1st array for column.
        double[] oneArray=new double[rows*cols];
        //This multiplies all to declare a new double array with all elements.
         
        int index=0;
        //This declares a new int variable with a value of 0.
        
        for(int i=0;i<rows;i++) 
        //This iterates through the rows.
        {
            for(int j=0;j<cols;j++) 
            //This iterates through the columns.
            {
            	oneArray[index]=nums[i][j];
            	//This sets the new array at the index equal to the number at i/j of the double array.
                index++;
                //Adds 1 to the index.
            }
        }
        
        /*
         * This is bubble sort for a 2D Array.
         */
        for(int i=0;i<oneArray.length-1;i++) 
    	//This goes through the whole array looping for rows.
    	//Traverses through the columns.
   	    {
   	        for(int j=0;j<oneArray.length-1-i;j++) 
   	        //This goes through the whole array looping for columuns.
   			//Traverses through the rows.
   	        {
   	        	if (oneArray[j]>oneArray[j+1]) 
   	        	//If the number at index j is less than the one next to it, this runs to swap.
   	        	{
                    double temp=oneArray[j];
                    //This declares a new temp variable with the value of the single Array element at j.
                    oneArray[j]=oneArray[j+1];
                    //This sets the value at j of the new array to the one next to it.
                    oneArray[j+1]=temp;
                    //This sets the the element of the new array at j+1 equal to the temp.
                }
    	    }
    	}
        
        index=0;
        //This sets index back to 0.
        
        for(int i=0;i<rows;i++) 
        //This iterates through the rows.
        {
            for(int j=0;j<cols;j++) 
            //This iterates through the columns.
            {
                nums[i][j]=oneArray[index];
                //This sets the value at i/j to the value of the new Array at the index.
                index++;
                //Adds one to the index.
            }
        }
	}
	
	/*
	 * Task 2:
	 * Then create a method that is passed a 2-D array of doubles 
	 * and sorts it from top-down, left-right order. 
	 */
	public static void arraySorterTwo(double[][] nums)
	{
		int rows=nums.length;
		//This declares a new int of the length of the whole array for rows.
        int cols=nums[0].length;
        //This declares a new int of the length of the whole 1st array for column.
        double[] oneArray=new double[rows*cols];
        //This multiplies all to declare a new double array with all elements.
         
        int index=0;
        //This declares a new int variable with a value of 0.
        
        for(int j=0;j<cols;j++) 
        //This iterates through the rows.
        {
            for(int i=0;i<rows;i++) 
            //This iterates through the columns.
            {
            	oneArray[index]=nums[i][j];
            	//This sets the new array at the index equal to the number at i/j of the double array.
                index++;
                //Adds 1 to the index.
            }
        }
        
        /*
         * This is bubble sort for a 2D Array.
         */
        for(int i=0;i<oneArray.length-1;i++) 
    	//This goes through the whole array looping for rows.
    	//Traverses through the columns.
   	    {
   	        for(int j=0;j<oneArray.length-1-i;j++) 
   	        //This goes through the whole array looping for columuns.
   			//Traverses through the rows.
   	        {
   	        	if (oneArray[j]>oneArray[j+1]) 
   	        	//If the number at index j is less than the one next to it, this runs to swap.
   	        	{
                    double temp=oneArray[j];
                    //This declares a new temp variable with the value of the single Array element at j.
                    oneArray[j]=oneArray[j+1];
                    //This sets the value at j of the new array to the one next to it.
                    oneArray[j+1]=temp;
                    //This sets the the element of the new array at j+1 equal to the temp.
                }
    	    }
    	}
        
        index=0;
        //This sets index back to 0.
        
        for(int j=0;j<cols;j++) 
        //This iterates through the rows.
        {
            for(int i=0;i<rows;i++) 
            //This iterates through the columns.
            {
                nums[i][j]=oneArray[index];
                //This sets the value at i/j to the value of the new Array at the index.
                index++;
                //Adds one to the index.
            }
        }
	}
	
	/*
	 * This prints each element of the array by using a for loop to iterate through each.
	 */
	public static void arrayPrinter(double[][] nums) 
	{

	    for(int i=0;i<=nums.length-1; i++) 
	    //This goes through the whole array looping for rows.
		//Traverses through the columns.
	    {
	        for(int j=0;j<=nums[i].length-1;j++) 
	        //This goes through the whole array looping for columuns.
			//Traverses through the rows.
	        {
	            System.out.print(nums[i][j] + " ");
	            //This prints out the element at the index i for row element and the index j for column element.
	        }
	        
	        System.out.println();
	        //This skips a linet to make it look neater.
	    }
	}
}
