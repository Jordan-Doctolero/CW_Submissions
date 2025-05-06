/**
 * This is the puppy dog class where this is the sub/super class.
 * We have inherited attributes and methods from the Parent class.
 * We will also override said methods.
 */
public class PuppyDog extends Dog{
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * It is also what the class needs in order to function.
	 */
			
	 private boolean isFed;
	 //This creates a new boolean.
	 
	 //Constructor
		
	 /**
	  * This is where I make the characters itself.
	  */
							
	 /*
	  * This is making a Doggies constructor.
	  * It has all the variables we have data attributes for above.
	  */
	 public PuppyDog(boolean ad, int a, String n, boolean f)
	 {
		 super(ad, a, n);
		 //This uses the SuperClass to inherits it's attributes.
		 isFed=f;
		 //This sets the initial boolean to what is passed.
	 }
	 
	//Functionality's
		
	/**
	 * This is what the class is going to do when I call it in the main method.
         * These are setters and getters to run the nature of the game.    
         * They take things from the data attributes and constructors.
	 */

	/*
	 * This prints out the text with the age that the dog is.
	 * We are overriding the Parent class method of this.
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " months old!");
		//This prints out said texts with attributes.
	}
	
	/*
	 * This will set isFed to true if the dog is being fed.
	 */
	public void feedPup()
	{
		isFed=true;
		//This sets the boolean equal to true.
	}
	
	/*
	 * This will increase the dog's age by one.
	 * We are overriding the Parent class method of this.
	 */
	public void increaseAge()
	{
		super.increaseAge();
		//This uses super to increase the Age.
		isFed=false;
		//This sets the status of being fed to false.
	}
	
	/*
	 * I worked with Keola to create this since I was absent.
	 * This will return whether or not the dog is adopted.
	 */
	public String toString() 
	{
		if(isFed)
		//If true, this runs.
		{
			return super.toString() +  "I have been fed";
			//Returns the toString of the super class to override and prints the text.
		}
		
		else
		//In any other case, this runs.
		{
			return super.toString() +  "I GET ABUSED!";
			//Returns the toString of the super class to override and prints the text.
		}
	}
}
