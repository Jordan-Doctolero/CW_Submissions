import java.util.Scanner;
//This imports a Scanner into the class that we can use to scan the inputs.

/**
 * This is the recreation of Attack on Titan in a game format.
 * You will be able play as one of four name.
 * You will be able to follow paths and choose what you want to do.
 * Depending on what you do, certain events may or may not occur.
 * This is ran off logic and loops.
 * This is the final project for Semester 1.
 * @Jordan_Doctolero
 */
public class Main {

	public static Scanner gameReader = new Scanner(System.in);
	//This declares the Scanner as a Data Attribute that I can call any time throughout the class.
	
	/*
	 * This is where I will be calling all the methods I create underneath to run the game.
	 * It will run in the order I put it in to have a flow for the game.
	 * Certain paths will follow how the real anime/manga takes place.
	 * Certain paths will deviate but tie back in.
	 * Certain paths will be completely different.
	 */
	public static void main(String[] args) {
		
		
		//Part 1 of Ep 1:
		Characters name=theNameSelection();	
		System.out.print(name);
		//This sets theNameSelection screen to the name of Characters.
		//It is then printed out.
		prequel(name);
		//The prequel is passed name so it can run with the attributes declared in theNameSelection.
		//This calls the method below that tells them all their Character Attributes.
		theGame(name);
		//The Game is passed name so it can with the attributes found and declared in the above methods.
		//This is where the actual game will be played.

		gameReader.close();
		//This closes the scanner to avoid leaks.
	}
	
	/*
	 * This is the method where the player will go through Character Selection.
	 * It uses logic and loops to get them to choose who they want to play as.
	 * They are allowed to choose their height.
	 * Their attributes are set as close as they are to the anime/manga.
	 */
	public static Characters theNameSelection() 
	{
		Characters yourPlayer=new Characters
				("", "","",
				0, 0 , 300, 0, 400, 0, 0, 0, 0);
		//This instatiates a new Character that is the player you are playing is.
		//It uses data attributes from the Character class.
		//It is already passed the players base durability and health.
		
		String one="Eren Yeager";
		//This declares a string for the first character.
		String two="Levi Ackerman";
		//This declares a string for the second character.
		String three="Mikasa Ackerman";
		//This declares a string for the third character.
		String four="Reiner Braun";
		//This declares a string for the fourth character.
		

		System.out.println("Hello! Welcome to the world of Attack on Titan.");
		//This prints out this statement to start the game off.
		
		boolean nameSelected=true;
		//This declares a boolean variable and sets it equal to true.
		//nameSelected because it is choosing a character.
		
		while(nameSelected)
		//While this loop is true, it will run until updated to false.
		{
		System.out.println("Below are four name:");
		//This prints out this text.
		System.out.println("1)Eren Yeager  2)Levi Ackerman  3)Mikasa Ackerman  4)Reiner Braun");
		System.out.println("For development purposes...ONLY EREN HAS A MOST FULLY FLEDGED PATHS!!!");
		//Thjs line of print statements shows the user four name they can play as.
		System.out.println("Who would you want to play as?");
		//They are prompted to choose who they want to play as.
	
		String gameInput = gameReader.nextLine();
		//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
		
		if(gameInput.equals("1") || gameInput.equalsIgnoreCase("Eren Yeager"))
		//If either of these is what the user types, it will run this if statement.
		{
			System.out.println("You have chosen to be " + one);
			//This prints out who they have chosen to be.
			yourPlayer.setName(one);
			//This sets the players name to the one String declared above.
			yourPlayer.setTitanName("Attack Titan");
			//This sets the players Titan Name to the Attack Titan. One of the nine titans.
			yourPlayer.setMaterial("Carbon Steel");
			//This sets the players ODM blade material.
			yourPlayer.setTitanDurability(600);
			//This sets the players base Titan Durability.
			yourPlayer.setTitanHeight(1500);
			//This sets the players Titan Height.
			yourPlayer.setTitanHealth(3000);
			//This sets the players base Titan Health.
			yourPlayer.setAllTitanHealth(800);
			yourPlayer.setStrength(125);
			//This sets the players base strength.
			yourPlayer.setTitanStrength(700);
			//This sets the players base Titan strength.
			nameSelected=false;
			//This sets the boolean to false and it exits the loop.
			System.out.println("");
			//This skips a line to make it look neater.
		}
		
		else if(gameInput.equals("2") || gameInput.equalsIgnoreCase("Levi Ackerman"))
		//If the above statement is false.
		//The code checks this.
		//If either of these is what the user types, it will run this if statement.
		{
			System.out.println("You have chosen to be " + two);
			//This prints out who they have chosen to be.
			yourPlayer.setName(two);
			//This sets the players name to the two String declared above.
			yourPlayer.setMaterial("Carbon Steel");
			//This sets the players ODM blade material.
			yourPlayer.setStrength(300);
			//This sets the players base strength.
			nameSelected=false;
			//This sets the boolean to false and it exits the loop.
			System.out.println("");
			//This skips a line to make it look neater.
		}
		
		else if(gameInput.equals("3") || gameInput.equalsIgnoreCase("Mikasa Ackerman"))
		//If the above statement is false.
		//The code checks this.
		//If either of these is what the user types, it will run this if statement.
		{
			System.out.println("You have chosen to be " + three);
			//This prints out who they have chosen to be.
			yourPlayer.setName(three);
			//This sets the players name to the three String declared above.
			yourPlayer.setMaterial("Carbon Steel");
			//This sets the players ODM blade material.
			yourPlayer.setStrength(140);
			//This sets the players base strength.
			nameSelected=false;
			//This sets the boolean to false and it exits the loop.
			System.out.println("");
			//This skips a line to make it look neater.
		}
		
		else if(gameInput.equals("4") || gameInput.equalsIgnoreCase("Reiner Braun"))
		//If the above statement is false.
		//The code checks this.
		//If either of these is what the user types, it will run this if statement.
		{
			System.out.println("You have chosen to be " + four);
			//This prints out who they have chosen to be.
			yourPlayer.setName(four);
			//This sets the players name to the four String declared above.
			yourPlayer.setTitanName("Amored Titan");
			//This sets the players Titan Name to the Amored Titan. One of the nine titans.
			yourPlayer.setMaterial("Carbon Steel");
			//This sets the players ODM blade material.
			yourPlayer.setTitanHeight(1500);
			//This sets the players Titan Height.
			yourPlayer.setTitanDurability(900);
			//This sets the players base Titan Durability.
			yourPlayer.setTitanHealth(5000);
			//This sets the players base Titan Health.
			yourPlayer.setStrength(500);
			//This sets the players base strength.
			yourPlayer.setTitanStrength(1000);
			//This sets the players base Titan Strength.
			nameSelected=false;
			//This sets the boolean to false and it exits the loop.
			System.out.println("");
			//This skips a line to make it look neater.
		}
		
		else
		//In any other case, this runs.
		{
			System.out.print("Please try again");
			//This prints and re prompts the user to pick a character by using the loop.
			System.out.println("");
			//This skips a line to make it look neater.
		}
		
		}
		
		
		boolean validHeight=true;
		//This declares a boolean variable and sets it equal to true.
		//validHeight because they are choosing a height.
		
		while(validHeight)
		//While this loop is true, it will run until updated to false.
		{
		System.out.println("What height do you want to be?(In CM that is between 160cm and 185cm. "
				+ "DO NOT input any letters including \"cm\". "
				+ "DO NOT input any name.");
		//This prompts the user to set their height. 
		//It has to be less than or equal to 160 or greater than or equal to 185.
		//It can't have any letters including 'cm'.
		
		//This instatiates a scanner using the data attribute of it. It will be scanning any ints.
		int gameInputs = gameReader.nextInt();
		
		if(gameInputs<=185 && gameInputs>=160)
		//If the above if is false, this checks.
		//If their height is less than 185 or greater than 160, this runs.
		{
			yourPlayer.setHeight(gameInputs);
			//This sets the players height to what they inputed.
			validHeight=false;
			//This sets the boolean to false and it exists the loop.
		}
		
		else
		//If their height is not between the bounds, this runs.
			{
				System.out.println("Please pick a different height.");
				//This tells them to pick a different height and prompts them to do just that.
			}
			
		}
		return yourPlayer;
		}
	
	
	
	/*
	 * This method is before the game starts.
	 * It just prints out all the information and attributes of the character.
	 * I use logic to see what name is chosen from the previous method.
	 * I use accessor methods to gain access to the traits and print them out for the player.
	 */
	public static String prequel(Characters name)
	{
		if(name.getName()=="Eren Yeager")
		//If the player has chosen Eren Yeager and the name getName method is that, this will run.
		{
		System.out.println("");
		System.out.println("You are " + name.getName());
		//This prints out who they are playing as.
		System.out.println("Your titan is " + name.getTitanName());
		//This prints out what titan they are playing as.
		System.out.println("Your height is " + name.getHeight() + "cm");
		//This prints out what they have chosen their height to be in cm.
		System.out.println("Your titan height is " + name.getTitanHeight() + "cm");
		//This prints out what their titan height is in cm.
		System.out.println("Your durability is " +name.getDurability() + "/300");
		//This prints out what their durability is out of 300.
		System.out.println("Your titans durability is " + name.getTitanDurability()+"/600");
		//This prints out what their titan durability is out of 600.
		System.out.println("Your health is " + name.getHealth() + "/400");
		//This prints out what their health is out of 400.
		System.out.println("Your titan health is " + name.getTitanHealth()+"/3000");
		//This prints out what their titan's health is out of 3000.
		System.out.println("Your strength is " + name.getStrength());
		//This prints out what their strength is.
		System.out.println("The material of the ODM blades are " + name.getMaterial());
		//This prints out the material that their ODM blades are made of.
		System.out.println("Your titan strength is " + name.getTitanStrength());
		//This prints out what their titan's strength is.
		System.out.println();
		//This skips a line to make it look neater.
		}
		
		if(name.getName()=="Levi Ackerman")
		//If the player has chosen Levi Ackerman and the name getName method is that, this will run.
		{
			System.out.println("You are " + name.getName());
			//This prints out who they are playing as.
			System.out.println("Your height is " + name.getHeight() + "cm");
			//This prints out what they have chosen their height to be in cm.
			System.out.println("Your durability is " +name.getDurability() + "/300");
			//This prints out what their durability is out of 300.
			System.out.println("Your health is " + name.getHealth() + "/400");
			//This prints out what their health is out of 400.
			System.out.println("Your strength is " + name.getStrength());
			//This prints out what their strength is.
			System.out.println("The material of the ODM blades are " + name.getMaterial());
			//This prints out the material that their ODM blades are made of.
			System.out.println();
			//This skips a line to make it look neater.
		}
		
		if(name.getName()=="Mikasa Ackerman")
		//If the player has chosen Mikasa Ackerman and the name getName method is that, this will run.
		{
			System.out.println("You are " + name.getName());
			//This prints out who they are playing as.
			System.out.println("Your height is " + name.getHeight() + "cm");
			//This prints out what they have chosen their height to be in cm.
			System.out.println("Your durability is " +name.getDurability() + "/300");
			//This prints out what their durability is out of 300.
			System.out.println("Your health is " + name.getHealth() + "/400");
			//This prints out what their health is out of 400.
			System.out.println("Your strength is " + name.getStrength());
			//This prints out what their strength is.
			System.out.println("The material of the ODM blades are " + name.getMaterial());
			//This prints out the material that their ODM blades are made of.
			System.out.println();
			//This skips a line to make it look neater.
		}
		
		if(name.getName()=="Reiner Braun")
		//If the player has chosen Reiner Braun and the name getName method is that, this will run.
		{
		System.out.println("You are " + name.getName());
		//This prints out who they are playing as.
		System.out.println("Your titan is " + name.getTitanName());
		//This prints out what titan they are playing as.
		System.out.println("Your height is " + name.getHeight() + "cm");
		//This prints out what they have chosen their height to be in cm.
		System.out.println("Your titan height is " + name.getTitanHeight() + "cm");
		//This prints out what they have their titan's height is to in cm.
		System.out.println("Your durability is " +name.getDurability() + "/300");
		//This prints out what their durability is out of 300.
		System.out.println("Your titans durability is " + name.getTitanDurability()+"/600");
		//This prints out what their titan's durability is out of 600.
		System.out.println("Your health is " + name.getHealth() + "/400");
		//This prints out what their health is out of 400.
		System.out.println("Your titan health is " + name.getTitanHealth()+"/3000");
		//This prints out what their titan's health is out of 3000.
		System.out.println("Your strength is " + name.getStrength());
		//This prints out what their strength is.
		System.out.println("The material of the ODM blades are " + name.getMaterial());
		//This prints out the material that their ODM blades are made of.
		System.out.println("Your titan strength is " + name.getTitanStrength());
		//This prints out what their titan's strength is.
		
		System.out.println();
		//This skips a line to make it look neater.
		}
		
		return "Try Again";
		//If nothing is able to run, this is returned.
		
	}
	
	/*
	 * This is the method that will run the whole game.
	 * It will prompt them with the story and they will choose the different paths they will take.
	 * It is ran by logic, booleans, loops, and everything we have learned combined.
	 * The different character paths are here. 
	 * Each character has different choices which ALL lead to different endings.
	 */
	public static void theGame(Characters name) 
	{
		
		boolean start=true;
		//This declares a boolean variable and sets it equal to true.
		//start becuase it is starting the game.
		
		System.out.println("Do you want to continue?");
		//This asks the user if they want to continue to the real game.
		while(start)
		//While this loop is true, it will run until updated to false.
		{	
		String gameInput = gameReader.nextLine();
		//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
		
		if(gameInput.equalsIgnoreCase("Yes"))
		//If the user Inputs Yes, this will start to run. 
	{
			if(name.getName().equals("Eren Yeager"))
			//If the players name is equal to Eren Yeager, this will continue to run.
			{
				System.out.println("20000 Years Ago the world experienced a life turning event...");
				System.out.println("Titans...The beings that haunt human life.");
				System.out.println("The society you live would about to change forever.");
				System.out.println("You are the main character..");
				//These above four lines is basically the introduction to the character.
				System.out.println("");
				//This skips a line to make it look neater.
				System.out.println("Mikasa: Eren...(As you dream of blood all over the field with giant humaoinds roaming.)");
				System.out.println("You suddenly awaken");
				System.out.println("\"Oh Mikasa.\"");
				//These are the first part of the dialogue.
				//It explains the context of the situation.
				System.out.println("What do you want to say now?:");
				//This prompts the user to choose a choice of what they want to do.
				String choice1="Sorry I was sleeping, let's head back to the house now...";
				String choice2="I didn't collect enough lumber, let me go back out for a little.";
				//These declares two String variables that are two different choices to choose from.
				
				boolean isValid=true;
				//This declares a boolean variable and sets it equal to true.
				//isValid to see if the input is valid.
				boolean isValids=true;
				//This declares a boolean variable and sets it equal to true.
				//isValids to see if the input is valid.
				boolean isChoice=true;
				//This declares a boolean variable and sets it equal to true.
				//isChoice to see if the input is a valid choice.
				boolean isChoices=true;
				//This declares a boolean variable and sets it equal to true.
				//isChoices to see if the input is a valid choice.
			
				while(isValid)
				//While this loop is true, it will run until updated to false.
				{
				System.out.println("A)" + choice1);
				System.out.println("B)" + choice2);		
				//These prints out their two choices.
				String gameInputs = gameReader.nextLine();
				//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
				
				if(gameInputs.equalsIgnoreCase("A"))
				//If the input the player uses is A, this runs.
				{
					System.out.println("\"Sorry I was sleeping, let's head back to the house now...\"");
					System.out.println("Mikasa: Okay..");
					System.out.println("You guys head home as you see the Survey Corps walking back in..");
					System.out.println("The Survey Corps with their head down and you see two Speciemens.");
					System.out.println("Levi Ackerman and Erwin Smith");
					System.out.println("You smile and think to yourself, \"I want to join.\"");
					System.out.println("You guys head back home.");
					System.out.println("Mikasa tells your mom and dad:");
					System.out.println("Mikasa: Eren wants to join the Survey Corps");
					System.out.println("Your mom explodes on you but your father tells you he will tell you what is"
							+ "in his basement when he gets home...");
					System.out.println("\"Oiii Mikasa, why'd you do that\"");
					System.out.println("They had the right to know");
					//These print statements is what happened at the beginning of the anime/manga.
					//These show what happens through the story at the start.
					String choiceone="Yell at Mikasa and your mom.";
					String choicetwo="Run away and find a fight";
					//These declare two String variables for the choices the player has to choose from.
					boolean theyChoose=true;
					//This declares a boolean variable and sets it equal to true.
					//theyChoose to see if what they choose is good.
					
					while(theyChoose)
					//While this loop is true, it will run until updated to false.
					{
						System.out.println("A)" + choiceone);
						System.out.println("B)" + choicetwo);
						//These prints out their two choices.
						String gameInputer = gameReader.nextLine();
						if(gameInputer.equalsIgnoreCase("A"))
						//If the input the player uses is A, this runs.
						{
							System.out.println("\"IT'S NOT YOUR GUYS CHOICE TO MAKE!!!\"");
							System.out.println("Mikasa slaps you in the head so hard that you pass out.");
							System.out.println("Your health and durability went down as well.");
							//It shows more dialogue and it tells the user what has happened.
							System.out.print("Health:");
							name.setHealth(350);
							System.out.println(name.getHealth()+ "/400");
							System.out.print("Durability:");
							name.setDurability(250);
							System.out.println(name.getDurability()+ "/300");
							//This prints out what the new stats of your character are.
							System.out.println("Do you want to:");
							//This prompts the user to choose from their choices.
							String A="Apologize to them";
							String B="Run away for life";
							//These declare two String variables for the choices the player has to choose from.
							boolean choice=true;
							//This declares a boolean variable and sets it equal to true.
							//choice because it is checking their choice.
							
							while(choice)
							//While this loop is true, it will run until updated to false.
							{
								System.out.println("A)" + A);
								System.out.println("B)" + B);
								//These prints out their two choices.
								String gameInputers = gameReader.nextLine();
								//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
								if(gameInputers.equalsIgnoreCase("A"))
								//If the input the player uses is A, this runs.
								{
									System.out.println("\"Mikasa and Mom, I am really sorry for what I said.\"");
									System.out.println("They accept it and your father comes home..");
									//This prints out what you and your family does.
									System.out.println("He brings you down to the basement and reveal...");
									System.out.println("Grisha:");
									System.out.println("I am from the outside world that exists.");
									System.out.println("Titans are humans.");
									System.out.println("I need your help to defeat them and restore peace to the world!");
									//Your father reveals what he has been hiding.
									//He needs your help.
									System.out.println("The end! Come back next week for Part Two!!!");
									//The prints out the end message of this path,
									choice=false;
									//This sets the boolean to false which exists the loop.
									start=false;
									//This sets the boolean to false which exists the loop.
									
									//This closes the scanner to avoid any leaks.
								}
								
								else if(gameInputers.equalsIgnoreCase("B"))
								//If A is false, and B is true, this logic statement runs.
								{
									System.out.println("You sneak out the house and run far into the village.");
									System.out.println("You find a stairway to the underground city and you live there.");
									System.out.println("The people there take care of you and one day you meet Levi Ackerman..");
									System.out.println("Levi: Let me take you under my wing and train you.");
									System.out.println("\"I'd love to!\"");
									System.out.println("He trains you for five years and you learn to use ODM gear.");
									System.out.println("Levi introudces to the real world of Titans, blood, death, and war..");
									//These lines of code prints out more dialogue.
									//It prints out what happens with Eren.
									//It explains what he has done and found.
									System.out.println("These are your new stats:");
									//This prints out this message.
									name.setHeight(name.getHeight()+10);
									System.out.println("Your new height is " + name.getHeight()+ "cm");
									//This sets the new height of the Character.
									//This prints out what they have chosen their height to be in cm.
									name.setDurability(400);
									System.out.println("Your new durability is " +name.getDurability()+ "/400");
									//This sets the new durability of the Character.
									//This prints out what their durability is out of 300.
									name.setHealth(500);
									System.out.println("Your health is " + name.getHealth() + "/500");
									//This sets the new health of the Character.
									//This prints out what their health is out of 400.
									name.setStrength(name.getStrength()+50);
									System.out.println("Your strength is " + name.getStrength());
									//This sets the new strength of the Character.
									//This prints out what their strength is.
									name.setMaterial("Obsidian");						
									System.out.println("The material of the ODM blades are " + name.getMaterial() + ".");
									//This sets the new Material of the ODM blades.
									//This prints out the new material that their ODM blades are made of.
									System.out.println("You are ready to battle with Captian Erwin and Levi!");
									System.out.println("Come back next week to begin your REAL journey...");
									choice=false;
									//This sets the boolean to false which exists the loop.
									start=false;
									//This sets the boolean to false which exists the loop.
									gameReader.close();
									//This closes the scanner to avoid any leaks.
								}
								
								else
								//In any other case, this runs,
								{
									System.out.println("Invalid Response. A or B..");
									//THis prints out the message and re prompts them to pick A or B.
								}
							}
							theyChoose=false;
							//This sets the boolean to false which exists the loop.
						}
						
						else if(gameInputer.equalsIgnoreCase("B"))
						//If A isn't chosen then this is checked and if true, it runs.
						{

							System.out.println("You run out the door and run as fast as you can.");
							System.out.println("You run away so fast, you accidently bump into your bullies.");
							System.out.println("They knock you out and tie you down in their basement.");
							System.out.println("You are recorded and humuliated...");
							//This explains what the bullies did to you.
							//More context.
							System.out.println("What do you want to do?");
							//This prompts the user and asks them to choose what they want to do.
							String A="Spit in their faces and call them aholes.";
							String B="Kindly ask them to untie you and let you go.";
							//These declares two String variables that are the choices they can choose from.
							boolean choice=true;
							//This declares a boolean that is true.
							//choice because it is checking their choice.
							while(choice)
							//This starts a loop and runs until updated to false.
							{
								System.out.println("A)" + A);
								System.out.println("B)" + B);
								//This prints out the two choices the player has.
								String gameInputers = gameReader.nextLine();
								//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
								if(gameInputers.equalsIgnoreCase("A"))
								//If the input the player uses is A, this runs.
								{
									System.out.println("You spit into both of your bullies face.");
									System.out.println("You yell at them calling them aholes and other profanity.");
									//This is what you do to them.
									System.out.println("They both end up taking out a knife");
									//They make you panic.
									System.out.println("You begin to panic and squirm.");
									System.out.println("\"NO PLEASE! I'M SORRY GAHH NOO.\"");
									//You are about to die.
									System.out.println("They stab you at the same time and you let out a loud cry.");
									System.out.println("\"DAMMM AHHHHH NOOOO\"");
									System.out.println("");
									System.out.println("");
									System.out.println("Eren Yeager has officaily died...");
									//Eren Yeager has died...
									System.out.println("The end.");
									//The story has ended.
									choice=false;
									//This makes the boolean variable false and exists the loop.
									start=false;
									//This makes the boolean variable false and exists the loop.
									gameReader.close();
									//This closes the scanner to avoid any leaks.
								}
								
								else if(gameInputers.equalsIgnoreCase("B"))
								//If A is false, this checks, if B is true, this runs.
								{
									System.out.println("\"Please let me go. I have done nothing wrong. I'm sorry.\"");
									//This is what you say to them.
									System.out.println("One bully: Pfft fine, we'll let you go.");
									System.out.println("They untie you but not until they punched you in the stomach and face.");
									System.out.println("The bullies: Just to remind you not to mess with us.");
									//This is what the bullies do to you after.
									System.out.println("You end up passing out and waking up in the grass with Mikasa again.");
									System.out.println("It was just a dream...");
									//You realize it is just a dream.
									System.out.println("The end.");
									//The story has ended.
									start=false;
									//This makes the boolean variable false and exists the loop.
									choice=false;
									//This makes the boolean variable false and exists the loop.
									gameReader.close();
									//This closes the scanner to avoid any leaks.
								}
								
								else
								//In any other case, this runs.
								{
									System.out.println("Invalid Response. A or B..");
									//This prints out and re prompts the user to choose A or B.
								}
							}
							theyChoose=false;
							//This makes the boolean variable false and exists the loop.
						}
						
						else
						//In any other case, this runs.
						{
							System.out.println("Invalid Response. A or B..");
							//This prints out and re prompts the user to choose A or B.
						}
					
						isValid=false;
						//This makes the boolean variable false and exists the loop.
				}
				}
				
				else if(gameInputs.equalsIgnoreCase("B"))
				//If A is false, this checks and if B is true, this runs.
				{
					System.out.println("\"I didn't collect enough lumber, let me go back out for a little.\"");
					System.out.println("Mikasa: Fine be back in 10 minutes..");
					//The dialogue that occurs on this choice.
					System.out.println("You head back out.");
					System.out.println("You feel an ominous figure following you..");
					System.out.println("You get scared but out of no where, it jumps out.");
					//This is what happens when you get into the forest.
					//This is what happens in this choice.
					System.out.println("What will you do now?");
					//This prompts the user to say what they want to do with the choices given.
					isValid=false;
					//This makes the boolean variable false and exists the loop.
					
					while(isValids)
					//While this loop is true, it will run until updated to false.
					{
					System.out.println("A:Run and hide");
					System.out.println("B:Be a man and fight it");
					//These print out two different options that the player can choose from.
					System.out.println("The B option is still a work in progress");
					//This prints out letting them know B is not fully complete.
					String gameInputss = gameReader.nextLine();
					//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
					if(gameInputss.equalsIgnoreCase("A"))
					//If you choose A, this runs.
					{
						System.out.println("You run and hide from this being.");
						System.out.println("You are hiding underneath a bush trying hard not to scream.");
						//This is what you do after.
						System.out.println("It starts to come into your vision.");
						System.out.println("\"This being...\" You tell yourself");
						//This prints out what you do and what happens.
						//You start to see what is happening.
						String choices1="Quietly try to sneak away and meet up with Mikasa ";
						String choices2="Distract it by making noise and then meeting up with Mikasa.";
						//These declare two String varibales that are the choies they can choose from,
						isValids=false;
						//This makes the boolean variable false and exists the loop.
						
						while(isChoice)
						//While this loop is true, it will run until updated to false.
						{
							System.out.println("Do you:");
							System.out.println("A)" + choices1);
							System.out.println("B)" + choices2);
							//This prompts the user.
							//They choose which choice they want to do.
							System.out.println("B is still a work in progress");
							//B is still in progress so I added this.
							String gameInputer = gameReader.nextLine();
							//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
							if(gameInputer.equalsIgnoreCase("A"))
							//If A is chosen, this runs.
							{
								System.out.println("You slowly get up and try to sneak away from this creature.");
								System.out.println("It notices you and immediately starts to chase you.");
								//It explains what you do and what happens after you do it.
								String surive="You run for your live and hope you lose it.";
								String end="You find another hiding spot.";
								//These declare String variables for the user to pick from.
								System.out.println("What will you do?");
								//It prompts them to make a choice.
								
								while(isChoices)
								//While this loop is true, it will run until updated to false.
								{
									System.out.println("Do you:");
									System.out.println("A)" + surive);
									System.out.println("B)" + end);
									//It prompts them to make a choice and prints out the two options they have.
									String gameInputers = gameReader.nextLine();
									//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
									if(gameInputers.equalsIgnoreCase("A"))
									//If A is chosen, this runs.
									{
										System.out.println("You start to sprint and just run and run");
										System.out.println("You end up losing the being and you make your way back to Mikasa.");
										//This is what you do.
										System.out.println("\"MIKASA WE HAVE TO GO NOW, SOMETHING IS CHASING ME \"");
										System.out.println("Mikasa: Nonsense, there is nothing within these walls.");
										//This is what you say and how Mikasa responds.
										System.out.println("She drags you back to the house.");
										System.out.println("You hear a loud banging noise.");
										System.out.println("You look outside and see that this being has followed you home...");
										//This is what Mikasa does and what happens.
										System.out.println("It sees you and starts sprinting towards your house.");
										System.out.println("Before you can react, the being rams into your house");
										//The titan sees you and the end is near.
										System.out.println("Crushing you and your family...");
										System.out.println("You're all dead...The end...");
										//Everyone dies and that is the end of the story.
										isChoices=false;
										//This makes the boolean variable false and exists the loop.
										start=false;
										//This makes the boolean variable false and exists the loop.
										gameReader.close();
										//This closes the Scanner to avoid any leaks.
									}
									
									else if(gameInputers.equalsIgnoreCase("B"))
									//If A is false, this checks, if B is chosen, this prints.
									{
										System.out.println("You try to move away and towards behind the trees.");
										System.out.println("It senses your movement and you see its form.");
										//This is what you try to do and what happens.
										System.out.println("\"IT'S A TITAN!!\"");
										//You say this.
										System.out.println("It grabs you and you:");
										//The titan does this.
										//They are prompted to choose what to do.
										String a="Let it kill you.";
										String b="Try to get out of its fists";
										//These declare string variables for the two options the player can choose from.
										boolean aOrB=true;
										//This declares a boolean variable and sets it to true.
										//aOrB because those are the two options they can choose from.
										isChoices=false;
										//This makes the boolean variable false and exists the loop.
										
										while(aOrB)
										//While this loop is true, it will run until updated to false.
										{
											System.out.println("A)" + a);
											System.out.println("B)"+ b);
											//This prints out the two options the user can choose from.
											String theInput = gameReader.nextLine();
											//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
											if(theInput.equalsIgnoreCase("A"))
											//If A is chosen, this runs.
											{
												System.out.println("You accept the pain.");
												System.out.println("It crushes you but then something happens...");
												//What happens after.
												System.out.println("YOU ARE IN A BALL OF LIGHTNING");
												System.out.println("YOU ARE NOW A TITAN");
												System.out.println("WOWWWW");
												//What you become.
												//You become a titan being.
												System.out.println("\"LET'S KILL THIS BEING\"");
												//You shout this.
												
												int titanHealth=800;
												//This declares an int variable and sets its health to 100
												for(int i=0; i<4; i++)
												//This for loop starts at 0, goes until it is equal to 4, and adds 1 for an iteration.
												{
													System.out.println("You punch the titan!");	
													//This prints out.
													titanHealth-=200;
													//This takes the original health and sets it to subtracting 200 and sets that to the new health.
													System.out.print("The titans health is now at ");
													System.out.println(titanHealth + "/800");
													//These print out.
												}
											
												System.out.println("THE TITAN IS NOW DEAD!!");
												System.out.println("YOU ARE NOW A TITAN!");
												//This prints out showing what has happened.
												System.out.print("The end..You are ready to start a new journey.");
												//The story has ended.
												isChoices=false;
												//This makes the boolean variable false and exists the loop.
												aOrB=false;
												//This makes the boolean variable false and exists the loop.
												start=false;
												//This makes the boolean variable false and exists the loop.
												gameReader.close();
												//This closes the scanner to avoid any leaks.
											}
											
											else if(theInput.equalsIgnoreCase("B"))
											//If A is false, this is checked, if B is true, this runs.
											{
												System.out.println("You try to get out of the fists.");
												System.out.println("You accept the pain.");
												//This is what you try to do.
												System.out.println("It crushes you to a pulp and you die...");
												//This is what the titan does to you.
												System.out.println("The end...");
												//The story ends.
												isChoices=false;
												//This makes the boolean variable false and exists the loop.
												aOrB=false;
												//This makes the boolean variable false and exists the loop.
												start=false;
												//This makes the boolean variable false and exists the loop.
												gameReader.close();
												//This closes the scanner to avoid any leaks.
											}
											
											else
											//In any other case, this runs.
											{
												System.out.println("Invalid Response. A or B..");
												//This prints and re prompts the user to choose A or B.
											}
											
										}
									}
									
									else
									//In any other case, this runs.
									{
										System.out.println("Invalid Response. A or B..");
										//This prints and re prompts the user to choose A or B.
									}
								}
							}
						
             /*
              * This is a work in progress option.
              */
							else if(gameInputer.equalsIgnoreCase("B"))
							//If A is false, this checks, if B is true, this prints.
							{
								System.out.println("");
								//This skips a line to make it look neater.
								System.out.println("You find a stick and throw it.");
								System.out.println("It hears it and sprints towards the noise.");
								System.out.println("\"Phewwww\"");
								System.out.println("You run back to Mikasa.");
								//This explains you do, say, and the actions after the event.
								isChoices=false;
								//This makes the boolean variable false and exists the loop.
								start=false;
								//This makes the boolean variable false and exists the loop.
								gameReader.close();
								//This closes the scanner to avoid any leaks.
							}
							
							else
							//In any other case, this runs.
							{
								System.out.println("Invalid Response. A or B..");
								//This prints and re prompts the user to choose A or B.
							}
							
							isChoice=false;
							//This makes the boolean variable false and exists the loop.
						}
					}

        /*
          * This is a work in progress option.
          */
					else if(gameInputss.equalsIgnoreCase("B"))
					//If the user does not pick A, this checks to see if they pick B, if they did, this runs.
					{
						System.out.println("You wait for this being to show its form.");
						//This prints out to show context of what you do.
						System.out.println("...");
						System.out.println("...");
						System.out.println("...");
						System.out.println("...");
						System.out.println("...");
						//So many spaces to develop suspense.
						System.out.println("\"IT'S A TITAN!!!\"");
						System.out.println("Out of fear you run and end up tripping and stab yourself with a log.");
						System.out.println("What happened next is unbelievable and is shocking...");
						//Explains what you do and feel.
						//It explains and shows what happens.
				
						isValids=false;
						//This sets the boolean to false to exit the loop.
					}
					
					else
					//In any other case, this runs.
					{
						System.out.println("Invalid Response. A or B..");
						//This prints out.
					}
				
				}
					
					
					
				}
				
				else
				//In any other case, this runs.
				{
					System.out.println("Invalid Response. A or B..");
					//This prints out.
				}
				
				}
				start=false;
				//This sets the boolean to false to exit the loop.
			}
			
			
		
	}
	
		if(gameInput.equalsIgnoreCase("Yes")) 
		//If the user Inputs Yes, this will start to run.
		{
			if(name.getName().equals("Levi Ackerman"))
			//If the players name is equal to Levi Ackerman, this will continue to run.
			{
				System.out.println("20000 Years Ago the world experienced a life turning event...");
				System.out.println("Titans...The beings that haunt human life.");
				System.out.println("The society you live would about to change forever.");
				System.out.println("You are the warrior of the world..");
				//These above four lines is basically the introduction to the character.
				System.out.println("");
				//This skips a line to make it look neater.
				System.out.println("\"Oi Erwin, what are we doing here?\"");
				//You say this.
				System.out.println("Ewrin: We have recieved intel that Titans are forming close to Wall Maria.");
				System.out.println("Ewrin: We are here to defend if it happens.");
				//Erwin says these.
				String one="Take up the top of Wall Maria";
				String two="Take up the inner of Wall Maria";
				//Declares two string variables I will use as choices.
				boolean choice=true;
				//Declares a boolean variable that is set to true.
				//choice because it is checking their choice.
				System.out.println("What do you want to do?");
				//Prompts the user to decide what they want to do.
				
				while(choice)
				//While this loop is true, it will run until updated to false.
				{
					System.out.println("A)" + one);
					System.out.println("B)" + two);
					//Prints the two choices for the player to pick from.
					String theInput = gameReader.nextLine();
					//This instatiates a scanner using the data attribute of it. It will be scanning any strings.
					if(theInput.equalsIgnoreCase("A"))
					//If the Input is equal to A, this will run.
					{
						System.out.println("I'll take up the top of Wall Maria.");
						choice=false;
						//This sets the choice boolean to false and it will exit the loop.
					}
					
					else if(theInput.equalsIgnoreCase("B"))
						//If the Input is equal to B, this will run.
					{
						System.out.println("I'll take up the inner of Wall Maria.");
						choice=false;
						//This sets the choice boolean to false and it will exit the loop.
					}
					
					else
					//If any input is not A or B, this will run.
					{
						System.out.println("Invalid Response. A or B..");
						//This prints out and repromots the user to choose A or B again.
					}
				}
			}
			
		}
		
		if(gameInput.equalsIgnoreCase("Yes"))
	    //If the user Inputs Yes, this will start to run.
		{
			 if(name.getName().equals("Mikasa Ackerman"))
			 //If the players name is equal to Mikasa Ackerman, this will continue to run.
			{
				System.out.println("20000 Years Ago the world experienced a life turning event...");
				System.out.println("Titans...The beings that haunt human life.");
				System.out.println("The society you live would about to change forever.");
				System.out.println("You are the reason the world survies..");
				//These above four lines is basically the introduction to the character.
				System.out.println("");
				//This skips a line to make it look neater.
				System.out.println("You are being chased by three men.");
				System.out.println("They are about to corner you.");
				System.out.println("What do you do?");
			}
		}
		
		if(gameInput.equalsIgnoreCase("Yes"))
		//If the user Inputs Yes, this will start to run.
		{
			if(name.getName().equals("Reiner Braun"))
			//If the players name is equal to Reiner Braun, this will continue to run.
			{
				System.out.println("20000 Years Ago the world experienced a life turning event...");
				System.out.println("Titans...The beings that haunt human life.");
				System.out.println("The society you live would about to change forever.");
				System.out.println("You are the reason the world begins to burn and die..");
				//These above four lines is basically the introduction to the character.
				System.out.println("");
				//This skips a line to make it look neater.
			}
		}
		else
			//If the if statements do not run, this runs.
			//Basically if the user inputs "No", this runs.
			{
				System.out.println("Please answer with Yes or No.");
				//This will print out and basically ending the game and they have to run it again to play.
			}
		
		if(gameInput.equalsIgnoreCase("No"))
		//If the user inputs No to continuing, this runs.
		{
			System.out.println("I'm sorry! I hope you want to play another time!");
			//This prints out.
			start=false;
			//This sets the boolean to false to exit the loop.
		}		
	}
	}
}
