package collection_framework.sorting_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(101,"Laptop",100000));
		products.add(new Product(102,"Mobile",12000));
		products.add(new Product(103,"Charger",1000));
		
		Collections.sort(products,new PriceCamparator());
		
		System.out.println(products);

	}

}
