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
class Bike extends Car{
	public void bikeDrives(){
	System.out.println("Bike is driving");
	}
	}
public class MultiLevelInheritance{
	public static void main(String[] args){
		Bike honda = new Bike();
		honda.vehicleDrives();
		honda.carDrives();
		honda.bikeDrives();
	}

}