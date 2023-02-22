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
public class Hierarchicalheritance{
	public static void main(String[] args){
		Bike honda = new Bike();
		honda.vehicleDrives();
		//honda.carDrives();// will give error
		honda.bikeDrives();
		
		Car tesla = new Car();
		tesla.vehicleDrives();
		tesla.carDrives();
	}

}