/*
*This is a classwork assignment we did.
*It prints the side lengths of a cube as well as its surface area of the cube.
*/
public class Cube_Calculator {

	public static void main(String[] args) {
		// Task 1:Declare a side length as an int. 
		
		double side=2.0;
		//This is a side length of a cube.
		
		
		//Task 2:Calculate its surface area
		
		double area=6.0*side*side;
		//This declares that the surface area is 6a^2.
		
		/*
		 *The code above will print the starting of the sentence
		 *Then it will print the side length which is the int I declared above.
		 *Then it prints is.
		 *Then prints the area of the cube which I also declared above.
		 */
		System.out.print("The surface area of a cube with a side length of ");
		System.out.print((int)side);
		System.out.print(" is ");
		System.out.print((int)area);
		System.out.print(".");
		
		System.out.println();
		System.out.println();
		
		//Task 3:Calculate its volume.
		
		double volume=side*side*side;
		//This declares that the volume of a cube is a^3.
		
		/*
		 *This will print the first sentence of the code.
		 *Then print side1 whcih i declared as 3.0
		 *Then print the volume which I declared the equation above.
		 *I casted it as an int which means the volume which was a double, becomes an int.
		 */
		System.out.print("The volume of a cube with a side length of ");
		System.out.print((int)side);
		System.out.print(" is ");
		System.out.print((int)volume);
		System.out.print(".");
	
		
		//Task 4:Print the values of doubles in a sentence.
			//I changed the code above to be doubles.
			//I changed the value of the volume to be a int.
		
	}

}
