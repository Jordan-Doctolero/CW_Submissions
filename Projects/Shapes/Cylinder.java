/**
 * This is a cylinder class that has data attributes, a constructor, and its functionality's.
 * @Jordan_Doctolero
 */

/**
 * Any variable that I pass, I will be declaring its value in the main method.
 * I will call this class using the dot operator in the main method.
 */

public class Cylinder {
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * It is also what the class needs in order to function.
	 * In this case I need pi which I made final so I can't ever change it after that line.
	 * I also need the radius and height which I will pass later on.
	 */

	private final double pi=3.14;
	private double radius;
	private double height;
		
	//Constructor
		
	/**
	 * This creates the cylinder objects.
	 * I pass it a double r for its radius.
	 * I pass it a dobule h for its height.
	 * I will declare what r and h is in the main method.
	 */

	public Cylinder(double r, double h)
	{
		radius=r;
		height=h;
					
	}
		
	//Functionality's
		
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the text "Cylinder" when I call it in the main method.
	 */

	public static String getShape()
	{
		return ("Cylinder");
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
	 * It then returns the height that I pass it in the main method.
	 */

	public double getHeight()
	{
		return(height);
	}

	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Surface Area by multiplying 2 by the radius squared.
	 * It then returns it.
	 */

	public double getCirc()
	{
		return(2*radius*radius);
	}
		
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Base Area by multiplying pi by the radius squared.
	 * It then returns it.
	 */

	public double getBaseArea()
	{
		return(pi*radius*radius);
	}
		
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Lateral Surface Area by multiplying 
	 * 2 by pi, the radius, and its height.
	 * It then returns it.
	 */

	public double getLateralSurface()
	{
		return(2*pi*radius*height);
	}
		
	/**
	 * I did not declare the methods for the equations of Volume and Surface Area because
	 * I can find those using what I already have.
	 * I did the actual equations for those in the main method.
	 */
		
}
