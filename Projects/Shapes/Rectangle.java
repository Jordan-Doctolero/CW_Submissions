/**
 * This is a rectangle class that has data attributes, a constructor, and its functionality's.
 * @Jordan_Doctolero
 */

/**
 * Any variable that I pass, I will be declaring its value in the main method.
 * I will call this class using the dot operator in the main method.
 */

public class Rectangle {
	
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * What the class needs in order to function.
	 * In this case I need a length and width.
	 */

	private double length;
	private double width;
	
	//Constructor
	
	/**
	 * This creates the rectangle objects.
	 * I pass it a double l for length and double w for width.
	 * I will declare what l and w is in the main method.
	 */
	
	public Rectangle(double l, double w)
	{
		length=l;
		width=w;
	}
	
	public Rectangle(double s)
	{
		length=s;
		width=s;
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the text "Rectangle" when I call it in the main method.
	 */

	public static String getShape()
	{
		return ("Rectangle");
		
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns out the length I passed it.
	 */

	public double getL()
	{
		return(length);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the width I passed it.
	 */

	public double getW()
	{
		return(width);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the perimeter by adding the length and width I passed.
	 * It then multiplies that by 2.
	 * It then returns it.
	 */

	public double getPerimeter()
	{
		return(2*(length+width));
	}

	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the area by multiplying the length and width together.
	 * It then returns it.
	 */

	public double getArea()
	{
		return(length*width);
	}
}
