/**
 * This is a torus class that has data attributes, a constructor, and its functionality's.
 * @Jordan_Doctolero
 */

/**
 * Any variable that I pass, I will be declaring its value in the main method.
 * I will call this class using the dot operator in the main method.
 */

public class Torus {
	
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * It is also what the class needs in order to function.
	 * In this case I need a minor AND major radius.
	 * I will pass these later on.
	 */

	final double pi=3.14;
	private double mRadius;
	private double mradius;
	
	//Constructor
	
	/**
	 * This creates the torus objects.
	 * I pass it a double mRadius for its major radius.
	 * I pass it a dobule mradius for its minor radius.
	 * I will declare what mRadius and mradius is in the main method.
	 */

	public Torus(double R, double r)
	{
		mRadius=R;
		mradius=r;
				
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the text "Torus" when I call it in the main method.
	 */

	public static String getShape()
	{
		return ("Torus");
		
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It then returns the Major Radius that I pass it in the main method.
	 */
	
	public double getMajorRadius()
	{
		return(mRadius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It then returns the Minor Radius that I pass it in the main method.
	 */

	public double getMinorRadius()
	{
		return(mradius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the perimeter by multiplying 2 by pi and its Minor Radius that I passed.
	 * It then returns it.
	 */

	public double getPerimeter()
	{
		return(2*pi*mRadius);
	}

	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Surface Area by multiplying 4 by pi and its minor AND major radius.
	 * It then returns it.
	 */

	public double getSurfaceArea()
	{
		return(4*pi*pi*mradius*mRadius);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the Volume by doing PMMDAS.
	 * It does both () simultaneously.
	 * (Multiplies pi by the minor AND major radius)(Multiplies 2 by its pi and minor radius)
	 * It then multiplies them together.
	 * It then returns it.
	 */

	public double getVolume()
	{
		return(pi*mradius*mradius)*(2*pi*mRadius);
	}
}
