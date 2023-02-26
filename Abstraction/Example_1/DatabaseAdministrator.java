class DatabaseAdministrator extends Employee{
	String fname;
	String email;
	String phoneNo;
	String address;
	String specialization;
	
	DatabaseAdministrator(String fname, String email,String phoneNo,String address,String specialization){
		this.fname=fname;
		this.email=email;
		this.phoneNo=phoneNo;
		this.address=address;
		this.specialization=specialization;
	}
	public void getEmployeeInfo(){
		System.out.println("Full Name : "+fname);
		System.out.println("Email : "+email);
		System.out.println("Phone No. :"+phoneNo);
		System.out.println("Address : "+address);
		System.out.println("Specialization : "+specialization);
	}
	public static void main(String []args){
		SoftwareDeveloper emp1 = new SoftwareDeveloper("Amir Jamali","amirali123@gmail.com",
								"012345678","Muet Jamshoro","Mysql");
		emp1.getEmployeeInfo();
	}
}