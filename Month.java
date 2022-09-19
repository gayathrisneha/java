package edu.in;
import java.util.Scanner;
public class Month {
      public static void main(String[] args) {
	    String c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month of year:");
		c = sc.next();
		   switch(c) {
		       case "January": System.out.println("First month of the year");
		                     break;
		       case "February": System.out.println("Second month of the year");
		                     break;
		       case "March": System.out.println("Third month of the year");
		                     break;
		       case "April": System.out.println("Fourth month of the year");
		                     break;
		       case "May": System.out.println("Fifth month of the year");
		                     break;
		       case "June": System.out.println("Sixth month of the year");
		                      break;
		       case "July": System.out.println("Seventh month of the year");
		                      break;
		       case "August": System.out.println("Eighth month of the year");
                              break;
		       case "September": System.out.println("ninth month of the year");
                              break; 
               case "October": System.out.println("Tenth month of the year");
                              break;
               case "November": System.out.println("Eleventh month of the year");
                              break;
               case "December": System.out.println("Twelth month of year");
                              break;
		       default: System.out.println("Inalid input");
		       
		      }

      }

}


