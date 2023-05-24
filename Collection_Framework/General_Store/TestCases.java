
public class TestCases {
	ProductInventory pi = new ProductInventory();
	Product pro = new Product();

	// Test Case 1
	public void testAddProduct(Product pr) {
		if (pi.add_product(pr) == true) {
			System.out.println("Test Case 1: Pass");
		} else
			System.out.println("Test Case 1: Fail");
	}

	// Test Case 2
	public void testRemoveProduct(Product pr) {
		if (pi.remove_product(pr) == true) {
			System.out.println("Test Case 2: Pass");
		} else
			System.out.println("Test Case 2: Fail");
	}

	// Test Case 3
	public void testSearchProductForExitingProduct(String name) {
		if (pi.search_product(name) == true) {
			System.out.println("\nTest Case 3: Pass");

		} else
			System.out.println("Test Case 3: Fail");
	}

	// Test Case 4
	public void testSearchProductForNonExitingProduct(String name) {
		if (pi.search_product(name) == false) {
			System.out.println("\nTest Case 4: Pass");

		} else
			System.out.println("Test Case 4: Fail");
	}

	// Test Case 5
	public void testPrintInfoOfClothing(ClothingProduct clothing) {
		clothing.print_info();
		System.out.println("Test Case 5: Pass\n");
	}

	// Test Case 6
	public void testPrintInfoOfSkincare(SkincareProduct skincare) {
		skincare.print_info();
		System.out.println("Test Case 6: Pass\n");
	}

	// Test Case 7
	public void testPrintInfoOfCleaning(CleaningProduct cleaning) {
		cleaning.print_info();
		System.out.println("Test Case 7: Pass\n");
	}

	// Test Case 8
	public void testPrintInfoOfElectronic(ElectronicProduct electronic) {
		electronic.print_info();
		System.out.println("Test Case 8: Pass\n");
	}

	// Test Case 9
	public void testPrintInfoOfPlant(PlantProduct plant) {
		plant.print_info();
		System.out.println("Test Case 9: Pass\n");
	}

	// Test Case 10
	public void testEcoFriendlyClothingInfo(String type) {
		pi.ecoFriendlyInfo(type);
	}

	// Test Case 11
	public void testEcoFriendlySkincareInfo(String type) {
		pi.ecoFriendlyInfo(type);
	}

	// Test Case 12
	public void testEcoFriendlyCleaningInfo(String type) {
		pi.ecoFriendlyInfo(type);
	}

	/*
	 * 
	 * //Test Case 13 public void testEcoFriendlyElectronicInfo(String type) {
	 * pi.ecoFriendlyInfo(type); } //Test Case 14 public void
	 * testEcoFriendlyPlantInfo(String type) { pi.ecoFriendlyInfo(type); }
	 */
	public static void main(String[] args) {
		ClothingProduct cl1 = new ClothingProduct("M", "Organic Cotton", "Green", "Casual");
		Product pr1 = new Product("Eco T-Shirt", "OrganicWear", 25.99f, "Clothing", true, cl1);
		ClothingProduct cl2 = new ClothingProduct("M", "Organic Cotton", "Green", "Casual");
		Product pr2 = new Product("Eco Jeans", "Levi's", 89.99f, "Clothing", true, cl2);
		SkincareProduct sk1 = new SkincareProduct("Normal", "None", false);
		Product pr3 = new Product("Shampoo", "Pantene", 8.99f, "Skincare", false, sk1);
		CleaningProduct cln1 = new CleaningProduct("Multi-Surface", "Lavender", false);
		Product pr4 = new Product("All-Purpose Cleaner", "Clorox", 4.99f, "Cleaning", false, cln1);
		ElectronicProduct el1 = new ElectronicProduct("AC", true, true);
		Product pr5 = new Product("Smart Speaker", "Amazon", 99.99f, "Electronic", false, el1);
		PlantProduct pl1 = new PlantProduct("Ceramic", "Low", "Succulent");
		Product pr6 = new Product("Snake Plant", "Plants R Us", 24.99f, "Plant", true, pl1);
		ClothingProduct cl3 = new ClothingProduct("L", "Cotton", "Black", "Basic");
		Product pr7 = new Product("T-Shirt", "H&M", 12.99f, "Clothing", false, cl1);
		SkincareProduct sk2 = new SkincareProduct("Oily", "Acne", false);
		Product pr8 = new Product("Face Wash", "Neutrogena", 6.99f, "Skincare", false, sk2);

		TestCases tc = new TestCases();
		tc.testAddProduct(pr1);
		tc.testAddProduct(pr2);
		tc.testAddProduct(pr3);
		tc.testAddProduct(pr4);
		tc.testAddProduct(pr5);
		tc.testAddProduct(pr6);
		tc.testAddProduct(pr7);
	
		tc.testRemoveProduct(pr6);
		tc.testSearchProductForExitingProduct("Shampoo");
		tc.testSearchProductForNonExitingProduct("Snake Plant");
		tc.testPrintInfoOfClothing(cl1);
		tc.testPrintInfoOfSkincare(sk1);
		tc.testPrintInfoOfCleaning(cln1);
		tc.testPrintInfoOfElectronic(el1);
		tc.testPrintInfoOfPlant(pl1);
		tc.testEcoFriendlyClothingInfo("Clothing");

	}
}
