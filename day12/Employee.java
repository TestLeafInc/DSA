package day12;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	
	public Employee(int id, String name, String designation) {
		this.employeeId = id;
		this.employeeName =name;
		this.employeeDesignation = designation;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
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
	

}
