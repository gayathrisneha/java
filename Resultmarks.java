package edu.in;

import java.util.Scanner;

public class Resultmarks {

	public static void main(String[] args) {
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark");
		mark = sc.nextInt();
		if(mark>=90 && mark<=100) {
			System.out.println("Grade A");
		}
		else if(mark>=70&&mark<=89) {
		     System.out.println("Grade B");
		}
		else if(mark>=50&&mark<=69) {
		     System.out.println("Grade C");
		}
		else if(mark>=30&&mark<=49) {
		     System.out.println("Grade D");
		}
		else if (mark>=0&&mark<=29){
			 System.out.println("fail");
		}
		else
		{
			System.out.println("Invalid");
		}

}
}
