class TestCompany{
	public static void main(String []args){
		Employee emp1 = new Employee();
		emp1.setName("Amir");
		emp1.setDesignation("Junior Software enginner");
		emp1.setSalary(80000);
		
		Company comp = new Company();
		comp.setName("ABC Company");
		comp.setLocation("Hyderabad");
		comp.setEmployee(emp1);
		
		System.out.println("EMPLOYEE INFO");
		System.out.println("Name: "+comp.getEmployee().getName());
		System.out.println("Designation: "+comp.getEmployee().getDesignation());
		System.out.println("Salary: "+comp.getEmployee().getSalary());
		System.out.println("Company: "+comp.getName());
		System.out.println("Location of Company: "+comp.getLocation());
		
	}
}