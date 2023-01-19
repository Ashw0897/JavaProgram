package com.phoenix.demos;

class Employee
{
	private int empId;
	private String empName;
	private String empAddress;
	private String dept;
	private double salary;
	private long phoneNo;
	
	public Employee()
	{
		System.out.println("Defalut Constructor");
	}

	public Employee(int empId, String empName, String empAddress, String dept, double salary, long phoneNo) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.dept = dept;
		this.salary = salary;
		this.phoneNo = phoneNo;
	}
	
	
	public Employee(Employee emp)// Copy Constructor
	{
		this.empId = emp.empId;
		this.empName = emp.empName;
		this.empAddress = emp.empAddress;
		this.dept = emp.dept;
		this.salary = emp.salary;
		this.phoneNo = emp.phoneNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", dept=" + dept
				+ ", salary=" + salary + ", phoneNo=" + phoneNo + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
public class Coexamplenstructor {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp1 = new Employee(1098, "Ashok Saraf", "Mumbai", "IT", 100000, 9876548908L);
		Employee emp2 = new Employee(1099, "Rajani Surana", "Mumbai", "IT", 198000, 9876548908L);
        Employee emp3 = new Employee(emp1);
        Employee emp4 = new Employee(emp2);
        
        System.out.println(emp);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
	}

}
