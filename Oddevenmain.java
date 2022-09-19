package edu.in;

import java.util.Scanner;

public class Oddevenmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n1 = sc.nextInt();
	   
	    
	    
	    switch(n1%2)
	    {
	    case 0:
	        System.out.println(n1+"is even number");
	        break;
	    case 1:
	    	System.out.println(n1+"is odd number");
	    	break;
	    default:
	    	System.out.println("Invalid input");
	    }
	    

	}

}
