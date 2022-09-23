package edu.in;

import java.util.Scanner;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element:");
		for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        b=a;
      
        System.out.println(" A element");
		for(int i=0;i<a.length;i++) 
			 System.out.println(a[i]+"");
		
        	
		System.out.println("B element");
			for(int i=0;i<b.length;i++) 
				 System.out.println(b[i]+"");
	        	
			
	}
}
		


