class HeadOfDepartment{
	String name;
	int age;
	int salary;
	String department;
	
	HeadOfDepartment(String name, int age, int salary, String department){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}
	
	public void displayInfo(){
		System.out.println("HeadOfDepartment Info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
		System.out.println("Department: "+this.department);
		
	}
}
class Co_ordinator extends HeadOfDepartment{
	
	Co_ordinator(String name, int age, int salary, String department){
		super(name,age,salary,department);
	}
	public void displayInfo(){
		System.out.println("Co_ordinator Info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
		System.out.println("Department: "+this.department);
		
	}

}
class Faculties extends Co_ordinator{
	
	int NoOfTeachers;
	Faculties(String name, int age, int salary, String department,int NoOfTeachers){
		super(name,age,salary,department);
		this.NoOfTeachers=NoOfTeachers;
	}
	
	public void displayInfo(){
		System.out.println("Faculties Info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
		System.out.println("Department: "+this.department);
		System.out.println("NoOfTeachers: "+this.NoOfTeachers);
		
	}
}
public class Students extends Faculties{
	
	int NoOfStudents;
	Students(String name, int age, int salary, String department,int NoOfStudents){
		super(name,age,salary,department,NoOfStudents);
		this.NoOfStudents=NoOfStudents;
		
	}
	public void displayInfo(){
		System.out.println("Students Info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
		System.out.println("Department: "+this.department);
		System.out.println("NoOfStudents: "+this.NoOfStudents);
		
	}
	public static void main(String [] args){
	Students s = new Students("haseeb",19,260000,"IT department",30);
	s.displayInfo();
	Faculties f = new Faculties("Touqeer",19,250000,"IT department",40);
	f.displayInfo();
	}
}

