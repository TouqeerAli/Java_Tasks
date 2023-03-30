import java.util.Scanner;

public class Account {
	static Scanner sc1 = new Scanner(System.in);
	static Account acc = new Account();
	private String name;
	private String cnic;
	private int pin;
	private String email;
	private String accountNo;
	private String phone;
	private int amount=0;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void addAmount(int amt) {
		this.amount+=amt;
		
		System.out.println("Your account has been credit with "+amt+" under A/C "+acc.getAccountNo());
	}
	public void createAccount() {
		System.out.print("Enter your name: ");
		this.name=sc1.next();
		acc.setName(this.name);
		System.out.print("Enter your cnic: ");
		this.cnic=sc1.next();
		acc.setCnic(this.cnic);
		System.out.print("Enter your pin: ");
		this.pin=sc1.nextInt();
		acc.setPin(this.pin);
		System.out.print("Enter your email: ");
		this.email=sc1.next();
		acc.setEmail(this.email);
		
		System.out.println("Account created successfully.");
	}
	
	public void login() {
		while(true) {
		System.out.print("Enter your cnic: ");
		String loginCnic=sc1.next();
		System.out.print("Enter your pin: ");
		int loginPin = sc1.nextInt();
		
		if(loginCnic.equals(getCnic()) && loginPin==getPin()) {
			System.out.println("logged in Successfully.");
			break;
		}else {
			System.out.println("CNIC or Pin is incorrect.");
		}
		}
	}
	
	public void depositCash() {
		boolean temp=true;
		while(temp) {
			boolean temp2=true;
		System.out.print("Enter account No: ");
		String accNo =sc1.next();
		
		try {
		int acc = Integer.parseInt(accNo);
		if(acc<0) {
			throw new NegativeNumberException("Account No can not be negative.");
			
		}
		}catch(NumberFormatException e) {
			System.out.println("Account No can not contain characters");
			System.out.println("Try again!!");
			temp=true;
			temp2=false;
		}catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
			temp=true;
			temp2=false;
		}
		acc.setAccountNo(accNo);
		if(accNo.length()>=8) {
			temp=false;
			
		}else if(accNo.length()<8 && temp2==true) {
			System.out.println("Account No should be atlest of 8 digits.");
			System.out.println("Try again!!");
			
		}
		}
		System.out.print("Enter phone No: ");
		String ph =sc1.next();
		acc.setPhone(ph);
		System.out.print("Enter amount: ");
		int amt =sc1.nextInt();
		
		acc.addAmount(amt);
		
		
		
	}
	
	//balance inquiry_______________________________
	public void balanceInquiry() {
		System.out.println("Your current balance is  :"+acc.getAmount());
	}
	public void getProfile() {
		System.out.println("---------------------------------------");
		System.out.println("		Your Profile		");
		System.out.println("Name			:	"+acc.getName());
		System.out.println("CNIC			:	"+acc.getCnic());
		System.out.println("Email			:	"+acc.getEmail());
		System.out.println("Current Balance		:	"+acc.getAmount());
		System.out.println("---------------------------------------");
	}
}
