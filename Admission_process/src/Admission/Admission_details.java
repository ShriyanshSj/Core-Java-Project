package Admission;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admission_details
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean entry_check=true;
		for(int i=1;i<=1;i++)
		{
			System.out.println("\t\tWelcome to Admission Cell");
			System.out.println("***********************************************************************************************");
			System.out.println("Press   1   for Student Registration");
			System.out.println("Press   0   for exit");	
			System.out.println("************************************************************************************************");
			while(entry_check)
				{
				try {
				
					int n=scan.nextInt();
			
		if(n==1)
				{
				Stud_Registration sr=new Stud_Registration();
				System.out.println("*******************************************************************************************");
				System.out.println();
				System.out.println();
				System.out.println("Following are "+sr.getStudent_Name()+"'s details");
				sr.getStudentDetails();
				System.out.println();
				System.out.println("do you want to continue");

				System.out.println("Press 1 for yes");
				System.out.println("Press 0 for no");

				int x=scan.nextInt();
				if(x==1)
				{
					i=0;
					System.out.println("Admission successful");
					System.out.println("*******************************************************************************************");
				}	
				}
				
				entry_check=false;
			}
				
			catch(InputMismatchException ime)
			{
				scan.nextLine();
				System.out.println("Enter the valid number");
			}
		
			
		}
	}
}}