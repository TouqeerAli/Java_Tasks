package collection_framework.sorting_examples;

import java.util.*;

public class PriceCamparator implements Comparator<Product>{

	
	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPrPrice()>p2.getPrPrice())
		return 1;
		else if(p1.getPrPrice()<p2.getPrPrice()) 
			return -1;
			else
				return 0;
		
		
	}

}
