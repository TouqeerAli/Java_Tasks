public class Bike extends Car{
	public void bikeDrives(){
	System.out.println("Bike is driving");
	}
	public static void main(String[] args){
	Bike honda = new Bike();
	honda.bikeDrives();
	honda.carDrives();
	honda.vehicleDrives();
	}
}