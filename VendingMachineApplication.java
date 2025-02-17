package week05LabPlus;

public class VendingMachineApplication {

	public static void main(String[] args) {
		
		//Creating a vending machine instance
		VendingMachine vm = new VendingMachine();
		
		//creating some items to stock the vending machine
		Item chips = new Item("Chips");
		Item soda = new Item("Soda");
		Item candy = new Item("Candy");
		
		//Add items to the vending machine at specific locations
		vm.addItemSlot(chips, 2.55, 3, "A1");
		vm.addItemSlot(soda, 1.95, 2, "B2");
		vm.addItemSlot(candy, 1.55, 1, "C3");
		
		//Display the available items
		vm.displayItems();
		
		//Insert money and purchase an item from location "A1"
		double moneyInserted = 5.00;
		Return result = vm.dispenseItem(moneyInserted, "A1");
		System.out.println("\nI inserted $" + moneyInserted + " and bought:\n\t" + result);
		
		System.out.println("\nPrinting what's left in the VM.\n");
		
		vm.displayItems();
		
		//Buying from a location with insufficient funds
		moneyInserted = 1.00;
		result = vm.dispenseItem(moneyInserted, "B2");
		System.out.println("\nI have a dollar and want a soda.\n\t" + result);
		
		//Printing the VM menu to see if anything changes
		System.out.println("\nPrinting what's left in the VM to see.\n");
		
		vm.displayItems();
		
		//Purchasing from an invalid location
		moneyInserted = 10.00;
		result = vm.dispenseItem(moneyInserted, "D1");
		System.out.println("\nI want the item from D1.\n\t" + result);
		
		
		
		

	} //end of main

} //end of class
