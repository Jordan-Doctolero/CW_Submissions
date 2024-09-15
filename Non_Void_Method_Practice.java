/*
 * I created new non void methods that are NON VOID outside the main method to do certain operations.
 * I called these new non void methods in the main method and when I needed to pass a variable, 
 * I gave it a value in the main method.
 * This is the first assignment of Unit 2.
 */
public class Non_Void_Method_Practice {

	public static void main(String[] args) {
		//These strings of code calls the methods I created down below the main method.
		//For the last two it uses the ability to pass to calculate.
		
		//Task 1:
		System.out.println(stateName());
		System.out.println();
		
		System.out.println(stateEyeColor());
		System.out.println();
		
		System.out.println(stateHairStyle());
		System.out.println();
		
		System.out.println(stateBestFriend());;
		System.out.println();
		
		System.out.println(stateFavoriteFood());
		System.out.println();
		
		//Task 2:
		final double pi=3.14;
		
		double radius=2.0;
		System.out.println("The radius of a circle is " + (radius) + ".");
		System.out.println();
		
		double diameter=calcDiameter(radius);
		System.out.println("The diameter of a circle is " +diameter + ".");
		System.out.println();
		
		double circumference=calcCircumference(radius);
		System.out.println("The circumference of a circle is " +circumference*pi + ".");
		System.out.println();
		
		double area=calcArea(radius);
		System.out.println("The area of a circle is " +area*pi + ".");
		System.out.println();
		
		//Task 3:
		System.out.println(addNums(4,2) + ".");
		System.out.println();
		
		System.out.println(subNums(10,2) + ".");
		System.out.println();
		
		System.out.println(multNums(5,2) + ".");
		System.out.println();
		
		System.out.println(quoNums(24,2) + ".");
		System.out.println();
		
		System.out.println(modNums(3,2) + ".");
		System.out.println();
		
	}
	
	/**
	 * Task 1:
	 * Create a non void methods called stateName() that prints out your name. 
	 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
	 * and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
	*/
	
	//This new method prints my full name and skips two lines.
	public static String stateName()
	{
		return("My full name is Jordan Ritua Francis Xavier Doctolero!");
	}
	
	//This new method prints my eye color and skips two lines..
	public static String stateEyeColor()
	{
		return("My eye color is Black.");
		
	}
	
	//This new method prints hair style and skips two lines.
	public static String stateHairStyle()
	{
		return("My hair style is a wavy side comb.");
		
	}
	
	//This new method prints my best friends name and skips two lines.
	public static String stateBestFriend()
	{
		return("My best friend is N/A.");
	}
	
	//This new method prints my favorite food and skips two lines..
	public static String stateFavoriteFood()
	{
		return("My favorite food is steak.");
	}
	
	/**
	 * Task 2:
	 * Create non void methods printCircleStats() that is passed a double (meant to represent a 
	 * circle's radius) and calculates then prints out the radius, diameter, circumference, 
	 * and area of the circle. 
	 */
	
	/**
	  * This new non void methods passes the method as a double x and it prints the radius that I will 
	  * call in the main method then calculates
	  *	the diameter, circumference, and area of a circle that I declared each equation below.
	  */ 
	
	public static double calcDiameter(double radius)
	{
		return(2*radius);
	}
	
	public static double calcCircumference(double radius)
	{
		return(2*radius);
	}
	
	public static double calcArea(double radius)
	{
		return(radius*radius);
	}

	/**
	 * Task 3:
	 * Create a non void method printMathStuffs() that is passed two ints and prints their sum, 
	 * difference, product, quotient, and the remainder (using modulus) of the first 
	 * number modulus the second number.
	 */
	
	/**
	  * This new non void method method passes two ints and prints their sums I can 
	  * declare in the main method.
	  */ 
	
	public static int addNums(int x, int y)
	{
		System.out.print("The sum of " + x + "+" + y + "=");
		return(x+y);
	}
	
	public static int subNums(int x, int y)
	{
		System.out.print("The differnece of " + x + "-" + y + "=");
		return(x-y);
	}
	
	public static int multNums(int x, int y)
	{
		System.out.print("The product of " + x + "*" + y + "=");
		return(x*y);
	}
	
	public static int quoNums(int x, int y)
	{
		System.out.print("The quotient of " + x + "/" + y + "=");
		return(x/y);
	}
	
	public static int modNums(int x, int y)
	{
		System.out.print("The modulus of " + x + "%" + y + "=");
		return(x%y);
	}
	
}
