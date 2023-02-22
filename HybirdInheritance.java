class Vehicle{
	public void vehicleDrives(){
		System.out.println("Vehicle is Driving");
	}	
}
class Car extends Vehicle{
	public void carDrives(){
		System.out.println("Car is Driving");
	}
}
class Bike extends Vehicle{
	public void bikeDrives(){
	System.out.println("Bike is driving");
	}
	}
class Truck extends Car,Bike{
	public void truckDrives(){
	System.out.println("Truck is Driving");
	}
}
public class HybirdInheritance{
	public static void main(String[] args){
		Truck suzuki = new Truck();
		suzuki.vehicleDrives();
		suzuki.carDrives();
		suzuki.bikeDrives();
		suzuki.truckDrives();
	}

}