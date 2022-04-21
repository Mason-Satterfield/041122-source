package revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	private Connection conn = ConnectionManager.getConnection();
	
	@Override
	public Employee getEmployee(int employeeID) {
		
		try {
			String query = "SELECT * FROM employees WHERE employee_id = " +employeeID;

			Statement statement = conn.createStatement();
			
			//statement.setInt(1, employeeID);
			ResultSet rs = statement.executeQuery(query);
			
			if(rs.next()) {
				Employee employee = new Employee();
				employee.employeeID = rs.getInt("employee_id");
				employee.firstName = rs.getString("first_name");
				employee.lastName = rs.getString("last_name");
				employee.email = rs.getString("email");
				return employee;
			}else return null;
		}catch (SQLException e) {
			e.printStackTrace();
		}return null;
		
	}


}
