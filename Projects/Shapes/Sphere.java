/**
 * This is a sphere class that has data attributes, a constructor, and its functionality's.
 * @Jordan_Doctolero
 */

/**
 * Any variable that I pass, I will be declaring its value in the main method.
 * I will call this class using the dot operator in the main method.
 */

public class Sphere {
	
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * It is also what the class needs in order to function.
	 * In this case I need pi which I made final so I can't ever change it after that line.
	 * I also need a radius which I will pass later on.
	 */

	private final double pi=3.14;
	private double radius;
	
	//Constructor
	
	/**
	 * This creates the sphere objects.
	 * I pass it a double r for its radius.
	 * I will declare what r is in the main method.
	 */

	public Sphere(double r)
	{
		radius=r;
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the text "Sphere" when I call it in the main method.
	 */

	public static String getShape()
	{
		return ("Sphere");
		
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
	 * It does the math of the circumference by multiplying 2 by pi that I declared 
	 * and its radius that I passed.
	 * It then returns it.
	 */


	public double getCirc()
	{
		return(2*pi*radius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Surface Area by multiplying 4 by pi and squaring the radius.
	 * It then returns it.
	 */
	
	public double getSurfaceArea()
	{
		return(4*pi*radius*radius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Volume by multiplying 1/3 or 1.33
	 * by pi and cubes the radius.
	 * It then returns it.
	 */

	public double getVolume()
	{
		return(1.33*pi*radius*radius*radius);
	}
}
