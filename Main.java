
public class Main {

	public static void main(String[] args) {
		 
		String[] courses = {"C# Angular", "Java React"};
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("iremelveren");
		user1.setEmail("iremmelverenn@gmail.com");
		user1.setTelephoneNumber("5314527889");
		
		User user2 = new User();
		user2.setName("engin demiroğ");
		user2.setId(55);
		
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.remove(user1);
		userManager.update(user2);
		
		
		
		Student student1 = new Student();
		student1.setCourseId(35);
		student1.setName("irem elveren");
		student1.setCourseName("C# Angular");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCourse(student1);
		studentManager.add(user1);
		studentManager.deleteCourse(student1);
		
			
		
		
		Instructor instructor = new Instructor();
		instructor.setInstructorId(55);
		instructor.setName("engin demiroğ");
		instructor.setCourseName("Java React");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.add(user2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
