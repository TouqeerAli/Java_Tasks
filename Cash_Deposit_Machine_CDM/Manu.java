import java.util.Scanner;

public class Manu{
	int choice;
	
	static Scanner sc2 = new Scanner(System.in);
	Account acc = new Account();
	boolean temp1=true;
	
	boolean temp3;
	public void showManu(){
	System.out.println("******* Welcome to Cash Deposit Machine *******");
	
	while(temp1) {
		boolean temp2=true;
	System.out.println("1) Create Account");
	System.out.println("2) login");
	System.out.print("Choice: ");
	choice=sc2.nextInt();
	while(temp2) {
	if(choice==2 && (acc.getCnic()==null)) {
		System.out.println("Create account first!!");
		
		temp2=false;
	}else if (choice==1) {
		if(acc.getCnic()!=null){
			System.out.println("Account already created, now login");
			temp2=false;
		}else {
		acc.createAccount();
		temp2=false;
		}
	}else if(choice==2) {
		acc.login();
		temp3=true;
		temp2=false;

	}
	
	}
	if(temp3==true) {
	temp1=false;
	}
	}
	}
	
	public void showRemainingManu() {
		boolean temp=true;
		do{
	System.out.println();
	System.out.println("1) Deposit Cash");
	System.out.println("2) Balance Inquiry");
	System.out.println("3) Get Profile");
	System.out.println("4) exit");
	System.out.print("Choice: ");
	choice=sc2.nextInt();
	
	switch(choice) {
	case 1:
	{
		acc.depositCash();
		break;
	}
	case 2:
	{
		acc.balanceInquiry();
		break;
	}
	case 3:
	{
		acc.getProfile();
		break;
	}
	case 4:
	{	
		System.out.println("	Thank you for using Cash Deposit Machine	");
		temp=false;
		break;
	}
	default:
	{
		System.out.println("Invalid choice!!");
		
	}
	}
	
	}while(temp);
	}
	
}
