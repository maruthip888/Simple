package myprogram;

import java.util.Scanner;

public class program06 {
	//to know the company name and employee details
	static void information()
	{
		Scanner inform=new Scanner(System.in);
		String company=inform.nextLine();
		String employeeName=inform.nextLine();
		int age=inform.nextInt();
		double salary=inform.nextDouble();
	    System.out.println("The Name of the Company is "+company);
	    System.out.println("The Name of the employee "+employeeName+" in the  Company name is "+company); 
	    System.out.println("The age of the "+employeeName+" is "+age);
	    System.out.println("The salary of the employee is "+salary);
	    
	}
	public static void main(String[] args) {
		information();// TODO Auto-generated method stub

	}

}
