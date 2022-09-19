package edu.in;

import java.util.Scanner;

public class Arithmeticoperation {

	public static void main(String[] args) {
	    Float result;
		System.out.println("*****************MENU*******************");
	    System.out.println("1.Addition");
	    System.out.println("2.Subtraction");
	    System.out.println("3.Multiplication");
	    System.out.println("4.Division");
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the two number:");
	    float n1 = sc.nextFloat();
	    float n2 = sc.nextFloat();
	    
	    System.out.println("Enter your choice:");
	    int c = sc.nextInt();
	    
	    switch(c)
	    {
	      case 1 : result = n1+n2;
	      System.out.println("Sum of "+n1+" and "+n2+" is " +result );
	      break;
	      
	      case 2 : result = n1-n2;
	      System.out.println("Difference of  "+n1+"  and "+n2+"  is "+result );
	      break;
	      
	      case 3 : result = n1*n2;
	      System.out.println("Product of"+n1+ "and" +n2+ "is" +result );
	      break;
	      
	      case 4 : result = n1/n2;
	      System.out.println("Quotient of"+n1+ "and" +n2+ "is" +result );
	      break;
	      
	      default:
	    	  System.out.println("Invalid Input");
	      
	      	  
	    }
	    

	}

}
