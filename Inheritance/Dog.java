/**
 * This is the dog class where this is the parent class.
 * We will make attributes and methods for the dog.
 */
public class Dog {
	//Data Attributes
	
	/**
         * This creates private data. Basically the numbers we will pass it.
	 * It is also what the class needs in order to function.
	 */
	
	protected boolean isAdopted;
	//This creates a new boolean. It is protected so only sub classes can access it.
	protected int age;
	//This creates a new boolean. It is protected so only sub classes can access it.
	protected String name;
	//This creates a new boolean. It is protected so only sub classes can access it.
		
	//Constructor
		
	/**
	 * This is where I make the characters itself.
	 */
						
	/*
	 * This is making a Doggies constructor.
	 * It has all the variables we have data attributes for above.
	 */
	public Dog(boolean ad, int a, String name)
	{
		isAdopted=ad;
		//This sets the initial boolean to what is passed.
		age=a;
		//This sets the initial int to what is passed.
		this.name=name;
		//This sets the initial String to what is passed using this.
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
         * These are setters and getters to run the nature of the game.
         * They take things from the data attributes and constructors.
	 */
	
	/*
	 * This gets the Status of a dog that is adopted or not.
	 */
	public boolean getAdoptionStatus()
	{
		return(isAdopted);
		//This returns the boolean.
	}
	
	/*
	 * This prints out the text with the age that the dog is.
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old!");
		//This prints out said text with attributes.
	}
	
	/*
	 * This will increase the dog's age by one.
	 */
	public void increaseAge()
	{
		age++;
		//Adds one to the age of the dog.
	}
	
	/*
	 * I worked with Keola to create this since I was absent.
	 * This will return whether or not the dog is adopted.
	 */
	public String toString() 
	{
		stateAge();
		//States age to check
		if(isAdopted)
		//If true, this runs.
		{
			return "I've been adopted!";
			//This returns the text.
		}
		
		else
		//In any other case, this runs.
		{
			return "Please Adpot me:(";
			//This returns the text.
		}
	}	
}
