import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		//create an instance of the DAO so that we may call its method
		StudentDAO student = new StudentDAO();
		
		//System.out.println(student.getAllStudents()); <- this will print out using the tostring
		
		//created an empty array list that will store all our students from our getAllStudents method
		ArrayList<StudentModel> students = student.getAllStudents();
		//i is set to one row in our table
		for (StudentModel i: students) {
			//prints out on each line because println prints on a new line each time
			System.out.println(i);
		}
		//have to add in all the values to insert a new row (took a couple tries because PK was already in use)
		//student.addStudent(new StudentModel(0, "Nick", "Fryer", 25));
		
		
	}

}
