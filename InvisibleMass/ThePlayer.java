/**
 * This classes sole purpose is to keep tracking of the players position.
 */
public class ThePlayer {
	
	//Data Attributes
	
	/**
  	 * This creates private data. Basically the numbers we will pass it.
 	 * It is also what the class needs in order to function.
	 */
		
	private int rPos;
	//This creates the X position
	private int cPos;
	//This creates the Y position
		
	//Constructor
		
	/**
         * This is where I make the characters itself.
	 */
		
	/*
	 * This is making a Character constructor.
         * It has all the variables we have data attributes for above.
	 */
	public ThePlayer()
	{
		rPos=0;
		//This sets their x position to 0.
		cPos=0;
		//This sets their y position to 0.
	}
		
	//Functionality's
		
	/**
	 * This is what the class is going to do when I call it in the main method.
  	 * These are setters and getters to run the nature of the game.
	 * They take things from the data attributes and constructors.
	 */
		
	/*
	 * This gets the position of the players row.
	 */
	public int getRPos()
	{
		return(rPos);
		//This returns the said position.
	}
		
	/*
	 * This sets the position of the players row.
	 */
	public void setRPos(int rPos)
	{
		this.rPos=rPos;
		//This is setting the position of the Character to the int passed.
	}
		
	/*
	 * This gets the position of the players column.
	 */
	public int getCPos()
	{
		return(cPos);
		//This returns the said position.
	}
		
	/*
	 * This sets the position of the players column.
	 */
	public void setCPos(int cPos)
	{
		this.cPos=cPos;
		//This is setting the position of the Character to the int passed.
	}	
}
