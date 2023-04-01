class Employees extends CEO{
	String name;
	int age;
	int salary;
	String department;
	
	Employees(String name, int age, int salary, String department){
		super(name,age,salary,department);
	}
	public void displayInfo(){
		super.displayInfo();
		
	}
}