//import mypack.Employee;
package mypack;
import java.util.Scanner;

class UGteacher extends Employee{
	String course;
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course: ");
		this.course=sc.next();
	}
	public void display(){
		System.out.println("Course : "+this.course);
	}
	public static void main(String[] args){
		UGteacher t1 =new UGteacher();
		t1.input();
		t1.getInput();
		t1.show();
		t1.display();
	}
}