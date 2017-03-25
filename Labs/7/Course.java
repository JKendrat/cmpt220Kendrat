
public class Course {
    //John Kendrat CMPT 220
	private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    //Creates a course name for the list
    public Course(String courseName){
    	this.courseName = courseName;
    }
    //Adds a student to the list
    public void addStudent(String student){
    	students[numberOfStudents] = student;
    	numberOfStudents++;
    }
    //Gets the list of students
    public String[] getStudents(){
    	return students;
    }
    //Gets the total number of students
    public int getNumberOfStudents(){
    	return numberOfStudents;
    }
    //Gets the course name of the course
    public String getCourseName(){
    	return courseName;
    }
    //Creates a new array 
    public String[] createNewArray(String[] newList){
    	for(int i = 0; i < students.length; i++){
    		students[i] = newList[i];
    	}
    	return newList;
    }
    //Drops a student from the list
    public void dropStudent(String student){ // JA: You have to find the student to drop
    	students[numberOfStudents] = null;
    	numberOfStudents--;
    }
    
    public void clear(){
    	for(int i = 0; i < students.length; i++){
    		students[i] = null;
    	}
    }
}
