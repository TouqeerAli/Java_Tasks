class Fan implements ElectricalGadgets{
	String manufacturer;
	String model;
	String category;
	int size;
	public Fan(String manufacturer, String model, String category, int size) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.category = category;
		this.size = size;
	}
	public void getInfo(){
		System.out.println("Manufacturer ="+manufacturer);
		System.out.println("Model ="+model);
		System.out.println("Category ="+category);
		System.out.println("Size ="+size);
	}
	public void switching(){
		System.out.println("Fan is switching On");
	}
	public void checkDefects(){
		System.out.println("Checking Defects");
	}
	
	public static void main(String[] args) {
		Fan myFan = new Fan("Starco Fans","Florence Inverter","Ceiling Fan",30);
		myFan.getInfo();
		myFan.switching();
		myFan.checkDefects();
		
	}
}