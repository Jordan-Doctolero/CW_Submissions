import java.util.Scanner;
//This imports a scanner into the class.

/**
 * This is question number 1 on the Strings Practice Assignment.
 * We will take the user input and print it back out.
 * It will also print it what iteration occured at that input and print that as well.
 * We used the key word 'stop' to indicate whether or not the user wants to exit the loop and end it.
 * @Jordan_Doctolero
 */
public class Task_1 {
	
	/*
	 * This is the main method where all the action takes place.
	 * We instantiated scanners and declared different variables.
	 * We used logic statement to continue looping the said method.
	 * It prints out what is inputed at each iteration.
	 * Then when the user says the magic word, the loop is exited and it ends,
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //This instatiates a new scanner object into the class.

        int count = 1; 
        //This declares a count int to 0 that will be counting how many times the loop runs.
        boolean isRunning = true; 
        //This declares a boolean condition to always true to start with.

        System.out.println("What would you like to print('stop' is the keyword to exit the loop): ");
        //This will print out to start the console and prompt the user and skips a line.
        
        while (isRunning) 
        //This while loop will only run while the boolean condition is true.
        {
            System.out.print("Input " + count + ": ");
            //This prints out and it will prompt the user to input anything.
            String userInput = scanner.nextLine(); 
            //This instatiates a new Scanner object called userInput.
    	      //Whatever the user types in the console, it will output.

            if (userInput.equals("Stop") || userInput.equals("stop")) 
            //If the users input is equals to stop, this logic statement runs.
            {
                isRunning = false; 
                //This sets the boolean condition to false which when the loop is ran again, it will exit.
            } 
            
            else 
            //If the if statement is false, this else statement runs.
            {
                System.out.println("You entered: " + userInput + " (Loop count: " + count + ")");
                //This prints out the above text plus what the user inputed and how many times the loop ran.
                //It then skips a line.
                count++; 
                //This adds 1 to the count int to count how many times the looph as run.
            }
        }

        System.out.println("Loop Ended.");
        //This prints out once the user has decided to exit the loop and skips a line,
        scanner.close(); 
        //This closes the scanner to avoid any leaks.
    }
}
