import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudApplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp[] = new Employee[empList.size() + 10];
		int i = 0;
		emp[i] = new Employee();
		boolean exit = true;
		while (exit) {
			System.out.println("\n===========Welcome to Employees Data===========");
			System.out.println("1- Add Employee");
			System.out.println("2- Update Employee");
			System.out.println("3- Delete Employee");
			System.out.println("4- Get Employee");
			System.out.println("5- Get All Employees");
			System.out.println("6- Exit");
			System.out.println("--------------------");
			System.out.println("Select any choice : ");
			int ch = sc.nextInt();
			CrudApplication crud = new CrudApplication();
			switch (ch) {
			case 1: {

				crud.addEmp(emp, i, empList);
				i++;
				emp[i] = new Employee();
				break;
			}
			case 2: {
				crud.updateEmp(emp, empList);
				break;
			}
			case 3: {
				crud.deleteEmp(empList);
				break;
			}
			case 4: {
				crud.getEmp(empList);
				break;
			}
			case 5: {
				crud.getAllEmp(empList);
				break;
			}
			case 6: {
				System.out.println("*****Thank you*****");
				exit = false;
				break;
			}
			default: {
				System.out.println("Invalid Choice!!!!!");
			}
			}

		}

	}

	public void addEmp(Employee emp[], int i, List<Employee> empList) {
		System.out.print("Enter Employee name : ");
		emp[i].setName(sc.next());
		System.out.print("\nEnter Employee id : ");
		emp[i].setId(sc.nextInt());
		System.out.print("\nEnter Employee salary : ");
		emp[i].setSalary(sc.nextInt());
		System.out.print("\nEnter Employee age : ");
		emp[i].setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("\nEnter Employee email : ");
		emp[i].setEmail(sc.nextLine());
		empList.add(emp[i]);

	}

	public void updateEmp(Employee emp[], List<Employee> empList) {

		System.out.print("Enter Employee id (To update records) : ");
		Integer tempId = sc.nextInt();
		for (int j = 0; j < empList.size(); j++) {
			if (empList.get(j).getId() == tempId) {
				System.out.print("Enter Employee name : ");
				emp[j].setName(sc.next());
				System.out.print("\nEnter Employee salary : ");
				emp[j].setSalary(sc.nextInt());
				System.out.print("\nEnter Employee age : ");
				emp[j].setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("\nEnter Employee email : ");
				emp[j].setEmail(sc.nextLine());
				System.out.println("Employee successfully updated.");
				empList.set(j, emp[j]);
				break;
			} else if (empList.get(j).getId() != tempId && j == empList.size() - 1) {
				System.out.println("Employee does not exists.");
			}
		}

	}

	public void deleteEmp(List<Employee> empList) {
		System.out.print("Enter Employee id (To Delete) : ");
		Integer tempId = sc.nextInt();
		for (int j = 0; j < empList.size(); j++) {
			if (empList.get(j).getId() == tempId) {
				empList.remove(j);
				System.out.println("Employee deleted successfully.");
				break;
			} else if (empList.get(j).getId() != tempId && j == empList.size() - 1) {
				System.out.println("Employee does not exists.");
			}
		}
	}

	public void getEmp(List<Employee> empList) {
		System.out.print("Enter Employee id (To get records) : ");
		Integer tempId = sc.nextInt();
		for (int j = 0; j < empList.size(); j++) {
			if (empList.get(j).getId() == tempId) {

				System.out.println("\n****Employee Data****");
				System.out.println("---------------------");
				System.out.println("Name   : " + empList.get(j).getName());
				System.out.println("ID     : " + empList.get(j).getId());
				System.out.println("Salary : " + empList.get(j).getSalary());
				System.out.println("Age    : " + empList.get(j).getAge());
				System.out.println("Email  : " + empList.get(j).getEmail());
				break;
			} else if (empList.get(j).getId() != tempId && j == empList.size() - 1)
				System.out.println("Employee does not exists.");
		}
	}

	public void getAllEmp(List<Employee> empList) {
		System.out.println("****************ALL EMPLOYEES DATA****************");
		System.out.println("Sr.No | ID  |   NAME   |  SALARY  |  AGE  | EMAIL ");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(i + 1 + "     | " + empList.get(i).getId() + " | " + empList.get(i).getName() + "     | "
					+ empList.get(i).getSalary() + "     | " + empList.get(i).getAge() + "    | "
					+ empList.get(i).getEmail());
		}
	}

}
