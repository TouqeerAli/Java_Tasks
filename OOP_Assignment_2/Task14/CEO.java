class CEO{
	String name;
	int age;
	int salary;
	String department;
	
	 CEO(String name, int age, int salary, String department){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}
	
	public void displayInfo(){
		System.out.println("CEO Info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
		System.out.println("Department: "+this.department);
		
	}
}