package edu.in;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String name;
		int age;
		float salary;
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name");
		name=sc.nextLine();
		System.out.println("Enter  Employee age");
		age=sc.nextInt();
		System.out.println("Enter code");
		code=sc.nextInt();				
		System.out.println("Enter salary");
		salary=sc.nextFloat();
		
		System.out.println("Student details");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		System.out.println("Code="+code);
        
	

  }

}
