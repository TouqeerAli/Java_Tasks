import java.util.Scanner;
class Employee{
	private int empNo;
	private float salary;
	
	public void setEmpNo(int empNo){
		this.empNo=empNo;
	}
	public int getEmpNo(){
		return this.empNo;
	}
	
	public void setSalary(float salary){
		this.salary=salary;
	}
	public float getSalary(){
		return this.salary;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	Employee emp3 = new Employee();
	int empNo;
	float salary;
	for(int i=1; i<=3; i++){
	System.out.println("Employee "+i);
	System.out.print("Enter the employee Number: ");
	empNo = sc.nextInt();
	System.out.print("Enter the employee Salary: ");
	salary = sc.nextFloat();
	if(i==1){
	emp1.setEmpNo(empNo);
	emp1.setSalary(salary);
	}else if(i==2){
	emp2.setEmpNo(empNo);
	emp2.setSalary(salary);
	}else if(i==3){
	emp3.setEmpNo(empNo);
	emp3.setSalary(salary);
	}
	}
	
	System.out.println("Employee 1");
	System.out.println("Employee Number: "+emp1.getEmpNo());
	System.out.println("Employee Salary: "+emp1.getSalary());
	System.out.println("Employee 2");
	System.out.println("Employee Number: "+emp2.getEmpNo());
	System.out.println("Employee Salary: "+emp2.getSalary());
	System.out.println("Employee 2");
	System.out.println("Employee Number: "+emp3.getEmpNo());
	System.out.println("Employee Salary: "+emp3.getSalary());
	}
}