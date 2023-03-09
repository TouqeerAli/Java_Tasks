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
		
		Customer c = new Customer();
		c.getDetails();
		c.showDetails();
	}
}