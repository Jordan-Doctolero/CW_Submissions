/**
 * This class keeps track to the game itself and how it will check if it is applied.
 */
public class GameTile {
	//Data Attributes
	
       /**
	* This creates private data. Basically the numbers we will pass it.
	* It is also what the class needs in order to function.
	*/
		
	private boolean hasPlayer;
	//This creates a new boolean.
	private boolean isRevealed;
	//This creates a new boolean.
	private boolean isWall;
	//This creates a new boolean.
		
	//Constructor
		
	/**
 	 * This is where I make the characters itself.
	 */
				
	/*
	 * This is making a Character constructor.
  	 * It has all the variables we have data attributes for above.
	 */
	
	public GameTile()
	{
		hasPlayer=false;
		//This sets the initial boolean to false.
		isRevealed=false;
		//This sets the initial boolean to false.
		isWall=false;
		//This sets the initial boolean to false.
	}
		
	//Functionality's
		
	/**
 	 * This is what the class is going to do when I call it in the main method.
	 * These are setters and getters to run the nature of the game.
  	 * They take things from the data attributes and constructors.
	 */
		
	/*
	 * This gets if the player is in a certain position.
  	 */
	public boolean getHasPlayer()
	{
		return(hasPlayer);
		//This returns the boolean.
	}
			
	/*
	 * This sets the player boolean to whatever it needs to be.
	 */
	public void setHasPlayer(boolean hasPlayer)
	{
		this.hasPlayer=hasPlayer;
		//This is setting the boolean to if it needs to be true or false.
	}
		
	/*
	 * This gets if the tile is revealed in a certain position.
	 */
	public boolean getIsRevealed()
	{
		return(isRevealed);
		//This returns the boolean.
	}
		
	/*
	 * This sets the revealed boolean to whatever it needs to be.
  	 */
	public void setIsRevealed(boolean isRevealed)
	{
		this.isRevealed=isRevealed;
		//This is setting the boolean to if it needs to be true or false.
	}
		
	/*
	 * This gets and checks if it is a wall in a certain position.
	 */
	public boolean getIsWall()
	{
		return(isWall);
		//This returns the boolean.
	}
			
	/*
	 * This sets the wall boolean to whatever it needs to be.
	 */
	public void setIsWall(boolean isWall)
	{
		this.isWall=isWall;
		//This is setting the boolean to if it needs to be true or false.
	}
		
	/*
	 * This is a to String method that gets rid of the @ stuff.
	 * We can use this instead of calling the actual getter.
	 */
	public String toString() 
	{
		if(hasPlayer)
		//If this condition is met, it runs.
        	{
        		return ":D";
        		//Returns String.
        	}
			
	        if(!isRevealed) 
	        //If this condition is met, it runs.
	        {
	        	return " ";
	        	//Returns String.
	        }
	        
	        if(isWall) 
	        //If this condition is met, it runs.
	        {
	        	return "X";
	        	//Returns String.
	        }
	        
	        else
	        //In any other case, this runs.
	        {
		        return "O";
		        //Returns String.
	        }
	    }
}
