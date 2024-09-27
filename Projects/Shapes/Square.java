/**
 * This is a square class that has data attributes, a constructor, and its functionality's.
 * @Jordan_Doctolero
 */

/**
 * Any variable that I pass, I will be declaring its value in the main method.
 * I will call this class using the dot operator in the main method.
 */

public class Square {
	
	//Data Attributes
	
	/**
	 * This creates private data. Basically the numbers we will pass it.
	 * What the class needs in order to function.
	 * In this case I only needed one side since a square has 4 equal sides.
	 */

	private double side;
	
	//Constructor
	
	/**
	 * This creates the square objects.
	 * I pass it a double s for side.
	 * I will declare what s is in the main method.
	 */

	public Square(double s)
	{
		side=s;
	}
	
	//Functionality's
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns the text "Square" when I call it in the main method.
	 */

	public static String getShape()
	{
		return ("Square");
		
	}

	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It returns out the side I passed it.
	 */

	public double getSide()
	{
		return(side);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the perimeter by multiplying the side I passed it by 4.
	 * It then returns it.
	 */

	public double getPerimeter()
	{
		return(4*side);
	}
	
	/**
	 * This is what the class is going to do when I call it in the main method.
	 * It does the math of the area by multiplying the side that I passed it by itself.
	 * It then returns it.
	 */

	public double getArea()
	{
		return(side*side);
	}
	
	/**
	 *In class lesson.
	 */
	public String toString()
	{
		return("This is a square with a side of " + getSide() 
		+ ". The perimeter is " + getPerimeter() + " and the area is " + getArea() + ".");
	}

	public void setSide(double side) {
		this.side = side;
	}
}
