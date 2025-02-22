import java.util.ArrayList;
//This imports and it allows us to have the ability to make ArrayLists.

/**
 * This is the new intro assignment for ArrayLists.
 * It is 7 questions that are pretty easy.
 * It was just to understand how they work and what we can do with them.
 * @Jordan_Doctolero
 */
public class Array_List_Intro {

	/*
	 * This is where we will do all the tasks.
	 * It is easy tasks so we know how ArrayLists work.
	 */
	public static void main(String[] args) {
		//Task 1: Instantiate an empty ArrayList that could have any type in it.
		ArrayList emptyList=new ArrayList();
		//This instantiates an empty ArrayList. This can be declared with any type.
		System.out.println(emptyList);
		//This prints said empty list and skips a line.
		
		System.out.println();
		//This skips a line so it looks neater.
		
		//Task 2: Instantiate an empty ArrayList called intArrList that specifically stores ints. Repeat this for Strings.
		ArrayList<Integer> intArrList=new ArrayList<Integer>();
		//This instantiates an  ArrayList that stores Integers for ints. 
		System.out.println(intArrList);
		//This prints said array list and skips a line.
		
		ArrayList<String> stringArrList=new ArrayList<String>();
		//This instantiates an  ArrayList that stores strings. 
		System.out.println(stringArrList);
		//This prints said array list and skips a line.
		
		System.out.println();
		//This skips a line so it looks neater.
		
		//Task 3: Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. 
		//Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
		intArrList.add(1);
		//This adds the int 1 to the intArrList.
		intArrList.add(2);
		//This adds the int 2 to the intArrList.
		intArrList.add(3);
		//This adds the int 3 to the intArrList.
		System.out.println(intArrList);
		//This prints said array list and skips a line.
		
		stringArrList.add("Alice");
		//This adds a string to the stringArrList.
		stringArrList.add("Bob");
		//This adds a string to the stringArrList.
		stringArrList.add("Charlie");
		//This adds a string to the stringArrList.
		System.out.println(stringArrList);
		//This prints said array list and skips a line.
		
		System.out.println();
		//This skips a line so it looks neater.
		
	    	//Task 4: Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. 
	    	//Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
		intArrList.add(2, 5);
		//This adds the number int 5 to the 2nd index.
		System.out.println(intArrList);
		//This prints said array list and skips a line.
		
		stringArrList.add(1, "Derek");
		//This adds the string to the 1st index.
		System.out.println(stringArrList);
		//This prints said array list and skips a line.
		
		System.out.println();
		//This skips a line so it looks neater.
		
		//Task 5: Print out the second and last elements in both intArrList and stringArrList.
		System.out.println(intArrList.get(1));
		//This prints out the second element of the Array.
		System.out.println(intArrList.get(intArrList.size()-1));
		//This uses .size to get and print the last element of the Array.
		
		System.out.println(stringArrList.get(1));
		//This prints out the second element of the Array.
		System.out.println(stringArrList.get(stringArrList.size()-1));
		//This uses .size to get and print the last element of the Array.
		
		System.out.println();
		//This skips a line so it looks neater.
		
		//Task 6: Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". 
		//Print out the first element in each array before and after the change. 
		System.out.println("Before: " + intArrList.set(0,0));
		//This prints out what the element was before we change it. This is because using .set returns the changed element.
		System.out.println("After: " + intArrList.get(0));
		//This prints out the new element by using .get after it was changed.
		
		System.out.println("Before: " + stringArrList.set(0,"Zero"));
		//This prints out what the element was before we change it. This is because using .set returns the changed element.
		System.out.println("After: " + stringArrList.get(0));
		//This prints out the new element by using .get after it was changed.
		
		System.out.println();
		//This skips a line so it looks neater.
		
		//Task 7: Delete the last element in both arrays. Print out what that removed element was. 
		System.out.println("Removed Element: " + intArrList.remove(intArrList.size()-1));
		//This uses the .remove class and we use the .size to find the last element. 
		//It removes the last element and prints what is removed.
		System.out.println("Removed Element: " + stringArrList.remove(stringArrList.size()-1));
		//This uses the .remove class and we use the .size to find the last element. 
		//It removes the last element and prints what is removed.
	}
}
