package a;

public class Homework {

	public static void main(String[] args) {
		
		//Task 1: Print out your name using the letter "O" in ASCII art.
		/**
		 * Example output of my nickname
		 * OOO OOOO   OOO  OOOOO
		 * 	O  O   O O   O O   
		 *O O  O   O O   O O   
		 * O   OOOO   OOO  OOOOO              
		 */
		
		System.out.println("OOOOO OOOOO   OOOO  OOOOO");
		System.out.println("  O   O    O O    O O    ");
		System.out.println("O O   O    O O    O O    ");
		System.out.println(" O    OOOOO   OOOO  OOOOO");
		System.out.println();
		
		//Task 2: Write code to compute the following math problem:
		/**
		* 6.0 x 3.5 - 1.5 x 5
		* -------------------
		*   55.6 - 30.2
		*   
		*   The answer on the assignment is "0.531496062992126"
		*   FWI...The answer I got is the full decimal, not the rounded.
		*/
		
		double one=6.0*3.5;
		double two=1.5*5;
		double top=one-two;
		double quo=55.6-30.2;
		double anw=top/quo;
		
		System.out.println(anw);
		System.out.println();
		
		//Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. 
		//(Hint: the value of pi is 3.1519 and it never changes)
		
		//Circumference of a circle is 2pi*r
		//Area of a circle is pi*r^2
		
		double pi=3.1519;
		double rad=4.0;
		double rad2=16.0;
			
		System.out.print("The circumference of the circle is ");
		System.out.print(2*pi*rad);
		System.out.print(" and the area of the circle is ");
		System.out.print(pi*rad2);
		System.out.print(".");
		
	}

}
