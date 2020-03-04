package abcinstitute;

import java.util.Scanner;

public class Student {
	
	Scanner scan=new Scanner(System.in);
	
	private String student_name;
	private String student_college_name;
	private long student_mob;
	
	Student()
	{
		System.out.println("Enter student name:");
		String student_name=scan.nextLine();
		setStudent_name(student_name);
		
		System.out.println("Enter student college name:");
		String student_college_name=scan.nextLine();
		setStudent_college_name(student_college_name);
		
		System.out.println("Enter student mobile number:");
		long student_mob=scan.nextLong();
		setStudent_mob(student_mob);
		
	}
	private String getStudent_name() {
		return student_name;
	}
	private void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	private String getStudent_college_name() {
		return student_college_name;
	}
	private void setStudent_college_name(String student_college_name) {
		this.student_college_name = student_college_name;
	}
	private long getStudent_mob() {
		return student_mob;
	}
	private void setStudent_mob(long student_mob) {
		this.student_mob = student_mob;
	}
	
	void showDetails() {
		System.out.println(getStudent_name());
		System.out.println(getStudent_college_name());
		System.out.println(getStudent_mob());
	}

}