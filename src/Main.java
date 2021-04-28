
public class Main {

	public static void main(String[] args) {

		CourseManager courseManager	=new CourseManager();
		
		Course course=new Course(1,"Java Programlama","2 ay sürecek java kampýdýr.");
		Course course2=new Course(2, "C# Programlama", "Nesne tabanlý programlama temellerini öðreniyoruz.");
		Course course3=new Course(3, "Phyton Programlama");
		
		Course[] courses= {course,course2};
		
		Instructor instructor=new Instructor(1,"Sabri Özbek", 21, "Uludað Üniversitesi-YBS");
		
		courseManager.addCourse(course,instructor);
		
		courseManager.addCourseWithDate(course3, instructor);
		
		courseManager.getAllCourses(courses);
		
	
	}

}
