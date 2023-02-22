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

public class SingleLevelInheritance{
	public static void main(String[] args){
		Car tesla = new Car();
		tesla.vehicleDrives();
		tesla.carDrives();
	}

}