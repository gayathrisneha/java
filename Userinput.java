package edu.in;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter integer value");
		int i= sc.nextInt();
		System.out.println(" Enter byte value");
		byte b=sc.nextByte();
		System.out.println("Enter short value");
		short s=sc.nextShort();
		System.out.println("Enter float value");
		float f=sc.nextFloat();
		System.out.println("Enter double value");
		double d=sc.nextDouble();
		System.out.println("Enter character value");
		char ch= sc.next().charAt(0);
	

		
	
		
		System.out.println("integer value="+i);
		System.out.println("short value="+s);
		System.out.println("byte value="+b);
		System.out.println("float value="+f);
		System.out.println("double d="+d);
		System.out.println("char value="+ch);
		


	}

}
