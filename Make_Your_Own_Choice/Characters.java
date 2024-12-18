/**
 * This is where we make the Characters.
 * The Characters use the attributes and functionalities here to run the game.
 * It is mostly the basics of what is needed.
 * @Jordan_Doctolero
 */
public class Characters {

	//Data Attributes
	
   /**
	* This creates private data. Basically the numbers we will pass it.
	* It is also what the class needs in order to function.
	*/
	
	private String name;
	private String titanName;
	private String material;
	//These are String attributes for certain Character things.
	//They are private since they are only in this method.
	private int height;
	private int titanHeight;
	private int durability;
	private int titanDurability;
	private int health;
	private int titanHealth;
	private int allTitanHealth;
	private int strength;
	private int titanStrength;
	//These are int attributes for certain Character traits.
	//They are private since they are only in this method.
	
	//Constructor
	
	/**
	 * This is where I make the characters itself.
	 */
	
	/*
	 * This is making a Character constructor.
	 * It has all the variables we have data attributes for above.
	 */
	public Characters
		    (String n, String tn, String m,
			int h, int th, int d, int td, int he, int the, int athe, int s, int ts)
	{
		name=n;
		titanName=tn;
		material=m;
		//These are all the strings.
		height=h;
		titanHeight=th;
		durability=d;
		titanDurability=td;
		health=he;
		titanHealth=the;
		allTitanHealth=athe;
		strength=s;
		titanStrength=ts;
		//These are all the ints.
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * These are setters and getters to run the nature of the game.
	 * They take things from the data attributes and constructors.
	 */
	
	/*
	 * This will get the name of the character chosen.
	 */
	public String getName()
	{
		return(name);
		//This returns the name that is passed from the constructor and/or after it is set.
	}
	
	/*
	 * This will set the name of the character chosen.
	 */
	public void setName(String n)
	{
		this.name=n;
		//This is setting the name of this Character to the String passed.
	}
	
	/*
	 * This will get the titan name of the character chosen.
	 */
	public String getTitanName()
	{
		return(titanName);
		//This returns the titan name that is passed from the constructor and/or after it is set.
	}
	
	/*
	 * This will set the titan name of the character chosen.
	 */
	public void setTitanName(String tn)
	{
		this.titanName=tn;
		//This is setting the titan name of the Character to the String passed.
	}
	
	/*
	 * This will get the material of the ODM gear of the character chosen.
	 */
	public String getMaterial()
	{
		return(material);
		//This returns the material of the ODM gear of the character chosen.
	}
	
	/*
	 * This will set the material of the ODM gear of the character chosen.
	 */
	public void setMaterial(String m)
	{
		this.material=m;
		//This is setting the material of the ODM gear of the Character to the String passed.
	}
	
	/*
	 * This will get the height of the character chosen.
	 */
	public int getHeight()
	{
		return(height);
		//This returns the height of the character chosen.
	}
	
	/*
	 * This will set the height of the character chosen.
	 */
	public void setHeight(int h)
	{
		this.height=h;
		//This is setting the height of the of the Character to the int passed.
	}
	
	/*
	 * This will get the titan height of the character chosen.
	 */
	public int getTitanHeight()
	{
		return(titanHeight);
		//This returns the titan height of the character chosen.
	}
	
	/*
	 * This will set the titan height of the character chosen.
	 */
	public void setTitanHeight(int th)
	{
		this.titanHeight=th;
		//This is setting the titan height of the of the Character to the int passed.
	}
	
	/*
	 * This will get the durability of the character chosen.
	 */
	public int getDurability()
	{
		return(durability);
		//This returns the durability of the character chosen.
	}
	
	/*
	 * This will set the durability of the character chosen.
	 */
	public void setDurability(int d)
	{
		this.durability=d;
		//This is setting the durability of the of the Character to the int passed.
	}
	
	/*
	 * This will get the titan durability of the character chosen.
	 */
	public int getTitanDurability()
	{
		return(titanDurability);
		//This returns the titan durability of the character chosen.
	}
	
	/*
	 * This will set the titan's durability of the character chosen.
	 */
	public void setTitanDurability(int td)
	{
		this.titanDurability=td;
		//This is setting the titan durability of the of the Character to the int passed.
	}
	
	/*
	 * This will get the health of the character chosen.
	 */
	public int getHealth()
	{
		return(health);
		//This returns the health of the character chosen.
	}
	
	/*
	 * This will set the health of the character chosen.
	 */
	public void setHealth(int he)
	{
		this.health=he;
		//This is setting the health of the of the Character to the int passed.
	}
	
	/*
	 * This will get the titan health of the character chosen.
	 */
	public int getTitanHealth()
	{
		return(titanHealth);
		//This returns the titan health of the character chosen.
	}
	
	/*
	 * This will set the titan health of the character chosen.
	 */
	public void setTitanHealth(int the)
	{
		this.titanHealth=the;
		//This is setting the titan health of the of the Character to the int passed.
	}
	
	/*
	 * This will get the ALL titan's health's.
	 */
	public int getallTitanHealth()
	{
		return(allTitanHealth-200);
		//This returns ALL titan's health's.
	}
	
	/*
	 * This will set ALL Of the titan's health's.
	 */
	public void setAllTitanHealth(int athe)
	{
		this.allTitanHealth=athe;
		//This is setting the height of the of ALL the titan's to the int passed.
	}
	
	/*
	 * This will get the strength of the character chosen.
	 */
	public int getStrength()
	{
		return(strength);
		//This returns the strength of the character chosen.
	}
	
	/*
	 * This will set the strength of the character chosen.
	 */
	public void setStrength(int s)
	{
		this.strength=s;
		//This is setting the strength of the of the Character to the int passed.
	}
	
	/*
	 * This will get the titan strength of the character chosen.
	 */
	public int getTitanStrength()
	{
		return(titanStrength);
		//This returns the titan strength of the character chosen.
	}
	
	/*
	 * This will set the titan strength of the character chosen.
	 */
	public void setTitanStrength(int ts)
	{
		this.titanStrength=ts;
		//This is setting the titan strength of the of the Character to the int passed.
	}
	
	/*
	 * This is a to String method that gets rid of the @ stuff.
	 */
	public String toString()
	{
		return "This is your character!";
		//This will return any time you call the method.
	}
	
}
