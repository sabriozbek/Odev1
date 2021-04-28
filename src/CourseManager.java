
public class CourseManager {

	
	public void addCourse(Course course,Instructor instructor) {
		
		System.out.println(course.courseName+" Kursu eklenmiştir.");
		System.out.println("Kurs Eğitmeni: "+instructor.insName+" \n");
		
	}
	public void addCourseWithDate(Course course ,Instructor instructor) {
		System.out.println(course.courseName+" Kursu eklenmiştir.");
		System.out.println("Kurs Eğitmeni: "+instructor.insName);
		System.out.println("Kurs Tarihi: "+course.date+"\n");
		
		
	}
	public void getAllCourses(Course[] courses) {
		System.out.println("Kurslar:");
		
		for (Course course : courses) {
			System.out.println(course.courseName+"\n"+course.courseDetail);
		}
	}
	
	
}
