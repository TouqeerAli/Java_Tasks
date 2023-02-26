class Guitar extends Instrument{
	String name;
	String category;
	String productCode;
	String brand;
	Guitar(String name, String category,String productCode,String brand){
		this.name=name;
		this.category=category;
		this.productCode=productCode;
		this.brand=brand;
	}
	public void play(){
		System.out.println("Guitar is playing");
	}
	public void record(){
		System.out.println("Recording Guitar tune");
	}
	public void getInfo(){
		System.out.println("Name ="+name);
		System.out.println("Category ="+category);
		System.out.println("Product Code ="+productCode);
		System.out.println("brand ="+brand);
	}
	
	public static void main(String[] args){
		Guitar gt = new Guitar("Washburn T-12B Bass Guitar","Bass Guitars","T-12B","Washburn");
		gt.play();
		gt.record();
		gt.getInfo();
	}
}