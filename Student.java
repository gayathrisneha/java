package edu.in;
import java.util.Scanner;

 class Stu 
{

	 
		// TODO Auto-generated method stub
		String name;
		int age;
		float fees;
		String email;
		int eng,maths,science,social;
		float total,average;
		
		void snt() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter fees");
			fees =sc.nextFloat();
			System.out.println("Enter email");
			email=sc.next();
		}
		void inputMarks() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Marks: English, science,Maths, SocialScience");
			eng=sc.nextInt();
			maths=sc.nextInt();
			science=sc.nextInt();
			social=sc.nextInt();
			
		}
		void calculateTotalAverageMarks() {
			total=eng+maths+science+social;
			average=total/4;
		}
		void displayTotalAvg() {
			System.out.println("Total Marks="+total);
			System.out.println("Average marks="+average);
		}
		
		void display()
		{
			System.out.println("name"+name);
			System.out.println("age"+age);
			System.out.println("fees"+fees);
			System.out.println("email"+email);
		}
}	
public class Student {

	public static void main(String[] args) {
		Stu s1=new Stu();
		s1.snt();
		s1.display();
		s1.inputMarks();
		s1.calculateTotalAverageMarks();
		s1.displayTotalAvg();
		


	}

}
