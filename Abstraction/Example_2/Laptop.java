class Laptop extends Computer{
	String company;
	String cpu;
	String memory;
	String storage;
	String gpu;
	Laptop(String company,String cpu,String memory, String storage, String gpu){
		this.company=company;
		this.cpu=cpu;
		this.memory=memory;
		this.storage=storage;
		this.gpu=gpu;
	}
	void getSpecs(){
		System.out.println("Company ="+company);
		System.out.println("CPU ="+cpu);
		System.out.println("Memory ="+memory);
		System.out.println("Storage ="+storage);
		System.out.println("GPU ="+gpu);
	}
	
	public static void main (String []args){
		Laptop lp1= new Laptop("Dell","core i7 6th gen","8GB","256GB","2GB");
		lp1.getSpecs();
	}
}