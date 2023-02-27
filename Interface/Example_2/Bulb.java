class Bulb implements ElectricalGadgets{
	String manufacturer;
	String item;
	String modelNo;
	String power;
	String inputVolt;
	String size;
	
	public Bulb(String manufacturer, String item, String modelNo, String power, String inputVolt, String size) {
		this.manufacturer = manufacturer;
		this.item = item;
		this.modelNo = modelNo;
		this.power = power;
		this.inputVolt = inputVolt;
		this.size = size;
	}
	public void switching(){
		System.out.println("Bulb is switching Off");
	}
	public void checkDefects(){
		System.out.println("Checking Defects of Bulb");
	}
	
	public void getInfo(){
		System.out.println("Manufacturer ="+manufacturer);
		System.out.println("ModelNo ="+modelNo);
		System.out.println("Item ="+item);
		System.out.println("Power ="+power);
		System.out.println("Input Volt ="+inputVolt);
		System.out.println("Power ="+power);
		System.out.println("Size ="+size);
	}
	public static void main(String[] args) {
		Bulb b = new Bulb("Sky Led", "3W led Bulb", "sv30","3w","DC 12V","98x57");
		b.getInfo();
		b.switching();
		b.checkDefects();
	}}
