/**
 * This assignment made 6 different Shapes.
 * With these 6 shapes, it made 3 different versions of each shape.
 * This assignment declares all the aspects of each shape.
 * You are able to adapt and change their numbers.
 * @Jordan_Doctolero
 */

/**
 * This is where I am storing all my 6 shapes.
 * It instatiates the different versions of each shapes and calls each shape class.
 * It calls them by using the dot operator.
 * It does the math in the different classes and returns them in the main method.
 * It prints what is being said.
 * Which is all the different values for each aspect of each shape.
 */
public class Main {

	public static void main(String[] args) {
		
		
		//Circle
		Circle circOne=new Circle(3.0);
		Circle circTwo=new Circle(20.0);
		Circle circThree=new Circle(-4.0);
		//This instatiates 3 different circles. Each which their own radius that is passed.
		
		System.out.println("The Shape is a " + Circle.getShape() + ".");
		//This prints out the "" and then uses the Circle static method to return the statement I had.
		//It then skips a line for the next sentence.
		
		System.out.print("The radius of circle one is " + circOne.getRadius());
		System.out.println(" and the diameter is " +circOne.getDiameter() + ".");
		//This prints out the "" and then uses the Circle one I made.
		//It also uses the dot operator to call the radius and diameter of circle one's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The radius of circle two is " + circTwo.getRadius() + ".");
		System.out.println(" and the diameter is " +circTwo.getDiameter() + ".");
		//This prints out the "" and then uses the Circle two I made.
		//It also uses the dot operator to call the radius and diameter of circle two's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The radius of circle three is " + circThree.getRadius() + ".");
		System.out.println(" and the diameter is " +circThree.getDiameter() + ".");
		//This prints out the "" and then uses the Circle three I made.
		//It also uses the dot operator to call the radius and diameter of circle three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.

		System.out.println("The circumference of circle one is " + circOne.getCircumference() + ".");
		//This prints out the "" and then uses the Circle one I made.
		//It also uses the dot operator to call the circumference of circle one' values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The circumference of circle two is " + circTwo.getCircumference() + ".");
		//This prints out the "" and then uses the Circle two I made.
		//It also uses the dot operator to call the circumference of circle two's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The circumference of circle three is " + circThree.getCircumference() +  ".");
		//This prints out the "" and then uses the Circle three I made.
		//It also uses the dot operator to call the circumference of circle three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The area of circle one is " + circOne.getArea() + ".");
		//This prints out the "" and then uses the Circle one I made.
		//It also uses the dot operator to call the area of circle one's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The area of circle two is " + circTwo.getArea() + ".");
		//This prints out the "" and then uses the Circle two I made.
		//It also uses the dot operator to call the area of circle two's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The area of circle three is " + circThree.getArea() + ".");
		//This prints out the "" and then uses the Circle three I made.
		//It also uses the dot operator to call the area of circle three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println();
		System.out.println();
		//This skips two lines to go to the next shape so it is not cluttered.
	
		
		
		
		
		
		//Square
		Square squOne=new Square(3.0);
		Square squTwo=new Square(4.0);
		Square squThree=new Square(5.0);
		//This instatiates 3 different squares. Each which their own side that is passed.
		
		System.out.println("The Shape is a " + Square.getShape () + ".");
		//This prints out the "" and then uses the Square static method to return the statement I had.
		//It then skips a line for the next sentence.
		
		System.out.println("The length of square one is " + squOne.getSide() + ".");
		//This prints out the "" and then uses the Square one I made.
		//It also uses the dot operator to call the side of square one's side value.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The length of square two is " + squTwo.getSide() + ".");
		//This prints out the "" and then uses the Square two I made.
		//It also uses the dot operator to call the side of square two's side value.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The length of square three is " + squThree.getSide() + ".");
		//This prints out the "" and then uses the Square three I made.
		//It also uses the dot operator to call the side of square three's side value.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The perimeter of square one is a " + squOne.getPerimeter() + ".");
		//This prints out the "" and then uses the Square one I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of square one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The perimeter of square two is a " + squTwo.getPerimeter() + ".");
		//This prints out the "" and then uses the Square two I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of square two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The perimeter of square three is a " + squThree.getPerimeter() + ".");
		//This prints out the "" and then uses the Square three I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of square three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The area of square one is a " + squOne.getArea() + ".");
		//This prints out the "" and then uses the Square one I made.
		//It also uses the dot operator to call the getArea method to find the Area
		//and uses the values of square one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The area of square two is a " + squTwo.getArea() + ".");
		//This prints out the "" and then uses the Square two I made.
		//It also uses the dot operator to call the getArea method to find the Area
		//and uses the values of square two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The area of square three is a " + squThree.getArea() + ".");
		//This prints out the "" and then uses the Square three I made.
		//It also uses the dot operator to call the getArea method to find the Area
		//and uses the values of square three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println(squOne.toString());
		System.out.println(squTwo.toString());
		System.out.println(squThree.toString());
		//This is a shortcut to do all the code above in one line of code that is called.
		
		System.out.println();
		System.out.println();
		//This skips two lines to go to the next shape so it is not cluttered.
		
		
		
		
		
		
		//Rectangle
		Rectangle rectOne=new Rectangle(3.0, 5.0);
		Rectangle rectTwo=new Rectangle(4.0, 6.0);
		Rectangle rectThree=new Rectangle(5.0, 7.0);
		//This instatiates 3 different circles. Each which their own length and width that is passed.
		
		System.out.println("The Shape is a " + Rectangle.getShape () + ".");
		//This prints out the "" and then uses the Rectangle static method to return the statement I had.
		
		System.out.print("The length of rectanlge one is " + rectOne.getL() + " and ");
		System.out.println("the width is " + rectOne.getW() + ".");
		//This prints out the "" and then uses the Rectangle one I made.
		//It also uses the dot operator to call the length and width of rectangle one's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The length of rectanlge two is " + rectTwo.getL() + " and ");
		System.out.println("the width is " + rectTwo.getW() + ".");
		//This prints out the "" and then uses the Rectangle two I made.
		//It also uses the dot operator to call the length and width of rectangle two's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The length of rectanlge three is " + rectThree.getL() + " and ");
		System.out.println("the width is " + rectThree.getW() + ".");
		//This prints out the "" and then uses the Rectangle three I made.
		//It also uses the dot operator to call the length and width of rectangle three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The perimeter of rectangle one is a " + rectOne.getPerimeter() + ".");
		//This prints out the "" and then uses the Rectangle one I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of rectangle one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The perimeter of rectangle two is a " + rectTwo.getPerimeter() + ".");
		//This prints out the "" and then uses the Rectangle two I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of rectangle two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The perimeter of rectangle three is a " + rectThree.getPerimeter() + ".");
		//This prints out the "" and then uses the Rectangle three I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of rectangle three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The area of rectangle one is a " + rectOne.getArea() + ".");
		//This prints out the "" and then uses the Rectangle one I made.
		//It also uses the dot operator to call the getArea method to find the Area
		//and uses the values of rectangle one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The area of rectangle two is a " + rectTwo.getArea() + ".");
		//This prints out the "" and then uses the Rectangle two I made.
		//It also uses the dot operator to call the getArea method to find the Area
		//and uses the values of rectangle two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The area of rectangle three is a " + rectThree.getArea() + ".");
		//This prints out the "" and then uses the Rectangle three I made.
		//It also uses the dot operator to call the getArea method to find the Area
		//and uses the values of rectangle three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println();
		System.out.println();
		//This skips two lines to go to the next shape so it is not cluttered.
		
		
		
		
		
		//Torus
		Torus torOne=new Torus(5.0, 3.0);
		Torus torTwo=new Torus(6.0, 4.0);
		Torus torThree=new Torus(7.0, 5.0);
		//This instatiates 3 different torus'. Each which their own major AND minor radius that is passed.
		
		System.out.println("The Shape is a " + Torus.getShape () + ".");
		//This prints out the "" and then uses the Torus static method to return the statement I had.
		
		System.out.print("The Major Radius of torus one is " + torOne.getMajorRadius() + " and ");
		System.out.println("the Minor Radius is " + torOne.getMinorRadius() + ".");
		//This prints out the "" and then uses the Torus one I made.
		//It also uses the dot operator to call the major AND minor radius of torus one's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The Major Radius of torus two is " + torTwo.getMajorRadius() + " and ");
		System.out.println("the Minor Radius is " + torTwo.getMinorRadius() + ".");
		//This prints out the "" and then uses the Torus two I made.
		//It also uses the dot operator to call the major AND minor radius of torus three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The Major Radius of torus three is " + torThree.getMinorRadius() + " and ");
		System.out.println("the Minor Radius is " + torThree.getMinorRadius() + ".");
		//This prints out the "" and then uses the Torus three I made.
		//It also uses the dot operator to call the major AND minor radius of torus three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The perimeter of torus one is a " + torOne.getPerimeter() + ".");
		//This prints out the "" and then uses the Torus one I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of torus one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The perimeter of torus two is a " + torTwo.getPerimeter() + ".");
		//This prints out the "" and then uses the Torus two I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of torus two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The perimeter of torus three is a " + torThree.getPerimeter() + ".");
		//This prints out the "" and then uses the Torus three I made.
		//It also uses the dot operator to call the getPerimeter method to find the Perimeter
		//and uses the values of torus three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The surface area of torus one is a " + torOne.getSurfaceArea() + ".");
		//This prints out the "" and then uses the Torus one I made.
		//It also uses the dot operator to call the getSurfaceArea method to find the Surface Area
		//and uses the values of torus one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The surface area of torus two is a " + torTwo.getSurfaceArea() + ".");
		//This prints out the "" and then uses the Torus two I made.
		//It also uses the dot operator to call the getSurfaceArea method to find the Surface Area
		//and uses the values of torus two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The surface area of torus three is a " + torThree.getSurfaceArea() + ".");
		//This prints out the "" and then uses the Torus three I made.
		//It also uses the dot operator to call the getSurfaceArea method to find the Surface Area
		//and uses the values of three one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The volume of torus one is a " + torOne.getVolume() + ".");
		//This prints out the "" and then uses the Torus one I made.
		//It also uses the dot operator to call the getVolume method to find the volume
		//and uses the values of torus one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The volume of torus two is a " + torTwo.getVolume() + ".");
		//This prints out the "" and then uses the Torus two I made.
		//It also uses the dot operator to call the getVolume method to find the volume
		//and uses the values of torus two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The volume of torus three is a " + torThree.getVolume() + ".");
		//This prints out the "" and then uses the Torus three I made.
		//It also uses the dot operator to call the getVolume method to find the volume
		//and uses the values of torus three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println();
		System.out.println();
		//This skips two lines to go to the next shape so it is not cluttered.
		
		
		
		
		
		//Sphere
		Sphere sphOne=new Sphere(4.0);
		Sphere sphTwo=new Sphere(5.0);
		Sphere sphThree=new Sphere(6.0);
		//This instatiates 3 different spheres. Each which their own radius that is passed.
		
		System.out.println("The Shape is a " + Sphere.getShape () + ".");
		//This prints out the "" and then uses the Sphere static method to return the statement I had.
		
		System.out.print("The radius of sphere one is " + sphOne.getRadius());
		System.out.println(" and the diameter is " +sphOne.getDiameter() + ".");
		//This prints out the "" and then uses the Sphere one I made.
		//It also uses the dot operator to call the radius and diameter of sphere one's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The radius of sphere two is " + sphTwo.getRadius() + ".");
		System.out.println(" and the diameter is " +sphTwo.getDiameter() + ".");
		//This prints out the "" and then uses the Sphere two I made.
		//It also uses the dot operator to call the radius and diameter of sphere two's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The radius of sphere three is " + sphThree.getRadius() + ".");
		System.out.println(" and the diameter is " +sphThree.getDiameter() + ".");
		//This prints out the "" and then uses the Sphere three I made.
		//It also uses the dot operator to call the radius and diameter of sphere three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The circumference of sphere one is " + sphOne.getCirc() + ".");
		//This prints out the "" and then uses the Sphere one I made.
		//It also uses the dot operator to call the getCirc method to find the Circumference
		//and uses the values of sphere one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The circumference of sphere two is " + sphTwo.getCirc() + ".");
		//This prints out the "" and then uses the Sphere two I made.
		//It also uses the dot operator to call the getCirc method to find the Circumference
		//and uses the values of sphere two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The circumference of sphere three is " + sphThree.getCirc() + ".");
		//This prints out the "" and then uses the Sphere three I made.
		//It also uses the dot operator to call the getCirc method to find the Circumference
		//and uses the values of sphere three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The surface area of sphere one is " + sphOne.getSurfaceArea() + ".");
		//This prints out the "" and then uses the Sphere one I made.
		//It also uses the dot operator to call the getSurfaceArea method to find the Surface Area
		//and uses the values of sphere one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The surface area of sphere two is " + sphTwo.getSurfaceArea() + ".");
		//This prints out the "" and then uses the Sphere two I made.
		//It also uses the dot operator to call the getSurfaceArea method to find the Surface Area
		//and uses the values of sphere two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The surface area of sphere three is " + sphThree.getSurfaceArea() + ".");
		//This prints out the "" and then uses the Sphere three I made.
		//It also uses the dot operator to call the getSurfaceArea method to find the Surface Area
		//and uses the values of sphere three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The volume of sphere one is " + sphOne.getVolume() + ".");
		//This prints out the "" and then uses the Sphere one I made.
		//It also uses the dot operator to call the getVolume method to find the Volume
		//and uses the values of sphere one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The volume of sphere two is " + sphTwo.getVolume() + ".");
		//This prints out the "" and then uses the Sphere two I made.
		//It also uses the dot operator to call the getVolume method to find the Volume
		//and uses the values of sphere two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The volume of sphere three is " + sphThree.getVolume() + ".");
		//This prints out the "" and then uses the Sphere three I made.
		//It also uses the dot operator to call the getVolume method to find the Volume
		//and uses the values of sphere three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.

		
		System.out.println();
		System.out.println();
		//This skips two lines to go to the next shape so it is not cluttered.
		
		
		
		
		
		//Cylinder(Right)
		Cylinder cyOne=new Cylinder(4.0, 5.0);
		Cylinder cyTwo=new Cylinder(5.0, 6.0);
		Cylinder cyThree=new Cylinder(6.0, 7.0);
		//This makes 3 different circles. Each which their own radius and height that is passed.
		
		System.out.println("The Shape is a " + Cylinder.getShape () + ".");
		//This prints out the "" and then uses the Cylinder static method to return the statement I had.
		
		System.out.print("The radius, diameter, height, and circumfernece respectively of ");
		System.out.print("cylinder one are " + cyOne.getRadius() + ", " + cyOne.getDiameter() + ", "); 
		System.out.println(cyOne.getHeight() + ", " + cyOne.getCirc() + ".");
		//This prints out the "" and then uses the Cylinder one I made.
		//It also uses the dot operator to call the radius ,diameter,
		//height, and circumference of cylinder one's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The radius, diameter, height, and circumfernece respectively of ");
		System.out.print("cylinder two are " + cyTwo.getRadius() + ", " + cyTwo.getDiameter() + ", "); 
		System.out.println(cyTwo.getHeight() + ", " + cyTwo.getCirc() + "." );
		//This prints out the "" and then uses the Cylinder two I made.
		//It also uses the dot operator to call the radius ,diameter,
		//height, and circumference of cylinder two's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The radius, diameter, height, and circumfernece respectively of ");
		System.out.print("cylinder three are " + cyThree.getRadius() + ", " + cyTwo.getDiameter()); 
		System.out.println(", " + cyThree.getHeight() + ", " + cyThree.getCirc() + "." );
		//This prints out the "" and then uses the Cylinder three I made.
		//It also uses the dot operator to call the radius ,diameter,
		//height, and circumference of cylinder three's values.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The base area of cylinder one is " + cyOne.getBaseArea() + "." );
		//This prints out the "" and then uses the Cylinder one I made.
		//It also uses the dot operator to call the getBaseArea method to find the Base Area
		//and uses the values of cylinder one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The base area of cylinder two is " + cyTwo.getBaseArea() + "." );
		//This prints out the "" and then uses the Cylinder two I made.
		//It also uses the dot operator to call the getBaseArea method to find the Base Area
		//and uses the values of cylinder two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The base area of cylinder two is " + cyThree.getBaseArea());
		//This prints out the "" and then uses the Cylinder three I made.
		//It also uses the dot operator to call the getBaseArea method to find the Base Area
		//and uses the values of cylinder three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		System.out.println("The lateral surface of cylinder one is " + cyOne.getLateralSurface() + "." );
		//This prints out the "" and then uses the Cylinder one I made.
		//It also uses the dot operator to call the getLateralSurface method to find the Lateral Surface
		//and uses the values of cylinder one.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The lateral surface of cylinder two is " + cyTwo.getLateralSurface());
		//This prints out the "" and then uses the Cylinder two I made.
		//It also uses the dot operator to call the getLateralSurface method to find the Lateral Surface
		//and uses the values of cylinder two.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The lateral surface of cylinder three is " + cyThree.getLateralSurface() + "." );
		//This prints out the "" and then uses the Cylinder three I made.
		//It also uses the dot operator to call the getLateralSurface method to find the Lateral Surface
		//and uses the values of cylinder three.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		/**
		 * As stated in the cylinder class, I did not declare a method for the volume equation.
		 * I can find this just by using what I already have declared.
		 * I just did the height * the Base Area.
		 * Which is the same as the actual volume equation.
		 */
		System.out.println("The volume of cylinder one is " + cyOne.getHeight() * cyOne.getBaseArea() + "." );
		//This prints out the "" and then uses the Cylinder one I made.
		//It also uses the dot operator to call the getHeight and getBaseArea methods to multiply
		//together and uses the values of cylinder one to find the volume.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.println("The volume of cylinder two is " + cyTwo.getHeight() * cyTwo.getBaseArea() + "." );
		//This prints out the "" and then uses the Cylinder two I made.
		//It also uses the dot operator to call the getHeight and getBaseArea methods to multiply
		//together and uses the values of cylinder two to find the volume.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The volume of cylinder three is " + cyThree.getHeight() * cyThree.getBaseArea() + ".");
		//This prints out the "" and then uses the Cylinder three I made.
		//It also uses the dot operator to call the getHeight and getBaseArea methods to multiply
		//together and uses the values of cylinder three to find the volume.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
		/**
		 * As stated in the cylinder class, I did not declare a method for the surface area equation.
		 * I can find this just by using what I already have declared.
		 * I just did the Lateral Surface + 2*the Base Area.
		 * Which is the same as the actual surface area equation.
		 */
		System.out.print("The surface area of cylinder one is ");
		System.out.println(cyOne.getLateralSurface() + 2*cyOne.getBaseArea() + ".");
		//This prints out the "" and then uses the Cylinder one I made.
		//It also uses the dot operator to call the getLateralSurface and getBaseArea methods.
		//Using cylinder one's values it does both sides as well as multiplies the Base Area by 2.
		//It then adds them together.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The surface area of cylinder two is ");
		System.out.println(cyTwo.getLateralSurface() + 2*cyTwo.getBaseArea() + ".");
		//This prints out the "" and then uses the Cylinder two I made.
		//It also uses the dot operator to call the getLateralSurface and getBaseArea methods.
		//Using cylinder two's values it does both sides as well as multiplies the Base Area by 2.
		//It then adds them together.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		System.out.print("The surface area of cylinder two is ");
		System.out.print(cyThree.getLateralSurface() + 2*cyThree.getBaseArea() + ".");
		//This prints out the "" and then uses the Cylinder three I made.
		//It also uses the dot operator to call the getLateralSurface and getBaseArea methods.
		//Using cylinder three's values it does both sides as well as multiplies the Base Area by 2.
		//It then adds them together.
		//This is where the return statement goes to.
		//It then skips a line for the next sentence.
		
	}

}
