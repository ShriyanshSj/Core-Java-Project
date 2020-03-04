package abcinstitute;

public class Abc {

	public static void main(String[] args) {
		
		System.out.println("\t\tWelcome To Abc Institute");
		System.out.println();
		Student student=new Student();
		System.out.println("----------------------------------------------------------------");
		Admin admin=new Admin();
		admin.setcourse();
		System.out.println("----------------------------------------------------------------");
		admin.provide_course();
		System.out.println("----------------------------------------------------------------");
		admin.getStudentDetail(student);
	}

}
