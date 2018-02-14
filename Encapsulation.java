package javaBeginner;

class Employee{
	private int EmployeeID;
	private String EmployeeName;
	private String Designation;
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return EmployeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return EmployeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return Designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		Designation = designation;
	}
}

public class Encapsulation extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation encap = new Encapsulation();
		
		encap.setEmployeeID(0001);
		encap.setEmployeeName("Hari Karepe");
		encap.setDesignation("Project Manager");
		
		System.out.println("Employee ID:"+encap.getEmployeeID());
		System.out.println("Employee Name:"+encap.getEmployeeName());
		System.out.println("Employee Designation:"+encap.getDesignation());
		
		encap.setEmployeeID(0002);
		encap.setEmployeeName("Vijaya Karepe");
		encap.setDesignation("Project Manager");
		
		System.out.println("Employee ID:"+encap.getEmployeeID());
		System.out.println("Employee Name:"+encap.getEmployeeName());
		System.out.println("Employee Designation:"+encap.getDesignation());
		
	}

}
