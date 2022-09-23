package edu.in;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter" +ar.length+ "Element");
		for(int i= 0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println(" Array element are:");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
        System.out.println("Using enhanced for loop using array:");
        for(int i:ar)
        {
        	System.out.println(i);
        }
        	
	}

}
