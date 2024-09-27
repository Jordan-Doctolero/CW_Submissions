/**
 * This is a circle class that has data attributes, a constructor, and its functionality's.
 * @Jordan_Doctolero
 */

/**
 * Any variable that I pass, I will be declaring its value in the main method.
 * I will call this class using the dot operator in the main method.
 */

public class Circle {
	
	
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * It is also what the class needs in order to function.
	 * In this case I need pi which I made final so I can't ever change it after that line.
	 * I also need the radius and height which I will pass later on.
	 */

	
	private final double pi=3.14;
	private double radius;
	
	//Constructor
	
	/**
	 * This creates the circle objects.
	 * I pass it a double r for its radius.
	 * I will declare what r is in the main method.
	 */
	
	public Circle(double r)
	{
		radius=r;
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the text "Circle" when I call it in the main method.
	 */
	
	public static String getShape()
	{
		return ("Circle");
		
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It then returns the radius that I pass it in the main method.
	 */
	
	public double getRadius()
	{
		return(radius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the diameter by multiplying 2 by its radius that I passed.
	 * It then returns it.
	 */
	
	public double getDiameter()
	{
		return(2*radius);
	}

	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the circumference by multiplying 2 by pi 
	 * and radius that I declared and passed.
	 * It then returns it.
	 */
	
	public double getCircumference()
	{
		return(2*pi*radius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the area by squaring the radius that I passed.
	 * It then returns it.
	 */
	
	public double getArea()
	{
		return(radius*radius);
	}
	
	/**
	 * In class lesson.
	 */
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
}
