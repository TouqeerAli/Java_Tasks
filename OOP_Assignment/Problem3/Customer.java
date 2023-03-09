import java.util.Scanner;
class Customer{
	int id;
	String name;
	public Customer(int id , String name){
		this.id=id;
		this.name=name;
	}

	public void showDetails(){
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
	}
	
	public static void main(String[] args){
		System.out.println("Enter the details 5 Customers :");
		Customer c1 = new Customer(1,"Touqeer");
		Customer c2 = new Customer(2,"Rafey");
		Customer c3 = new Customer(3,"Amir");
		Customer c4 = new Customer(4,"Haseeb");
		Customer c5 = new Customer(5,"Inam");
		System.out.println("Details 5 Customers has been entered in Constructors:");

		System.out.println("Id and name of all Customers : ");
		c1.showDetails();
		c2.showDetails();
		c3.showDetails();
		c4.showDetails();
		c5.showDetails();
	}
}