package edu.in;
import java.util.Scanner;
public class Maxelement {

	public static void main(String[] args) {
		int ar[] = new int[5];
		int max;
		int min;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the "+ar.length+" elements");
	        for(int i=0;i<ar.length;i++) {
	        	ar[i]=sc.nextInt();
	        }
	        max=ar[0];
	        for(int i=0;i<ar.length;i++)
	        {
	        	if(ar[i]>max) {
	        		max=ar[i];
	  
	        	}
	        }	
	        	System.out.println("Maximum number"+max);
	        

	        	  min=ar[0];
	  	        for(int i=0;i<ar.length;i++)
	  	        {
	  	        	if(ar[i]<min) {
	  	        		min=ar[i];
	  	  
	  	        	}
	  	        }	
	  	        	System.out.println("Minimum number"+min);
	  	        

	}

}
