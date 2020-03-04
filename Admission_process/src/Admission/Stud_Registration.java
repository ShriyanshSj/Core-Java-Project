package Admission;

import java.util.*;
import java.util.Scanner;

public class Stud_Registration {
	
	private String Student_Name;
	private int Student_age;
	private String Branch_Name;
	private long Student_mobile;
	
	Scanner scan=new Scanner(System.in);
	
	Stud_Registration()
	{
	
		System.out.println("\t\tEnter the Student Details");
		System.out.println("Enter student name:");
		String Student_Name=scan.nextLine();
		setStudent_Name(Student_Name);
	
		boolean age_check = true;
		while(age_check) {
			try {
				System.out.println("Enter the Student Age:");
				Student_age=scan.nextInt();
				setStudent_age(Student_age);
				age_check = false;
				}
				catch(InputMismatchException ime)
				{
					scan.nextLine();
					System.out.println("Enter the valid age");
				}
		}
		boolean mobile_check = true;
		while(mobile_check)
		{
		try
		{
		System.out.println("Enter the Student Mobile Number:");
		Student_mobile=scan.nextLong();
		setStudent_mobile(Student_mobile);
		mobile_check=false;
		}
		catch(Exception e)
		{
			scan.nextLine();
			System.out.println("Enter the valid mobile number");
		}
		}
		System.out.println("Choose the Student branch:");
		Branches br=new Branches();
		br.showCourses();
		scan.nextLine();
		String Branch=scan.nextLine();
		
		br.choosebranch(Branch);
		System.out.println();
		setBranch_Name(Branch);
				
		}
	public void getStudentDetails()
	{
		System.out.println("Student name          :"+getStudent_Name());
		System.out.println("Student age           :"+getStudent_age());
		System.out.println("Student mobile number :"+getStudent_mobile());
		System.out.println("Student branch        :"+getBranch_Name());
	
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getStudent_age() {
		return Student_age;
	}
	public void setStudent_age(int student_age) {
		Student_age = student_age;
	}
	public String getBranch_Name() {
		return Branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;		
	}
	public long getStudent_mobile() {
		return Student_mobile;
	}
	public void setStudent_mobile(long student_mobile) {
		Student_mobile = student_mobile;
	}	
}