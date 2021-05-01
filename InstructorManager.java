
public class InstructorManager extends UserManager {

	//Override
    public void add (User user) {
		
		System.out.println("Instructor added! " + user.getName() + " " + user.getId());
	}
	
    public void remove (User user) {
		
		System.out.println("Instructor removed! " + user.getName() + " " + user.getId());
	}
    
    public void update (User user) {
		
		System.out.println("Instructor updated! " + user.getName() + " " + user.getId());
	}
	
    public void addCourse(Instructor instructor) {
		
		System.out.println("Course added! " + instructor.getInstructorId() + " " + instructor.getCourseName());
	    }
	
    public void deleteCourse(Instructor instructor) {
		
		System.out.println("Course deleted! " + instructor.getInstructorId() + " " + instructor.getCourseName());
	    }
	
	
}
