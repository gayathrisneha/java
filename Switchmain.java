package edu.in;

import java.util.Scanner;

public class Switchmain {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 5:");
		n = sc.nextInt();
		       switch(n) {
		       case 1: System.out.println("One");
		                break;
		       case 2: System.out.println("Two");
		               break;
		       case 3: System.out.println("Three");
		                break;
		       case 4: System.out.println("Four");
		                break;
		       case 5: System.out.println("Five");
		                break;
		       default: System.out.println("Inalid input");
		       
		      


	}

}
}
