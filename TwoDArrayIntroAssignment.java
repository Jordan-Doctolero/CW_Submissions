/**
 * This is the intro assignment for 2D Arrays.
 * We solve 11 problems that we will use as a starter.
 * We start understanding 2D arrays,
 * This assignment combines all that we have learned.
 * @Jordan_Doctolero
 */
public class TwoDArrayIntroAssignment {

	/*
	 * This is where all the magic happens.
	 * We will be working with 2D-Arrays.
	 * Getting to understand them, how they work, and how to use them.
	 */
	public static void main(String[] args) {
		//Task 1: Instantiate a 2-D array gridNums that consists of 4 rows 
		//and 6 columns using the new keyword. 
		
		int[][] gridNums=new int [4][6];
		//This instatiates a new 2D array with 4 rows and 6 columns;
		
		//Task 2: Instantiate a 2-D array with the following values:

		//4   5    7

		//2  -1   8

		//0  1   3
		
		int[][] twoDArray= 
		{
			{4,5,7},
			{2,-1,8},
			{0,1,3}
		};
		//This declares a 2D array with 3 rows and 3 columns. 
		//Each row have their own values.
		
	 	/* For the following problems, print out those elements before and
		* after to verify it worked. 
		*/
		
		//Task 3 For both of those arrays, 
		//change the element in the first row, first column to a 17.
		System.out.println("Task 3:");
		//This prints out what number it is and skips a line.
		
		System.out.print("Before(gridNums): { ");
		//This prints out the text.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(gridNums[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("Before(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(twoDArray[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("After(gridNums): { ");
		//This prints out the text.
		
		gridNums[0][0]=17;
		//This sets the 2d array of the first row and its first column, equal to 17.
		twoDArray[0][0]=17;
		//This sets the 2d array of the first row and its first column, equal to 17.
		
		System.out.print("After(gridNums): { ");
		//This prints out the text.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the first row of the 2d array.
		{
			System.out.print(gridNums[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("After(twoDArray): { ");
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(twoDArray[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 4: For both of those arrays, 
		//change the element in the second row, third column into a 20.
		System.out.println("Task 4:");
		//This prints out what number it is and skips a line.
		
		System.out.print("Before(gridNums): { ");
		//This prints out the text.
		
		for(int i=0;i<gridNums[1].length;i++)
		//This goes through the second row of the 2d array.
		{	
			System.out.print(gridNums[1][i]+ " ");
			//This prints out the number of the array at the index i and its always the second row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("Before(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[1].length;i++)
		//This goes through the second row of the 2d array.
		{	
			System.out.print(twoDArray[1][i]+ " ");
			//This prints out the number of the array at the index i and its always the second row.
		}
		System.out.println(" }");	
		//This prints out the text.
		
		System.out.print("After(gridNums): { ");
		//This prints out the text.
		
		gridNums[1][2]=20;
		//This sets the array at row 2 and column three equal to 20.
		twoDArray[1][2]=20;
		//This sets the array at row 2 and column three equal to 20.
		
		for(int i=0;i<gridNums[1].length;i++)
		//This goes through the second row of the 2d array.
		{	
			System.out.print(gridNums[1][i]+ " ");
			//This prints out the number of the array at the index i and its always the second row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("After(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[1].length;i++)
		//This goes through the second row of the 2d array.
		{	
			System.out.print(twoDArray[1][i]+ " ");
			//This prints out the number of the array at the index i and its always the second row.
		}
		System.out.println(" }");
		//This prints out the text.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 5: For both of those arrays, 
		//change the last element in the first row to a -5. 
		//Accomplish this using .length 
		System.out.println("Task 5:");
		//This prints out what number it is and skips a line.
		
		System.out.print("Before(gridNums): { ");
		//This prints out the text.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(gridNums[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("Before(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(twoDArray[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");	
		//This prints out the text.
		
		System.out.print("After(gridNums): { ");
		//This prints out the text.
		
		gridNums[0][gridNums[0].length-1]=-5;
		//This sets the array of the first row at the last element/column, equal to -5.
		twoDArray[0][twoDArray[0].length-1]=-5;
		//This sets the array of the first row at the last element/column, equal to -5.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(gridNums[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("After(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the first row of the 2d array.
		{	
			System.out.print(twoDArray[0][i]+ " ");
			//This prints out the number of the array at the index i and its always the first row.
		}
		System.out.println(" }");
		//This prints out the text.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 6: For both of those arrays, 
		//change the first element in the last row to a -7. 
		//Accomplish this using .length.
		System.out.println("Task 6:");
		//This prints out what number it is and skips a line.
		
		System.out.print("Before(gridNums): { ");
		//This prints out the text.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the row of the 2d array.
		//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(gridNums[gridNums.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");
		//This skips a line to make it look neater.
		
		System.out.print("Before(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the row of the 2d array.
		//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(twoDArray[twoDArray.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");	
		//This prints out the text.
		
		System.out.print("After(gridNums): { ");
		//This prints out the text.
		
		gridNums[gridNums.length-1][0]=-7;
		//This sets the array of the last row at the first column, equal to -7.
		twoDArray[twoDArray.length-1][0]=-7;
		//This sets the array of the last row at the first column, equal to -7.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the row of the 2d array.
	   	//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(gridNums[gridNums.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("After(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the row of the 2d array.
	   	//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(twoDArray[twoDArray.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");	
		//This prints out the text.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 7: For both of those arrays, 
		//change the last element in the last row to a -30. 
		//Accomplish this using .length.
		System.out.println("Task 7:");
		//This prints out what number it is and skips a line.
		
		System.out.print("Before(gridNums): { ");
		//This prints out the text.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the row of the 2d array.
	   	//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(gridNums[gridNums.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("Before(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the row of the 2d array.
	    	//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(twoDArray[twoDArray.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");	
		//This prints out the text.
		
		System.out.print("After(gridNums): { ");
		//This prints out the text.
		
		gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1]=-30;
		//This sets the array at the last row of the last column, equal to -30.
		twoDArray[twoDArray.length-1][twoDArray[twoDArray.length-1].length-1]=-30;
		//This sets the array at the last row of the last column, equal to -30.
		
		for(int i=0;i<gridNums[0].length;i++)
		//This goes through the row of the 2d array.
	    	//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(gridNums[gridNums.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");
		//This prints out the text.
		
		System.out.print("After(twoDArray): { ");
		//This prints out the text.
		
		for(int i=0;i<twoDArray[0].length;i++)
		//This goes through the row of the 2d array.
	   	//I used the first row because the 2d array is a rectangle so the rows and columns are equal in length.
		{	
			System.out.print(twoDArray[twoDArray.length-1][i]+ " ");
			//This prints out the number of the array at the index i and its always the last row.
		}
		System.out.println(" }");	
		//This prints out the text.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 8:
		System.out.println("Task 8:");
		//This prints out what number it is and skips a line.
		
		int[][] anArrays=
		//This declares a new 2d array with 2 rows and 2 columns.
			{
				{8, 5, 3 },
				{2, 5, 6}
			};
		twoDPrinter(anArrays);	
		//This calls the method from below and is passed a 2d array.
		System.out.println(anArrays);
		//This prints out said 2d array.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 9:
		System.out.println("Task 9:");
		//This prints out what number it is and skips a line.s.
		
		int[][] anArrayer=
		//This declares a new 2d array with 2 rows and 2 columns.
			{
				{9, 1, 2 },
				{6, 8, 3}
			};
		twoDPrinters(anArrayer);	
		//This calls the method from below and is passed a 2d array.
		System.out.println(anArrayer);
		//This prints out said 2d array.
		System.out.println(" ");
		//This skips a line to make it look neater.
		
		//Task 10:
		System.out.println("Task 10:");
		//This prints out what number it is and skips a line.
		
		int[][] myArray = 
		//This calls the method from below and is passed a 2d array.
			{
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
		 	};
		 
		 rowMajorOrder(myArray);
		 //This calls the method from below and is passed a 2d array.
		 System.out.println(myArray);
		 //This prints out said 2d array.
		 System.out.println(" ");
		 //This prints out what number it is and skips a line.
		 
		 //Task 11:
		 System.out.println("Task 11:");
		 //This prints out what number it is and skips a line.
		 
		 int[][] myArrays = 
		 //This calls the method from below and is passed a 2d array.
			{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
		
		 columnMajorOrder(myArrays);
		 //This calls the method from below and is passed a 2d array.
		 System.out.println(myArrays);
		 //This prints out what number it is and skips a line. 
	}
		
	/*
	 * Task 8: Create a method that is passed a 2-D array of ints and 
	 * one by one prints out each element in the first row. 
	 */
	
	public static void twoDPrinter(int[][] nums)
	{
		for(int i=0;i<nums[0].length;i++)
		//This goes through the first row of the 2d array,
		{	
			System.out.print(nums[0][i]+ " ");
			//This prints the element of the first row at the index i for column.
		}
	}
	
	/*
	 * Task 9: Create a method that is passed a 2-D array of ints and 
	 * one by one prints out each element in the first column.
	 */
	
	public static void twoDPrinters(int[][] nums)
	{
		for(int i=0;i<nums[1].length-1;i++)
		//This goes through the first column of the 2d array,
		{	
			System.out.print(nums[i][1]+ " ");
			//This prints the element of the indx i for row at the first column.
		}
	}
	
	/*
	 * Task 10: Create a method that is passed a 2-D array of ints and 
	 * one by one prints out each element in row-major order. 
	 */
	
	public static void rowMajorOrder(int[][] nums)
	{
		for (int i=0;i<=nums.length-1;i++) 
		//This goes through the whole array looping for rows.
		//Traverses through the columns.
		{ 
			for (int j=0;j<=nums[0].length-1;j++) 
			//This goes through the whole array looping for columuns.
			//Traverses through the rows.
			{ 
	            System.out.print(nums[i][j]+" ");
	            //This prints out the element at the index i for row element and the index j for column element.
	        }
		}
	}
	
	/*
	 * Task 11: Create a method that is passed a 2-D array of ints and 
	 * one by one prints out each element in column-major order. 
	 */
	
	public static void columnMajorOrder(int[][] nums)
	{
		for(int j=0;j<=nums[0].length-1;j++) 
		//This goes through the whole array looping for columns.
		//Traverses through the columns.
		{
	        for(int i=0;i<=nums.length-1;i++) 
	        //This goes through the whole array looping for rows.
	        //Traverses through the rows.
	        { 
	            System.out.print(nums[i][j]+" ");
	            //This prints out the element at the index i for column element and the index j for row element.
	        }
	    }
	}
}
