import java.util.Scanner;
//This imports a scanner into the class.

/**
 * This is question number 2 on the Strings Practice Assignment.
 * We use our old circle class for this.
 * We use one cirlce and the user changes its radius.
 * It prompts the user asking to input a double which then adds on to the orignal radius.
 * After the loop, it prints the original and final radius to compare.
 * @Jordan_Doctolero
 */
public class Task_2 {
    
	/*
	 * This is the main method where all the action takes place.
	 * We instatiated scanners and declared variables.
	 * We use logic statements to loop the code.
	 * It adds on the different radi the user inputs to the original radius.
	 * It prints out what is inputed at each iteration.
	 * Then when the loop ends, it prints out the original and final radius.
	 */
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	//This instatiates a new scanner object into the class.
    	
    	Circle circOne=new Circle(3.0);
    	//This instatiates a circle object that has its own radius that is passed.
    	double ogRadius=circOne.getRadius();
    	//This declares a double variable and it is equal to the radius of circle one.
    	
    	System.out.println("The original radius of the circle is " + ogRadius + ".");
    	//This prints out the above text as well as the original radius of the circle and skips a line.
    	System.out.println();
    	//This skips an extra line to make it cleaner.
    	
    	for (int i =1; i <= 5; i++) 
    	//The counter starts at 1 and as long as the condition is true, it will run.
      //After it runs, it will iterate and add 1 and loop again until the counter is 6<5 which is false.
    	//It then exits the loop.
    	{
             System.out.print("Enter a double to add to the circle's radius: ");
             //This prints out the above text and prompts the user.
             double userInput = scanner.nextDouble(); 
             //This instatiates a new Scanner object called userInput.
     		     //Whatever the user types in the console, it will output.
             //It has to be a double for it to scan and work.
             circOne.setRadius(circOne.getRadius() + userInput);
             //This sets a new radius to the circle object.
             //It takes the original radius and adds the new double radius the user Inputed.
             //It stores it and it continues to loop adding on to the radius.
    	}
    	
    	   System.out.println();
    	   //This skips an extra line to make it look cleaner.
         System.out.println("Original radius: " + ogRadius);
         //This prints out the above text plus the original radius of the circle.
         System.out.println("Final radius: " + circOne.getRadius());
         //This prints out the above text plus the new radius of the circle of all inputs that were added to it.

         scanner.close(); 
         //This closes the scanner to avoid any leaks.
    }
}
