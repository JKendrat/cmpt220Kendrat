import java.util.ArrayList;

// JA: drop students?
// JA: There si no class to test this
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    private int numberOfStudents;
    
    public Course(String courseName){
    	this.courseName = courseName;
    }
    
    public void addStudent(String student){
    	students.add(student);
    	
    }
    
    public ArrayList<String> getStudents(){
    	return students;
    }
    
    public int getNumberOfStudents(){
    	return numberOfStudents;
    }
    
    public String getCourseName(){
    	return courseName;
    }
    
}

