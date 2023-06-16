package collection_framework.sorting_examples;

public class Product implements Comparable<Product>{

	private int prID;
	private String prName;
	private int prPrice;
	
	public Product(int prID, String prName, int prPrice) {
		this.prID = prID;
		this.prName = prName;
		this.prPrice = prPrice;
	}

	public int getPrID() {
		return prID;
	}

	public String getPrName() {
		return prName;
	}

	public int getPrPrice() {
		return prPrice;
	}

	@Override
	public String toString() {
		return "Product [prID=" + prID + ", prName=" + prName + ", prPrice=" + prPrice + "]";
	}
	

	@Override
	public int compareTo(Product o) {
		return this.prPrice-o.prPrice;
	}

}
