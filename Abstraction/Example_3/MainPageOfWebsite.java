class MainPageOfWebsite extends Products{
	int index=0;
	void addProduct(String newProduct){
		
		listOfProduct[index]=newProduct;
		index++;
	}
	public void displayProduct(){
		for(int i=0; i<listOfProduct.length; i++){
			System.out.println(listOfProduct[i]);
		}
	}
	public static void main (String[] args){
		MainPageOfWebsite pg = new MainPageOfWebsite();
		pg.addProduct("tshirt");
		pg.addProduct("pant");
		pg.addProduct("jacket");
		pg.addProduct("formal shirt");
		pg.addProduct("shoes");
		pg.displayProduct();
	}
}