import java.util.Scanner;
//This imports a scanner to take it what the player is inputting

/**
 * This is another project where we use all we learned.
 * This is an invisible mass.
 * It uses extra classes, logic, and a scanner to make the game run.
 * The player has to escape a maze they are given.
 * @Jordan_Doctolero
 */
public class Main {
	
	 public static final int size=5;
	 //This declares an int with a final value of 5.
	 public static int goalRow=0;
	 //This declares an int with a value of 0 for the goal of the row.
	 public static int goalCol=0;
	 //This declares an int with a value of 0 for the goal of the column.
     public static GameTile[][] board=new GameTile[size][size];
     //This declares a new board with the attributes of the GameTile class passed the parameters.
     public static ThePlayer player=new ThePlayer();
     //This declares a new player with the attributes of the ThePlayer class.

     /*
      * This is where the magic happens.
      * We will be calling the methods in order to run the game.
      * This will keep track of all things we need for the invisible maze.
      */
	public static void main(String[] args) {
		initializeBoard(board);
		//This calls the method to initialize and create the actual game board.
		randomMazeChooser();
		//This chooses one of the mazes at random for the player to play.
		
		Scanner gameInput=new Scanner(System.in);
		//This declares a Scanner object.
        boolean playing=true;
        //This declares a boolean set equal first to true.
        
        while(playing)
        //While the condition is met, this runs.
        {
        	boardPrinter(board);
        	//This calls the method and passes it the board.
        	System.out.println(" ");
        	//This skips a line to make it look neater.
        	System.out.println("Make a move to escape the maze!");
        	//This prints the text shown and skips a line.
        	System.out.print("(W = up, S = down, A = left, D = right):");
        	//This prints out the text shown.
            String move=gameInput.nextLine();
            //This takes the input the player made and is made the String of their move.
            playing=playerMove(move);
            //This sets the boolean equal to whatever is returned from the method that is passed the move the player makes.
        }
        
        gameInput.close();
        //This closes the scanner to avoid any leaks.
		
	}
	
	/*
	 * This initializes and creates the actual game board by using for loops.
	 */
	public static void initializeBoard(GameTile[][] board)
	{
		for(int i=0;i<=board.length-1;i++) 
		//This goes through the whole array looping for rows.
		//Traverses through the columns.
		{
			for(int j=0;j<=board[i].length-1;j++)  
            //This goes through the whole array looping for columns.
    		//Traverses through the rows.
            {
                board[i][j]=new GameTile();
                //This sets the index at i and j equal to a new value that replaces the null in it.
            }
        }
	}
	
	/*
	 * This randomly chooses a maze for the player to play.
	 * Depending on which maze, it will set walls, start place, and end goal accordingly.
	 */
	public static void randomMazeChooser()
	{
		int randomMaze=(int)(Math.random()*3)+1;
		//This chooses a random number of 1 or 2 to choose the random Player.
	    if(randomMaze==1) 
	    //If the number from Math.random is equal to 1, this runs.
	    {
	    	board[0][2].setIsWall(true);
	    	//This sets a wall at the coordinates.
	        board[0][3].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[0][4].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[1][0].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[2][0].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[2][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[2][2].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[2][3].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][0].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][2].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][0].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][4].setIsWall(true);
	        //This sets a wall at the coordinates.

	        board[0][0].setHasPlayer(true);
	        //This sets where the assumption of where the player is in the ThePlayer class.
	        board[0][0].setIsRevealed(true);
	        //This sets where the assumption of where the revealed tile is in the ThePlayer class.
	        
	        player.setRPos(0);
	        //This sets the players Row.
	        player.setCPos(0);
	        //This sets the players Column.
	        
	        goalRow=4;
	        //This sets the goal of the Row.
	        goalCol=2;
	        //This sets the goal of the Column.   
	    } 
	    
	    else if(randomMaze==2) 
		//If the number from Math.random is equal to 2, this runs.
		{
	    	board[1][1].setIsWall(true);
	    	//This sets a wall at the coordinates.
	        board[1][2].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][0].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][2].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][3].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][0].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][2].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[4][3].setIsWall(true);
	        //This sets a wall at the coordinates.

		    board[4][4].setHasPlayer(true);
		    //This sets where the assumption of where the player is in the ThePlayer class.
		    board[4][4].setIsRevealed(true);
		    //This sets where the assumption of where the revealed tile is in the ThePlayer class.
		    
		    player.setRPos(4);
		    //This sets the players Row.
	        player.setCPos(4);
	        //This sets the players Column.
	        
	        goalRow=1;
	        //This sets the goal of the Row.
	        goalCol=0;
	        //This sets the goal of the Column.        
		 } 
	        
	    else 
	    //In any other case(3), this runs.
	    {
	    	board[0][1].setIsWall(true);
	    	//This sets a wall at the coordinates.
	        board[0][3].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[1][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[2][1].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[2][3].setIsWall(true);
	        //This sets a wall at the coordinates.
	        board[3][2].setIsWall(true);
	        //This sets a wall at the coordinates.

	        board[2][2].setHasPlayer(true);
	        //This sets where the assumption of where the player is in the ThePlayer class.
	        board[2][2].setIsRevealed(true);
	        //This sets where the assumption of where the revealed tile is in the ThePlayer class.

	        player.setRPos(2);
	        //This sets the players Row.
	        player.setCPos(2);
	        //This sets the players Column.
	        
	        goalRow=0;
	        //This sets the goal of the Row.
	        goalCol=0;
	        //This sets the goal of the Column.  
	    }
	    
	}
	
	/*
	 * This goes through each row and column and prints out the board of the plays.
	 */
	public static void boardPrinter(GameTile[][] board) 
	{
		System.out.println("╔═══════╗");
		//This prints the top of the border and skips a line.
		for(int i=0;i<=board.length-1;i++) 
	    //This goes through the whole array looping for rows.
		//Traverses through the columns.
	    {
			System.out.print("║");
	        //This prints out the sides of the border.
	        for(int j=0;j<=board[i].length-1;j++) 
	        //This goes through the whole array looping for columns.
			//Traverses through the rows.
	        {
	        	System.out.print(board[i][j].toString());
	            //This prints out the element at the index i for row element and the index j for column element.
	        	//Uses the toString method to print out any element that is there without the code.
	        }
	        
	        System.out.println("║");
	        //This prints out the other small side of the border and skips a line
	    }
        
		System.out.println("╚═══════╝");
        //This prints out the bottom of the border and skips a line.
		
    }
	
	/*
	 * This method handles the logic to check and make the players move.
	 * Depending on their move, it will add or subtract values.
	 * It tests to see if it is a valid move and it then moves the player.
	 */
	public static boolean playerMove(String theMove)
	{
		int r=player.getRPos();
		//This declares a new int set equal to the row position of the player.
		int c=player.getCPos();
		//This declares a new int set equal to the column position of the player.
		
		int newR=r;
		//This declares a new int set equal to the r int.
		int newC=c;
		//This declares a new int set equal to the c int.
		
		if(theMove.equalsIgnoreCase("W"))
		//If the condition is met, this runs.
		{
			newR--;
			//Subtracts one from the new row position.
		}
		
		else if(theMove.equalsIgnoreCase("S"))
		//Else if the condition is met, this runs.
		{
			newR++;
			//Adds one to the new row position.
		}
		
		else if(theMove.equalsIgnoreCase("A"))
		//Else if the condition is met, this runs.
		{
			newC--;
			//Subtracts one from the new column position.
		}
		
		else if(theMove.equalsIgnoreCase("D"))
		//Else if the condition is met, this runs.
		{
			newC++;
			//Adds one to the new column position.
		}
		
		else
		//In any other case, this runs.
		{
			System.out.println("Invalid Input...Try Again!");
			//This prints the text and skips a line.
			return true;
			//Returns true to continue the game.
		}
		
		if(!isInBounds(newR, newC))
		//If isInBounds is not in bounds, this runs.
		{
			System.out.println("Out of bounds...Try Again!");
			//This prints the text and skips a line.
			return true;
			//Returns true to continue the game.
		}
		
		GameTile currentTile=board[r][c];
		//This creates a shortcut and grabs the current tile the player is on.
		GameTile targetTile=board[newR][newC];
		//This creates a shortcut and grabs the tile the player wants to move to.
		
		if(targetTile.getIsWall())
		//If the targetTile is a wall, this runs.
		{
			targetTile.setIsRevealed(true);
			//This reveals the wall.
			System.out.println("You hit a wall...Try Again!");
			//This prints the text and skips a line.
		}
		
		else
		//In any other case, this runs.
		{
			currentTile.setHasPlayer(false);
			//This takes the currentTile and sets HasPlayer to false.
			currentTile.setIsRevealed(true);
			//This takes the currentTile and sets isRevaled to true.
			targetTile.setHasPlayer(true);
			//This takes the targetTile and sets HasPlayer to true.
			targetTile.setIsRevealed(true);
			//This takes the targetTile and sets isRevaled to true.
			player.setRPos(newR);
			//This sets the players new row position to wherever they moved to.
			player.setCPos(newC);
			//This sets the players new column position to wherever they moved to.
		}
		
		if(newR==goalRow && newC==goalCol)
		//If the conditions are met, this runs.
		{
			boardPrinter(board);
			//This calls the method and is passed the board.
			System.out.print("Good Job, you escaped the maze!");
			//This prints out the text congratulating the player.
			return false;
			//Returns false to end the game.
		}
		
		return true;
		//Else, returns true to continue the game.
	}
	
	/*
	 * This method checks if the move the player makes is in the bounds.
	 * It will be called in the above method to check.
	 */
	public static boolean isInBounds(int r, int c) 
	{
        if(r>=0 && r<size && c>=0 && c<size)
        //If the conditions are met, this runs.
        {
        	return true;
        	//Returns true for in bounds.
        }
        
        return false;
        //Else returns false for out of bounds.
    }
}
