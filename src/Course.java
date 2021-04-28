import java.util.Date;

public class Course {
int id;
String courseName;
String courseDetail;
Date date;



public Course(int id,String courseName,String courseDetail) {
	
	this.id=id;
	this.courseName=courseName;
	this.courseDetail=courseDetail;
	
	}
public Course(int id,String courseName) {
	this.id=id;
	this.courseName=courseName;
	Date date =new Date();
	this.date=date;
	
	
}


}
