import java.util.Scanner;
//This imports a Scanner we can use.

/**
 * This is the class for the Tic Tac Toe Game Project.
 * I used methods to create a functioning game.
 * It checks after every move, if someone has won or if there is a tie.
 * It reprompts if someone makes an invalid move.
 * It is fun to play!
 * @Jordan_Doctolero
 */
public class TicTacToeGame {

	public static Scanner gameReader = new Scanner(System.in);
	//This declares a Scanner object that we can use all throughout the class.
	
	public static String player;
	//This declares a String object that we can use all throughout the class.
	
	public static String playerName;
	//This declares a String object that we can use all throughout the class.
	
	public static String[][] gameArray= 
	////This declares a 2D String object that we can use all throughout the class.
			{
				{"*", "*", "*"},
				{"*", "*", "*"},
				{"*", "*", "*"}
			};
			//This is a 2D Array of 3 Arrays with 3 Rows and 3 collumns.
	
	/*
	 * This is the main method where all the magic happens.
	 * We will call the methods and use loops in the main to make the tic tac toe game run.
	 * Depending on what happens, the main will guide it.
	 */
	public static void main(String[] args) 
	{
		startGame(gameArray);
		//This calls the method and is passed the 2D Array.
		chooseFirstPlayer();
		//This calls the method and runs it.
		
		boolean gameOver=false;
		//This declares a boolean and sets it equal to false.

        while(!gameOver) 
        //This runs while the condition is met.
        {
            boardPrinter(gameArray);
            //This calls the method and is passed the 2D Array.
            playerMove();
            //This calls the method and runs it.
            
            if(checkWin(gameArray)) 
            //This runs if the condition is met.
            //Using a method to check if the condition is met.
            {
            	boardPrinter(gameArray);
            	//This calls the method and is passed the 2D Array.
                System.out.println(playerName + " wins!");
                //This prints what is said and skips a line.
                gameOver=true;
                //Sets the boolean to true to exit the loop.
            } 
            
            else if(isTie(gameArray)) 
            //This runs if the condition is met.
            //Using a method to check if the condition is met.
            {
            	boardPrinter(gameArray);
            	//This calls the method and is passed the 2D Array.
                System.out.println("It's a tie!");
                //This prints what is said and skips a line.
                gameOver=true;
                //Sets the boolean to true to exit the loop.
            } 
            
            else 
            //In any other case, this runs.
            {
                switchPlayer();
                //This calls the method to run and switches players.
            }
        }
        
        gameReader.close();
        //This closes the scanner to avoid any leaks.
        
	}
		
	/*
	 * This method is the start of the game.
	 * Prompts the users to choose who they want to play as and gives them the instructions/rundown on the game.
	 */
	public static void startGame(String[][] game)
	{
		boolean start=true;
		//This declares a boolean that is set equal to true.
		while(start)
		//While the codition is met, this will run.
		{
			System.out.println("Who do you want to play as: " + "\n" + "Mario(X) or Luigi(O)");
			//This prints out the text and skips a line.
		
			String gameInput = gameReader.nextLine();
			//This declares a new Scanner to use.
					
			if(gameInput.equalsIgnoreCase("X") || gameInput.equalsIgnoreCase("O")
		      	||gameInput.equalsIgnoreCase("Mario") || gameInput.equalsIgnoreCase("Luigi"))
			//If the user inputs any of these, this will run.
			{
				System.out.println(" ");
				//This prints out the text and skips a line.
				System.out.println("Welcome to Tic Tac Toe!");
				//This prints out the text and skips a line.
				System.out.println("You will be asked to choose where you want to go:");
				//This prints out the text and skips a line.
				System.out.println("A1-A3 for the first row, B1-B3 for the second row, C1-C3 for the third row");
				//This prints out the text and skips a line.
				start=false;
				//This sets the boolean to false to exit the loop.
			}
		
			else
			//In any other case, this will run.
			{
				System.out.println("Please choose again");
				//This prints out the text and skips a line.
			}
		}
	}
	
	/*
	 * This method chooses the player who will go first.
	 */
	public static void chooseFirstPlayer() 
	{
	    int randomPlayer=(int)(Math.random()*2)+1;
	    //This chooses a random number of 1 or 2 to choose the random Player.
	    if(randomPlayer==1) 
	    //If the numebr from Math.random is equal to 1, this runs.
	    {
	    	player="X"; 
	    	//This sets the player object equal to X.
	        playerName="Mario";
	        //This sets the playerName object equal to Mario.
	    } 
	        
	    else 
	    //In any other case(2), this runs.
	    {
	        player="O"; 
	        //This sets the player object equal to O.
	        playerName="Luigi";
	        //This sets the playerName object equal to Luigi.
	    }
	    
	    System.out.println(playerName+" goes first!\n");
	    //This prints out the text and skips a line.
	    System.out.println("Here's the Grid!");
	    //This prints out the text and skips a line.
	    
	}
	
	/*
	 * This is where the player will make their move.
	 * It checks if it is valid and updates the board.
	 */
	public static void playerMove() 
	{
	    int row=-1;
	    //This declares an int that is for the rows.
	    int col=-1;
	    //This declares an int that is for the columns.
	    boolean valid=false;
	    //This declares an boolean that is set to false.
	    
	    while(!valid) 
	    //This runs while the condition is met.
	    {
	    	System.out.println(playerName+ ", enter your move (EX: a1, b2, c3): ");
	    	//This prints out the text and skips a line.
	        String move = gameReader.nextLine();
	        //This declares a new Scanner to use.
   
	        if(move.length()==2) 
	        //This runs if the input is equal to 2.
	        {
	        	char rowChar=move.charAt(0);
	        	//This declares a new char that is set equal to the character At 0 for the row.
	        	char colChar=move.charAt(1); 
	        	//This declares a new char that is set equal to the character At 1 for the column.
	        	
	        	if(rowChar=='a' || rowChar=='A') 
	        	//This runs if it is true.
	            {
	        		row=0;
	        		//If it is a, it sets the row variable to 0.
	            } 
	                
	            else if(rowChar=='b' || rowChar=='B') 
	            //Else this runs if it is true.
	            {
	                 row=1;
	                 //If it is a, it sets the row variable to 1.
	            }
	                
	            else if(rowChar=='c' || rowChar=='C') 
	            //Else this runs if it is true.
	            {
	                 row=2;
	                 //If it is a, it sets the row variable to 2.
	            } 
	            
	            else 
	            //In any other case, this runs.
	            {
	            	System.out.println("Invalid row input. Please enter A, B, or C.");
	            	//This prints out the text and skips a line.
	            }

	            if(colChar=='1') 
	            //This runs if it is true.
	            {
	            	col=0;
	            	//If it is a, it sets the row variable to 0.
	            }
	                
	            else if(colChar=='2') 
	            //Else this runs if it is true.
	            {
	            	col=1;
	            	//If it is a, it sets the row variable to 1.
	            } 
	                
	            else if(colChar=='3') 
	            //Else this runs if it is true.
	            {
	                col=2;
	                //If it is a, it sets the row variable to 2.
	            } 
	               
	            else 
	            //In any other case, this runs.
	            {
	                System.out.println("Invalid column input. Please enter 1, 2, or 3.");
	                //This prints out the text and skips a line.
	            }

	            if(isValidMove(row,col)) 
	            //If this is true, this runs.
	            //It is passed a method with row and col for it to check if it is a valid move.
	            {
	            	gameArray[row][col]=player; 
	            	//This sets the Array at whichever row and column chosen to the designated player that is running right now.
	                valid=true;
	                //This sets the boolean to true to exit the loop.
	            } 
	                
	            else 
	            //In any other case, this runs.
	            {
	            	System.out.println("That spot is already taken or invalid. Try again.");
	            	//This prints out the text and skips a line.
	            }
	        } 
	            
	        else 
	        //In any other case, this runs.
	        {
	        	System.out.println("Invalid input. Please enter a move in the form A1, B2, or C3.");
	        	//This prints out the text and skips a line.
	        }
	    }
	}
	
	/*
	 * This method checks if the move the player makes is valid.
	 */
	public static boolean isValidMove(int row, int col) 
	{
		if(row>=0 && row<3 && col>=0 && col<3 && gameArray[row][col]=="*")
		//If all conditions are met, this runs.
	    {
			return true;
			//This returns true to the method it was passed.
	    }
		 	return false;
		 	//Else it will return false.
	 }
	
	/*
	 * This switches the player after every turn.
	 * It checks who is playing and switches to the other,
	 */
	public static void switchPlayer() 
	{
		if(player=="X") 
		//If the coditons are met, this runs.
		{
		    System.out.println("It's Luigi's (O) turn!");
		    //This prints out the text and skips a line.
		    player="O";
		    //This sets the player object to O.
		    playerName="Luigi";
		    //This sets the playerName object to Luigi.
		} 
		    
	    else 
	    //In any other case, this runs.
	    {
	        System.out.println("It's Mario's (X) turn!");
	    	//This prints out the text and skips a line.
		player="X";
		//This sets the player object to X.
		playerName="Mario";
	        //This sets the playerName object to Mario.
		}
	}
	
	/*
	 * This method checks if there is a win after ever move.
	 * If there is a win, it returns true to signal someone won.
	 * If not, it returns false to keep the game going.
	 */
	public static boolean checkWin(String[][] game) 
	{
		for(int i=0;i<=game.length-1;i++) 
		//This goes through the whole array looping for rows.
		//Traverses through the rows.
		{
			if(gameArray[i][0]==player && gameArray[i][1]==player && gameArray[i][2]==player) 
			//If the Array at index i, plus the 0, 1, and 2 columns are all equal to whichever player, this runs.
			{
				return true;
				//Returns true to signal someone won and the game is over.
	        }
	    }

		for(int i=0;i<=game.length-1;i++) 
		//This goes through the whole array looping for columns.
		//Traverses through the columns.	
	    {
	    	if(gameArray[0][i]==player && gameArray[1][i]==player && gameArray[2][i]==player)
	    	//If the Array at the 0, 1, and 2 rows plus the i index are all equal to whichever player, this runs.
	        {
	        	 return true;
	        	 //Returns true to signal someone won and the game is over.
	        }
	    }

	    /*
	     * These next two if statements check if there is a diagonal win.
	     */
	    if(gameArray[0][0]==player && gameArray[1][1]==player && gameArray[2][2]==player)
	    //If the Array at the 0 row+0 column, 1 row+1 column, and 2 row+2 column are all equal to whichever player, this runs.
	    {
	    	return true;
	    	//Returns true to signal someone won and the game is over.
	    }

	    if (gameArray[0][2] == player && gameArray[1][1] == player && gameArray[2][0] == player) 
	    //If the Array at the 0 row+2 column, 1 row+1 column, and 2 row+0 column are all equal to whichever player, this runs.
	    {
	    	return true;
	    	//Returns true to signal someone won and the game is over.
	    }
	    
	        return false;
	        //Else it will return false to continue the game.
	    }

	/*
	 * This checks if there are any ties in the game.
	 */
	public static boolean isTie(String[][] game) 
	{
		for (int i=0;i<=game.length-1;i++) 
		//This goes through the whole array looping for rows.
		//Traverses through the columns.
		{ 
		    for (int j=0;j<=game[i].length-1;j++) 
		    //This goes through the whole array looping for columuns.
		    //Traverses through the rows.
		    { 
		        if(gameArray[i][j]=="*") 
			//If the Array at i and j are equal to *, this runs.
	            {
		        return false;
			//Returns false, meaning there is no space, meaning its a tie.
	            }
	        }
	    }
		    return true;
		    //Else it returns true, meaning not a tie.
	}
	
	/*
	 * This goes through each row and column and prints out the board of the plays.
	 */
	public static void boardPrinter(String[][] game) 
	{
	    System.out.println("  1 2 3");
	    //This prints out the text for the columns and skips a line.
	    char rowLabel='A';
	    //This declares a new char that is set equal to A for the rows.
	    for(int i=0;i<=game.length-1;i++) 
	    //This goes through the whole array looping for rows.
	    //Traverses through the columns.
	    {
	        System.out.print(rowLabel+" ");
	        //This prints out the text with the rowLabel.
	        for(int j=0;j<=game[i].length-1;j++) 
	        //This goes through the whole array looping for columuns.
		//Traverses through the rows.
	        {
	            System.out.print(game[i][j]+" ");
	            //This prints out the element at the index i for row element and the index j for column element.
	        }
	        
	        System.out.println();
	        //This skips a line to make it look neater.
	        rowLabel++;
	        //Adds one to the rowLabel, basically makes A to B and so on.
	    }
	}
}
