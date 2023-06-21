
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
		ClothingProduct cl1 = new ClothingProduct("M", "Organic Cotton", "Green", "Casual","Eco T-Shirt", "OrganicWear", 25.99f, "Clothing", true);

		ClothingProduct cl2 = new ClothingProduct("M", "Organic Cotton", "Green", "Casual","Eco Jeans", "Levi's", 89.99f, "Clothing", true);

		SkincareProduct sk1 = new SkincareProduct("Normal", "None", false,"Shampoo", "Pantene", 8.99f, "Skincare", false);
		
		CleaningProduct cln1 = new CleaningProduct("Multi-Surface", "Lavender", false,"All-Purpose Cleaner", "Clorox", 4.99f, "Cleaning", false);

		ElectronicProduct el1 = new ElectronicProduct("AC", true, true,"Smart Speaker", "Amazon", 99.99f, "Electronic", false);

		PlantProduct pl1 = new PlantProduct("Ceramic", "Low", "Succulent","Snake Plant", "Plants R Us", 24.99f, "Plant", true);

		ClothingProduct cl3 = new ClothingProduct("L", "Cotton", "Black", "Basic","T-Shirt", "H&M", 12.99f, "Clothing", false);

		SkincareProduct sk2 = new SkincareProduct("Oily", "Acne", false,"Face Wash", "Neutrogena", 6.99f, "Skincare", false);


		TestCases tc = new TestCases();
		tc.testAddProduct(cl1);
		tc.testAddProduct(cl2);
		tc.testAddProduct(sk1);
		tc.testAddProduct(cln1);
		tc.testAddProduct(el1);
		tc.testAddProduct(pl1);
		tc.testAddProduct(cl3);
	
		tc.testRemoveProduct(pl1);
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
