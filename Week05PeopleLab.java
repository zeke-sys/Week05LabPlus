package week05LabPlus;

public class Week05PeopleLab {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("Week 05 Object Lab\n    Class Creation: ");
		
		System.out.println("-------------------------");
		/*
		 *  1. Person Class:	
		 *		Create a class called Person with fields firstName, lastName, and age. 
		 * 			Make sure any age assigned must be valid (i.e. non negative and < 120)
		 */
		System.out.println("\nQuestion 1: Create Class & Instantiate\n ");

		/*
		 * Instantiate Person objects here
		 */
		
		Person person = new Person();
		
		
		
		
		/*
		 *  2. Declare 2 Instances of Person:
		 *		Create 2 different instances of Person with different values for the fields.
		 */
		
		System.out.println("-------------------------");
		System.out.println("\nQuestion 2: Instantiate & call describe(): \n");

		/*
		 * Instantiate the object & call describe() here
		 */
		
		//one way to declare fields for the instance of a class
		person.firstName = "Billy";
		person.lastName = "John";
		person.age = 30;
		
		//another way to declare fields for the instance of a class thanks to the overloaded constructor in the Person class
		
		person.describe();
		
		Person person1 = new Person("Sarah", "Winehouse", 28);
		
		person1.describe();
		
		/*
		 *  3. Who is Older?
		 *
		 *		Create and test a method that takes a two Persons and returns the firstName
		 * 			of the Person who is older.
		 */
		System.out.println("-------------------------");
		System.out.println("\nQuestion 3: Create & call a method  \n");
		System.out.println("See the Q3 method in the Person class.\n");
		System.out.println("The older person is:\n-------------------");

		/*
		 * Call to the new method here
		 */
		
		
		
		person.isOlder(person, person1);
		
		System.out.println("-------------------------");
		
	
		//------------------------------------------------------------------------------------
	
		
		
		
		
		
		
		
		
		

	} //end of main
	

	
	

} //end of class
