import java.util.Scanner;
class Customer{
	int id;
	String name;

	public void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id and name: ");
		this.id=sc.nextInt();
		this.name= sc.next();
		}
	public void showDetails(){
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
	}
	
	public static void main(String[] args){
		System.out.println("Enter the details 5 Customers :");
		Customer c1 = new Customer();
		c1.getDetails();
		Customer c2 = new Customer();
		c2.getDetails();
		Customer c3 = new Customer();
		c3.getDetails();
		Customer c4 = new Customer();
		c4.getDetails();
		Customer c5 = new Customer();
		c5.getDetails();
		System.out.println("Id and name of all Customers : ");
		c1.showDetails();
		c2.showDetails();
		c3.showDetails();
		c4.showDetails();
		c5.showDetails();
	}
}