package dsa.supai;

import java.util.HashMap;
import java.util.Scanner;

class Employee {
	String employeeId;
	String employeeName;
	String employeeDesignation;
	String managerEmployeeId;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getmanagerEmployeeId() {
		return managerEmployeeId;
	}

	public void setmanagerEmployeeId(String managerEmployeeId) {
		this.managerEmployeeId = managerEmployeeId;
	}

	public Employee(String employeeId, String employeeName, String employeeDesignation, String managerEmployeeId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerEmployeeId = managerEmployeeId;
	}

}

public class Main {

	public static void main(String[] args) {

		Main main = new Main();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter id");
		String s1 = scanner.nextLine();
		String s2 = s1.toUpperCase();

//		System.out.println(main.hierarchy(s2));

		try {

			System.out.println(main.hierarchy(s2));
		} catch (Exception ex) {
			System.out.println("Sorry Employee not Exist try with another id");
		}

	}

	public String hierarchy(String empId) {

		Employee e1 = new Employee("X7F3", "john doe", "CEO", "NULL");
		Employee e2 = new Employee("POR4", "jane smith", "CTO", "X7F3");
		Employee e3 = new Employee("K2B9", "david lee", "CFO", "X7F3");
		Employee e4 = new Employee("L8M5", "michale brown", "VP eng", "POR4");
		Employee e5 = new Employee("A3N6", "sarah jones", "VP mkt", "X7F3");
		Employee e6 = new Employee("B9Q7", "emily davis", "SE", "L8M5");
		Employee e7 = new Employee("C5R1", "james wilson", "MM", "A3N6");
		Employee e8 = new Employee("D1S2", "christopher martinez", "SE", "L8M5");
		Employee e9 = new Employee("E6T0", "nancy rodriguez", "MS", "C5R1");
		Employee e10 = new Employee("F4U8", "patrica walker", "MS", "C5R1");

		HashMap<String, Employee> map = new HashMap<String, Employee>();
		map.put(e1.employeeId, e1);
		map.put(e2.employeeId, e2);
		map.put(e3.employeeId, e3);
		map.put(e4.employeeId, e4);
		map.put(e5.employeeId, e5);
		map.put(e6.employeeId, e6);
		map.put(e7.employeeId, e7);
		map.put(e8.employeeId, e8);
		map.put(e9.employeeId, e9);
		map.put(e10.employeeId, e10);

		Employee employee = map.get(empId);
//		 if(!map.containsKey(empId)) {
//		 return "Sorry Employee not Exist try with another id";
//		 }

		if (employee.getmanagerEmployeeId().equals("NULL")) {

			return employee.employeeName + "(" + employee.employeeDesignation + "-" + employee.employeeId + ")";
		}

		return hierarchy(employee.managerEmployeeId) + "," + employee.employeeName + "(" + employee.employeeDesignation
				+ "-" + employee.employeeId + ")";

	}

}
