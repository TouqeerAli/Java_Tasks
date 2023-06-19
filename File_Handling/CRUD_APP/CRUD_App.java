

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD_App {

	static FileWriter fw = null;
	static FileReader fr = null;

	public static void main(String[] args) {
		File file = new File("employee_data.txt");

		CRUD_App crudApp = new CRUD_App();
		Employee emp = new Employee();
		List<String> list = new ArrayList<>();
		List<Employee> empList = new ArrayList<>();

		// Creating file

		try {

			if (file.createNewFile()) {

				System.out.println("New File Created!!");
			} else {
				System.out.println("File already exists with this name!!");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		boolean isTrue = true;
		while (isTrue) {

			System.out.println(" 	CRUD APPLICATION	 ");
			System.out.println("1- Add Employee");
			System.out.println("2- Remove Employee");
			System.out.println("3- Update Employee");
			System.out.println("4- Get Employees data");
			System.out.println("5- Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				crudApp.addEmp(empList, file); // add employee to list
				crudApp.writeData(empList, file);
				break;
			}
			case 2: {
				crudApp.removeEmp(list, file);

				break;
			}
			case 3: {
				crudApp.updateEmp(list, file);
				break;
			}
			case 4: {
				crudApp.getEmp(file);
				break;
			}
			case 5: {
				isTrue = false;
				break;
			}
			default: {
				System.out.println("Invalid!!!");
			}
			}
		}

	}

	// Add employee
	public void addEmp(List<Employee> empList, File file) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		emp.setName(sc.nextLine());
		System.out.print("Enter Id: ");
		emp.setId(sc.next());
		System.out.print("Enter Age: ");
		emp.setAge(sc.nextInt());

		empList.add(emp);

	}

	public void writeData(List<Employee> empList, File file) {
		try {
			fw = new FileWriter(file);
			fw.write("ID		Name		Age\n");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			for (Employee emp : empList) {
				fw.write(emp.getId() + "		" + emp.getName() + "		" + emp.getAge() + "\n");
			}
			System.out.println("Employee added successfully!!\n");
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	// Removing employee
	public void removeEmp(List<String> list, File file) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		String id = sc.next();
		list.clear();
		BufferedReader bf;
		String line;
		try {
			bf = new BufferedReader(new FileReader(file));
			try {
				while ((line = bf.readLine()) != null) {
					if (line.contains(id)) {
						continue;
					} else {
						list.add(line);
					}
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			fw = new FileWriter(file);

			for (String s : list) {
				fw.append(s);
				fw.append("\n");
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Employee removed successfuly!!\n");
	}

	// Updating Employee

	public void updateEmp(List<String> list, File file) {
		list.clear();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of Employee you want to Update: ");
		String empID = sc.next();

		BufferedReader bf = null;
		String line;

		try {

			bf = new BufferedReader(new FileReader(file));
			try {
				while ((line = bf.readLine()) != null) {
					if (line.contains(empID)) {
						System.out.println("What do yo want to update:\n1-Name\n2- Age\n");
						int choice = sc.nextInt();
						String oldName;
						String newName;
						String oldAge;
						String newAge;
						if (choice == 1) {
							System.out.println("Enter old name: ");
							oldName = sc.next();
							System.out.println("Enter new name: ");
							newName = sc.next();
							list.add(line.replace(oldName, newName));
						} else if (choice == 2) {
							System.out.println("Enter old age: ");
							oldAge = sc.next();
							System.out.println("Enter new age: ");
							newAge = sc.next();
							list.add(line.replace(oldAge, newAge));
						}
					} else {
						list.add(line);
					}
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		try {
			fw = new FileWriter(file);

			for (String s : list) {
				fw.append(s);
				fw.append("\n");
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Employee Updated successfully!!!\n");
	}

	// Get Employees Data

	public void getEmp(File file) {
		System.out.println("\n------------EMPLOYEES DATA------------\n");
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line;

			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println();
	}

}
