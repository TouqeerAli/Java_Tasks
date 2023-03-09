import java.util.Scanner;
class Employee{
	int id;
	String name;
	int basic;
	public Employee(int id, String name,int basic){
		this.id=id;
		this.name=name;
		this.basic=basic;
	}
	public void displaySalarySlip(){
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("SALARY STATEMENT OF THE EMPLOYEES");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("     AAAAAAAA Pvt. Ltd.");
		System.out.println("=====================================================");
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Basic : "+this.basic);
		if(basic>=5000 && basic <10000){
			System.out.println("DA(+): "+basic*0.40);
			System.out.println("HRA(+): "+basic*0.20);
			System.out.println("PF(-): "+basic*0.10);
			System.out.println(" ________________________________" );
			System.out.println("NET Salary : "+ ((basic+basic*0.40+basic*0.20)-basic*0.10));

		}else if(basic>=3000 && basic <5000){
			System.out.println("DA(+): "+basic*0.30);
			System.out.println("HRA(+): "+basic*0.20);
			System.out.println("PF(-): "+basic*0.10);
			System.out.println("________________________________ ");
			System.out.println("NET Salary : "+ ((basic+basic*0.30+basic*0.20)-basic*0.10));
		}else if(basic<3000 ){
			System.out.println("DA(+): "+basic*0.20);
			System.out.println("HRA(+): "+basic*0.10);
			System.out.println("PF(-): "+basic*0.10);
			System.out.println("________________________________ ");
			System.out.println("NET Salary : "+ ((basic+basic*0.20+basic*0.10)-basic*0.10));
		}else if(basic>=10000){
			System.out.println("DA(+): "+basic*0.50);
			System.out.println("HRA(+): "+basic*0.30);
			System.out.println("PF(-): "+basic*0.10);
			System.out.println("________________________________" );
			System.out.println("NET Salary : "+ ((basic+basic*0.50+basic*0.30)-basic*0.10));
		}
		System.out.println("=====================================================");

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++){
		System.out.println("Etner id, name and basic : ");
		int id=sc.nextInt();
		String name=sc.next();
		int basic =sc.nextInt();
		Employee emp= new Employee(id,name,basic);
		emp.displaySalarySlip();
		}
	}
}