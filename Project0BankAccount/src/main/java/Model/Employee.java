package Model;

public class Employee {
	
	public int employeeID;
	public String firstName, lastName, email;
	
	public Employee() {
		
	}
	
	public Employee(int employee_id, String first_name, String last_name, String email) {
		employeeID = employee_id;
		firstName = first_name;
		lastName = last_name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
}
