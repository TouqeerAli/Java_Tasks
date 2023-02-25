class SoftwareDeveloper extends Employee{
	public void salary(int sal){
		System.out.println("Salary of Software Developer is "+ sal);
	}
	public static void main(String []args){
		SoftwareDeveloper emp1 = new SoftwareDeveloper();
		emp1.salary(70000);
	}
}