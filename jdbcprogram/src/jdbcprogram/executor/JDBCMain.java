package jdbcprogram.executor;

import jdbcprogram.services.CurdOperations;

public class JDBCMain {

	public static void main(String[] args) {
		//CurdOperations.addStudent(101, "Seetha");
		//CurdOperations.addStudent(102, "Geetha");
		//CurdOperations.addStudent(103, "Ramu");
		
		  // Update record
        CurdOperations.updateStudent(102, "Geetha Reddy");

        // Delete record
        CurdOperations.deleteStudent(103);

        // Display all records
        CurdOperations.displayStudents();

	}

}