public class Test{
	public static void main(String []args){
	CEO c = new CEO("Amir",20,25000,"IT Department");
	Manager m = new Manager("Rafey",20,25000,"IT Department");
	AssistantManager am = new AssistantManager("Iname",20,50000,"IT Department");
	Supervisor sp = new Supervisor("Saqib",20,40000,"IT Department");
	Employees emp = new Employees("Haseeb",20,30000,"IT Department");
			System.out.println("CEO Info:");
	c.displayInfo();
	System.out.println("Manager Info:");
	m.displayInfo();
	System.out.println("Assistant Manager Info:");
	am.displayInfo();
	System.out.println("Supervisor Info:");
	sp.displayInfo();
	System.out.println("Employees Info:");
	emp.displayInfo();
	}
}