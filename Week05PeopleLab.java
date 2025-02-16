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
		
		
		//Other Lab
		//-------------------------------------------------------------------------------------

		/*
		 *  Vending Machine:
		 *
		 *   Create the following four classes:  VendingMachine, ItemSlot, Item, and Return
		 *
		 * 			a. VendingMachine: will contain a Map<String, ItemSlot> where 
		 *								the String will represent the location in the 
		 *								vending machine (i.e. "A4") 
		 *
		 * 			b. ItemSlot:  will contain an item, the item's price, and 
		 *								the quantity of that item in that slot 
		 *
		 * 			c. Item:  will contain a description 
		 *
		 * 			d. Return:  will have a field for an Item and a double for any change. 
		 * 								The Return is what will be returned 
		 *								to each user using the vending machine.
		 *
		 *   VendingMachine should have two methods:
		 *
		 *			a. a method that takes a double (money) and a location (i.e. "A4") 
		 *					and returns a Return containing any change and the item.
		 *					If the supplied money was insufficient to purchase the item, 
		 *					the Return should contain just the money (item should be null).
		 *
		 * 			b. a method that takes an Item, int (quantity), price and string (location) 
		 *					and will create an ItemSlot based on the input.
		 *
		 */
	
		
		
		
		
		
		
		
		
		

	} //end of main
	

	
	

} //end of class
