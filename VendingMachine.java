package week05LabPlus;

import java.util.HashMap;
import java.util.Map;

//See conditions for application below

public class VendingMachine {
	
	private Map<String, ItemSlot> slots;
	
	//Constructor
	public VendingMachine() {
		slots = new HashMap<>();
	}
	
	//Methods 
	
	//Add an item to the vending machine
	public void addItemSlot(Item item, double price, int quantity, String location) {
		ItemSlot itemSlot = new ItemSlot(item, price, quantity);
		slots.put(location, itemSlot);
	}
	
	//Return an item and change if enough money is inserted
	
	public Return dispenseItem(double money, String location) {
		ItemSlot slot = slots.get(location);
		
		//check if the location exists
		if (slot == null) {
			return new Return(null, money); //Invalid location
		}
			double price = slot.getPrice();
			
		//check if the user has enough money
		if (money >= price) {
			boolean itemDispensed = slot.dispenseItem();
			if (itemDispensed) {
				double change = money - price;
				return new Return(slot.getItem(), change);
			} else {
				return new Return(null, money); //Item not available
			}
		} else {
			return new Return(null, money); //Insufficient funds
		}
	}
	
	
	//Display the available items in the vending machine
	
	public void displayItems() {
		System.out.println("Items in Vending Machine:");
		for(Map.Entry<String, ItemSlot> entry : slots.entrySet()) {
			System.out.println("Location: " + entry.getKey() + " - " + entry.getValue());
		}
	}
	
	//Getter and Setter
		public Map<String, ItemSlot> getSlots() {
			return slots;
		}

		public void setSlots(Map<String, ItemSlot> slots) {
			this.slots = slots;
		}
		
		
		/*
		 *  Vending Machine Application:
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

	
	
	
	
	
} //end of class
