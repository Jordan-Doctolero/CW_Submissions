/*
 * This methods finds the month at the index of the String that is passed as the parameter n.
 * It uses logic statements and loops to find the month from a single string containing all the tweleve months in a year.
*/
public static String getMonth(int n)
	{
		//This declares a months String that is set equal to the twelve months of the year that are all seperated by spaces.
		String months = "January February March April May June "
				+ "July August September October November December ";

    //The i starts at 1 and continues while i is less than or equal to 12. 
    //i represents the current month of the loop that is being traced.
    //After it loops, it then iterates.
		for (int i = 1; i <= 12; i++)
		{
			//This declares an int sL that is set equal to the String months that uses the index of a space and it will look for a space.
      //sL means Space Location.
      //This stores the index of the first space character in the months String.
			int sL = months.indexOf(' ');

      //if the number of the month you want to find is equal to i, this statement runs.
			if (n == i)
			{
         //The method returns the substring of months starting from the beginning of index 0 
         //up to the first space which is the month's name.
				return months.substring(0, sL);
			}
     
      //In any other case, this else statement runs.
			else
			{
        //The months string is updated in this statement.
        //This will run most of the time because the if won't be true for every index.
        //It will add 1 to the space location basically removing the first month in the String.
        //This will continue to run until the n and i are equal which then the if can finally run.
				months = months.substring(sL + 1);
			}
		}
		
    //If the index number you type isn't allowed or in the boundaries, then this prints.
		return " /* What String would you put here? */ ";
		
	}
