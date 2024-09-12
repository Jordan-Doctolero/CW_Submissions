/*
 * I created new methods outside the main method to do certain operations.
 * I called these new methods in the main method and when I needed to pass a variable, I gave it 
 * a value in the main method.
 * This is the first assignment of Unit 2.
 */
public class Methods_Intro_Practice {

	public static void main(String[] args) {
		//These strings of code calls the methods I created down below the main method.
		//For the last two it uses the ability to pass to calculate.
		stateName();
		stateEyeColor();
		stateHairStyle();
		stateBestFriend();
		stateFavoriteFood();
		printCircleStats(3.0);
		printMathStuffs(8,3);
		
	}
	
	/**
	 * Task 1:
	 * Create a void method called stateName() that prints out your name. 
	 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
	 * and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
	*/
	
	//This new method prints my full name and skips two lines.
	public static void stateName()
	{
		System.out.println("My full name is Jordan Ritua Francis Xavier Doctolero!");
		System.out.println("");
	}
	
	//This new method prints my eye color and skips two lines..
	public static void stateEyeColor()
	{
		System.out.println("My eye color is Black.");
		System.out.println("");
	}
	
	//This new method prints hair style and skips two lines.
	public static void stateHairStyle()
	{
		System.out.println("My hair style is a wavy side comb.");
		System.out.println("");
	}
	
	//This new method prints my best friends name and skips two lines.
	public static void stateBestFriend()
	{
		System.out.println("My best friend is N/A.");
		System.out.println("");
	}
	
	//This new method prints my favorite food and skips two lines..
	public static void stateFavoriteFood()
	{
		System.out.println("My favorite food is steak.");
		System.out.println("");
	}
	
	/**
	 * Task 2:
	 * Create a method printCircleStats() that is passed a double (meant to represent a 
	 * circle's radius) and calculates then prints out the radius, diameter, circumference, 
	 * and area of the circle. 
	 */
	
	/**
	  * This new methods passes the method as a double x and it prints the radius that I will 
	  * call in the main method then calculates
	  *	the diameter, circumference, and area of a circle that I declared each equation below.
	  *	I also declared pi as a final so it can't be changed.
	  */ 
	public static void printCircleStats(double x)
	{
		double dia=2*x;
		final double pi=3.14;
		double circ=2*pi*x;
		double area=pi*x*x;
		
	System.out.println("The radius of a circle is " + x + ".");
	System.out.println("");
	System.out.println("The diamater of a circle is " + dia + ".");
	System.out.println("");
	System.out.println("The circumference of a circle is " + circ + ".");
	System.out.println("");
	System.out.println("The area of a circle is " + area + ".");
	System.out.println("");
	
	}
	
	/**
	 * Task 3:
	 * Create a method printMathStuffs() that is passed two ints and prints their sum, 
	 * difference, product, quotient, and the remainder (using modulus) of the first 
	 * number modulus the second number.
	 */
	
	/**
	  * This new method method passes two ints and prints their sums I can declare in the main method.
	  * It then will print the sum, difference, product, quotient, and modulus of the first and second.
	  * It skips two lines after every operation.
	  */ 
	public static void printMathStuffs(int x, int y)
	{
	int sum=x+y;
	int diff=x-y;
	int prod=x*y;
	int quo=x/y;
	int mod=sum%diff;
		
	System.out.println("The sum of " + x + "+" + y + "=" + sum + ".");
	System.out.println("");
	System.out.println("The difference of " + x + "-" + y + "=" + diff + ".");
	System.out.println("");
	System.out.println("The product of " + x + "*" + y + "=" + prod + ".");
	System.out.println("");
	System.out.println("The quotient of " + x + "/" + y + "=" + quo + ".");
	System.out.println("");
	System.out.print("The modulus of " + x + "%" + y + "=" + mod + ".");

	}
}
