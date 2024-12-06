	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   * the following question: what does this method do?
	 * 
	 * This methods finds the index of the character in a string in which it occurs.
   * If that character is there, it returns the index of it.
   * If the character is not there, it returns -1.
   */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * 
		 * 
		 * The length of the string that wll be instantiated will be set equal to l as an int.
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * 
		 * The <= is the error.
     * It the char you pass is not in the String, it becomes void and it becomes a syntax error.
     * It is an out of bounds error.
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * It is checking for if the character of the string at the index or the initilizer is equal to the character you pass in the main.
       * If it is true, it will return the index at which that character appears in the String.
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * If the character is not there, this method needs to return an int.
     * It will be reached if there is no char that is the same in the String.
		 */
		return -1;
		
	}
