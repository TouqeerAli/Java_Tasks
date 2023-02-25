class Tablet extends Computer{
	String company;
	String cpu;
	String memory;
	String gpu;
	String camera;
	Tablet(String company,String cpu,String memory, String camera, String gpu){
		this.company=company;
		this.cpu=cpu;
		this.memory=memory;
		this.camera=camera;
		this.gpu=gpu;
	}
	void getSpecs(){
		System.out.println("Company ="+company);
		System.out.println("CPU ="+cpu);
		System.out.println("Memory ="+memory);
		System.out.println("Camera ="+camera);
		System.out.println("GPU ="+gpu);
	}
	
	public static void main (String []args){
		Tablet tb1= new Tablet("Apple iPad","Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)",
							"256GB 3GB RAM","8MP","Apple GPU (4-core graphics)");
		tb1.getSpecs();
	}
}