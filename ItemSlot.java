package week05LabPlus;

public class ItemSlot {
	
	private Item item;
	private double price;
	private int quantity;
	
	public ItemSlot() {}; //so we can still use the default constructor in the main
	
	//overloaded constructor
	public ItemSlot(Item item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	//Dispense an item if available
	//Making sure our code continues to run
	//quantity-- decreases quantity after the current expression is evaluated. To see the new value
	//we'd have to print it out like system.out.println(quantity)
	//quantity -= 1 (compound assignment) - subtracts immediately
	
	public boolean dispenseItem() {
		if (quantity > 0) {
			quantity--; //post-decrement operator
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return item.toString() + " ($" + price + ") - Available: " + quantity;
	}
	
	
	
	

} //end of class
