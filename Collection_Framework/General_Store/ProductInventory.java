import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
	private List<Product> products;
	Product product = new Product();

	public ProductInventory() {
		this.products = new ArrayList<>();
		;
	}

	public ProductInventory(List<Product> products) {
		this.products = products;
	}

	public boolean add_product(Product product) {
		return products.add(product);
	}

	public boolean remove_product(Product product) {
		return products.remove(product);
	}

	String productName = product.getName();

	public boolean search_product(String productName) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(productName) == true) {
				System.out.println("\n-----------Product Information-----------");
				products.get(i).print_info();

				if (products.get(i).getType().equals("Clothing")) {
					products.get(i).getClothing().print_info();
				} else if (products.get(i).getType().equals("Skincare")) {
					products.get(i).getSkincare().print_info();
				} else if (products.get(i).getType().equals("Cleaning")) {
					products.get(i).getCleaning().print_info();
				} else if (products.get(i).getType().equals("Electronic")) {
					products.get(i).getElectronic().print_info();
				} else if (products.get(i).getType().equals("Plant")) {
					products.get(i).getPlant().print_info();
				}
				return true;
			} else if (products.get(i).getName().equals(productName) == false && i == products.size() - 1) {
				System.out.println("Product not found in the store.");
				return false;
			}
		}
		return false;
	}

	public void ecoFriendlyInfo(String type) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getType().equals(type) && products.get(i).getEco_friendly() == true) {
				products.get(i).print_info();
				System.out.println();

			}
		}
	}

}
