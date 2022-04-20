
public class StudentModel {
	
	//these correspond to columns in our database
	public int id, age;
	public String firstName, lastName;
	
	//default constructor
	public StudentModel() {
		
	}
	
	//this is a constructor that maps the database values to the variables in our code
	public StudentModel(int id, String FirstName, String LastName, int age) {
		//this.variableName = logical databaseColumnName;
		//regular or right side variable is SQL variable name
		this.id = id;
		firstName = FirstName;
		lastName = LastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
