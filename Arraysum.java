package edu.in;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ar[]=new int[5];
		   int sum=0;
		   Scanner sc=new Scanner(System.in);
		   //input the array elements
		   System.out.println("Enter the "+ar.length+" elements");
	        for(int i=0;i<ar.length;i++) {
	        	ar[i]=sc.nextInt();
	        }
	        
	        //display
	        System.out.println("Array elements are");
	        for(int i:ar) {
	        	System.out.println(i);
	        }
	        
	        //sumof all array elements
	        for(int i=0;i<ar.length;i++) {
	        	sum=sum+ar[i];
		    }
	        System.out.println("Total of all array elements="+sum);
	        //or
	        /*for(int i:ar) {
	        	sum=sum+i;
	        }*/



	}

}
