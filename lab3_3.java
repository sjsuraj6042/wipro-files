package wip_lab;


	import java.util.Scanner;

	class Employee {
	    private int id;
	    private String name;
	    private double salary;
	    private String designation;
	    private String insuranceScheme;

	    public Employee(int id, String name, double salary, String designation) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.designation = designation;
	        this.insuranceScheme = "";
	    }

	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }

	    public String getDesignation() { return designation; }
	    public void setDesignation(String designation) { this.designation = designation; }

	    public String getInsuranceScheme() { return insuranceScheme; }
	    public void setInsuranceScheme(String insuranceScheme) { this.insuranceScheme = insuranceScheme; }

	    @Override
	    public String toString() {
	        return "\nEmployee Details:" +
	               "\nID: " + id + 
	               "\nName: " + name + 
	               "\nSalary: " + salary + 
	               "\nDesignation: " + designation + 
	               "\nInsurance Scheme: " + insuranceScheme;
	    }
	}


	interface EmployeeService {
	    String assignInsuranceScheme(Employee emp);
	}

	class EmployeeServiceImpl implements EmployeeService {

	    @Override
	    public String assignInsuranceScheme(Employee emp) {
	        double salary = emp.getSalary();
	        String designation = emp.getDesignation().trim();

	        String scheme;

	        if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
	            scheme = "Scheme C";
	        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
	            scheme = "Scheme B";
	        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
	            scheme = "Scheme A";
	        } else {
	            scheme = "No Scheme";
	        }

	        emp.setInsuranceScheme(scheme);
	        return scheme;
	    }
	}

	// Main Program 
	public class lab3_3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EmployeeService empService = new EmployeeServiceImpl();

	        // 1. Get employee details from user
	        System.out.print("Enter Employee ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter Employee Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Employee Salary: ");
	        double salary = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter Employee Designation: ");
	        String designation = scanner.nextLine();

	        Employee emp = new Employee(id, name, salary, designation);

	        // 2. Find insurance scheme for employee based on salary/designation
	        empService.assignInsuranceScheme(emp);

	        // 3. Display all the details of employee
	        System.out.println(emp);

	        scanner.close();
	    }
	
}
