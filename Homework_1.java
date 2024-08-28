/*
 *This is Homework 1: Practicing System and Primitives.
 *I will be printing my name using "O" in ASCII art.
 *I will also be writing code to solve a math problem.
 *I will print out the circumference area of a circle.
 */

public class Homework_1 {

	public static void main(String[] args) {
		// Task 1: Print out your name using the letter "O" in ASCII art.
		/*
		*This is my draft for my name in the code above.  
		*OOOOO OOOOO   OOOO   OOOO
		*	O	O    O O    O O    O
		*	O	O    O O	O O
		*	O	O    O O	O O
		*O	O	O    O O    O O    O
		* O	OOOOO   OOOO   OOOO
		* 
		*/
			
			System.out.println("OOOOO OOOOO   OOOO   OOOO");
			System.out.println("  O   O    O O    O O    O");
			System.out.println("  O   O    O O    O O");
			System.out.println("  O   O    O O    O O");
			System.out.println("O O   O    O O    O O    O");
			System.out.println(" O    OOOOO   OOOO   OOOO");

			System.out.println("");
		
		//Task 2: Write code to compute the following math problem:
		/**
		* 6.0 x 3.5 - 1.5 x 5
		* -------------------
		*   55.6 - 30.2
		*   
		*   The answer on the assignment is "0.531496062992126"
		*   FWI...The answer I got is the full decimal, not the rounded.
		*/
			
			double prod1=6.0*3.5;
			double prod2=1.5*5;
			double sub=prod1-prod2;
			double quo=55.6-30.2;
			double answ=sub/quo;
			
			System.out.print(answ);
			
			System.out.println("");
			System.out.println("");
			
		//Task 3:Write adaptable code that will print out the circumference and area of a circle that has
		//a radius of 4.0. (Hint: the value of pi is 3.1519 and it never changes)
		
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

