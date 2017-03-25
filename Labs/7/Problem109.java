
public class Problem109 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Course course = new Course("Software Development");
		
		course.addStudent("John Smith");
		course.addStudent("Tyler Robinson");
		course.addStudent("Margaret Mayland");
		course.dropStudent("John Smith");
		
		System.out.println(java.util.Arrays.toString(course.getStudents())); // JA

	}

}
