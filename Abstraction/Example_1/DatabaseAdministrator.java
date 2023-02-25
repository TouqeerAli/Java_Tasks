class DatabaseAdministrator extends Employee{
	public void salary(int sal){
		System.out.println("Salary of Database Administrator is "+ sal);
	}
	public static void main(String []args){
		DatabaseAdministrator emp1 = new DatabaseAdministrator();
		emp1.salary(50000);
	}
}