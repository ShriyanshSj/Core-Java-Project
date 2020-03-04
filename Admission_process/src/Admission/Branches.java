package Admission;

public class Branches {

	static int cs=10;
	static int me=15;
	static int ce=12;
	static int ec=6;
	static int bca=20;
	
	void showCourses() {
		System.out.println("Name of the branches            No.Of Seats");
		System.out.println("CS                               "+cs);
		System.out.println("ME                               "+me);
		System.out.println("CE                               "+ce);
		System.out.println("EC                               "+ec);
		System.out.println("BCA                              "+bca);
		System.out.println();
	}
	void choosebranch(String x)
	{
		if(x.equals("CS"))
		{
			--cs;
			System.out.println("You Have Choosen CS");
			System.out.println("Now Availabe seats are "+cs);
		}
		if
		(x.equals("ME"))
		{
			--me;
			System.out.println("You Have Choosen ME");
			System.out.println("Now Availabe seats are "+me);
		
		}
		if(x.equals("CE"))
		{
			--ce;
			System.out.println("You Have Choosen CE");
			System.out.println("Now Availabe seats are "+ce);
		}
		if(x.equals("EC"))
		{
			--ec;
			System.out.println("You Have Choosen EC");
			System.out.println("Now Availabe seats are "+ec);
		}
		if(x.equals("BCA"))
		{
			--bca;
			System.out.println("You Have Choosen BCA");
			System.out.println("Now Availabe seats are "+bca);
		}
	}

}
