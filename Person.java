package week05LabPlus;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	
	/*if(age >=0 && age < 120) {
		return age;
	} */
	
	public Person() {}; //allowing us to still use the new Person Java constructor in the main
	
	//overloaded constructor so we don't have to use the default new Person Java constructor in the main
	public Person (String firstName, String lastName, int age) {
		this.firstName = firstName; //doing this allows Java to store these fields for every new instance of the class
		this.lastName = lastName; 
		if (age > 0 && age < 120) {
					this.age = age;
				} else {
					throw new IllegalArgumentException("Please review age entered.");
				};
	} //end of constructor
	
	
	//describe method
	public void describe() {
		System.out.println("\n- My name is " + firstName + " " + lastName + ", and I'm " + age + " years-old.");
	}
	
	//Older person method
	public String isOlder(Person first, Person second) {
		if (first.age > second.age) {
			System.out.println(first.firstName + " " + first.lastName);
		} else if (first.age < second.age) {
			System.out.println(second.firstName + " " + second.lastName);
		} else {
			System.out.println("They are the same age.");
		}
		return second.firstName;
	}

	

} //end of class
