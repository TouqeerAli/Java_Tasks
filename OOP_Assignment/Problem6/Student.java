import java.util.Scanner;
class Student{
	int id;
	String name;
	
	public void getStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id and name: ");
		this.id=sc.nextInt();
		this.name=sc.next();
	}
	public void displayStudent(){
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		
	}
}