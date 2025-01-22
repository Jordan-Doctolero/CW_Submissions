/**
 * This is a class where I will be doing the Altering Arrays Assignemnt.
 * We are tasked to subtract 5 from all the elements in an int array.
 * The array must have always 4 elements.
 * @Jordan_Doctolero
 */
public class AlteringArrays_Practice {
	
  	/*
	 * This is the main method.
	 * I will be calling and declaring everything I need to here.
	 */
	public static void main(String[] args) {
		
	int[] nums = {4,8,7,10};
	//This decalres an int array and sets it equal to 3 elements.
        int[] result = subtract5FromAll4(nums);
        //This decalres an int array that is the result that is set equal to the method down below that is passed the nums array.
        System.out.println(result[0]);
        //This prints out the result of the array at index 0.
        System.out.println(result[1]);
        //This prints out the result of the array at index 1.
        System.out.println(result[2]);
        //This prints out the result of the array at index 2.
        System.out.println(result[3]);
        //This prints out the result of the array at index 2.
	}
		
	/*
	 * This is the method where the magic happens.
	 * I declare a copy array so I don't permantly change the orignal array.
	 * It uses a for loop to traverse each element and subtract 5 from each element.
	 */
	public static int[] subtract5FromAll4(int[]arr)
	{
		int[]copyArr=new int[arr.length];
		//This declares a copy Array as an int array and sets it equal to the array length of the original array.
		
		for(int i=0;i<copyArr.length;i++)
		//This is a for loop where the i is 0 and traverses through the copy array as long as i is less than its length. It iterates by 1.
		{
			copyArr[i]=arr[i]-5;
			//This sets the copyArr at the index of i equal to the original array-5. This subtracts 5 from the original array and store it in the copy.
		}
		return copyArr;
		//This returns the copyArr.
	}
}
