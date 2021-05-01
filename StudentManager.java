
public class StudentManager extends UserManager {

	  // Override
        public void add (User user) {
		
		System.out.println("Student added! " + user.getName() + " " + user.getId());
	    }
	
        
        public void remove (User user) {
		
		System.out.println("Student removed! " + user.getName() + " " + user.getId());
	    }
    
        
        public void update (User user) {
		
		System.out.println("Student updated! " + user.getName() + " " + user.getId());
	    }
    
    
		public void addCourse(Student student) {
		
		System.out.println("Course added! " + student.getName() + " " + student.getCourseName());
	    }
	
		
        public void deleteCourse(Student student) {
		
		System.out.println("Course deleted! " + student.getName() + " " + student.getCourseName());
	    }
    
    
    
    
    
    
    
}


