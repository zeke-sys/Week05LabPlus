package week05LabPlus;

public class Return {

	private Item item;
	private double change;
	
	
	//constructor
	public Return (Item item, double change) {
		this.item = item;
		this.change = change;
	}

	//getters and setters
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}
	
	
	@Override
	public String toString() {
		if (item != null) {
			return "Item: " + item + " - Change: $" + change;
		} else {
			return "Insufficient funds - Change: $" + change;
		}
	}
	
	
	
	
	

} //end of class
