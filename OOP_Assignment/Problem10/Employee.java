package mypack;
import java.util.Scanner;
class Employee{
	int id;
	String name;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id and name: ");
		this.id=sc.nextInt();
		this.name=sc.next();
	}
	public void show(){
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);

	}
}