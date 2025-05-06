/**
 * This is one of the last assignments of AP Computer Science A class.
 * We walk through what to do in class and this is what I did and created.
 * This will cover all that has to do with Unit 9 of Inheritance.
 * @Jordan_Doctolero
 */
public class AdoptionMain {

	/*
	 * This is the main method where all the magic happens.
	 * We will create new Dog and PuppyDog objects and make sure each class works.
	 * We are creating our own dogs and puppies.
	 */
	public static void main(String[] args) {
		Dog hippie=new Dog(false, 3, "Hippie");
		//This creates a new Dog object with the attributes set.
		PuppyDog herper=new PuppyDog(false, 2, "Herper", false);
		//This creates a new PuppyDog object with the attributes set.
		
		System.out.println(hippie.getAdoptionStatus());
		//This will print the adoption status of hippie.
		System.out.println(herper.getAdoptionStatus());
		//This will print the adoption status of herper.
		
		hippie.stateAge();
		//This will call the method to get the age of hippie.
		herper.stateAge();
		//This will call the method to get the age of herper.

		hippie.increaseAge();
		//This will call the method to increase the age of hippie.
		herper.increaseAge();
		//This will call the method to increase the age of herper.
		
		hippie.stateAge();
		//This will call the method to get the age of hippie.
		herper.stateAge();
		//This will call the method to get the age of herper.

		System.out.println(hippie);
		//This will print the dog.
		//We get a reference code...These are subclasses of the object class.(5/1/25)
		//I fixed it on 5/6/25.
		System.out.println(herper);
		//This will print the dog.
		//We get a reference code...These are subclasses of the object class.(5/1/25)
		//I fixed it on 5/6/25.
	}

}
