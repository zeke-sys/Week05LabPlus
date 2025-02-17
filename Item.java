package week05LabPlus;

public class Item {
	
	private String description;
	
	//Constructor
	public Item(String description) {
		this.setDescription(description);
	}
	
	//Getter and Setter
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() { //Returns a string representation of the object.
		return description;
	}

	
	
	

} //end of class
