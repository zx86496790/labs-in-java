package lab9;

public class Details {
	private int itemID;
	private String description;
	private int numberOfPurchasedItems;

	
	public Details(int itemID, int numberOfPurchasedItems, String description) {
		this.itemID = itemID;
		this.description = description;
		this.numberOfPurchasedItems = numberOfPurchasedItems;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfPurchasedItems() {
		return numberOfPurchasedItems;
	}

	public void setNumberOfPurchasedItems(int numberOfPurchasedItems) {
		this.numberOfPurchasedItems = numberOfPurchasedItems;
	}

}
