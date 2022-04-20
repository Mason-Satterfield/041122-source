import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


//the student dao is where we store all our methods for interacting with the Student table in the database
public class StudentDAO {
	
	//this creates an instance of our getConnection() method from the ConnectionManger class
	//also follows the singleton pattern (one single access point to our manager)
	private Connection conn = ConnectionManager.getConnection();
	
	//this method returns all students
	public ArrayList<StudentModel> getAllStudents(){
		//creating a statement
		try {
			//this creates a new statement called statement that uses a connection to the
			Statement statement = conn.createStatement();
			
			//this is our query to be executed
			ResultSet rs = statement.executeQuery("SELECT * FROM Student");
			
			//this is our arraylist for storing our results
			ArrayList<StudentModel> students = new ArrayList<StudentModel>();
			
			//this loop runs so long as there is another row in rs
			while(rs.next()) {
				//getting each column in the row and setting it to our variable
				//the rs.getInt("id") come from the Student model not SQL
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int age = rs.getInt("age");
				
				//this adds each new student to our student list(array) in line 20
				students.add(new StudentModel(id, firstName, lastName, age));
			}
			return students;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//this method adds a new student to the database using a prepare statement
	public void addStudent(StudentModel newStudent) {
		try {
			//this is our query to be executed
			String query = "INSERT into Student (FirstName, LastName, age) VALUES (?, ?, ?)";
			
			//creates a prepared statement to run our query through our connection
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			//sets each value to its corresponding question mark
			pstmt.setString(1, newStudent.firstName);
			pstmt.setString(2, newStudent.lastName);
			//setting to int since age is integer
			pstmt.setInt(3, newStudent.age);
			
			//.execute() is used for non-select queries where a return is not expected: update, insert, delete
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
