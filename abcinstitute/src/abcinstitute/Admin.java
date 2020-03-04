package abcinstitute;

import java.util.Scanner;

public class Admin extends Courses
{
	Scanner scan=new Scanner(System.in);
	//private int admin_id;
	//private int admin_password;
	
	void setcourse()
	{
		System.out.println("Enter the course name");
		String course_name=scan.nextLine();
		setCourse_name(course_name);
		
		System.out.println("Enter the course id");
		int course_id=scan.nextInt();
		setCourse_id(course_id);
		
		System.out.println("Enter the course fees");
		int course_fees=scan.nextInt();
		setCourse_fees(course_fees);
		
	}
	
	void provide_course()
	{
		System.out.println(getCourse_name());
		System.out.println(getCourse_id());
		System.out.println(getCourse_fees());
	}
	void getStudentDetail(Student student)
	{
		student.showDetails();
	}
	

}
