package edu.in;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
	char b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    b=sc.next().charAt(0);
    if(b=='A'||b=='a') {
    	System.out.println("vowel");
    }
    
   else if(b=='E' ||b=='e') {
    	System.out.println("vowel");
    }
   else if(b=='I'||b=='i') {
    	System.out.println("vowel");
    }
    else if(b=='O'||b=='o') {
    	System.out.println("vowel");
     }
    else if(b=='U'||b=='u') {
    			
    	System.out.println("vowel");
    }
    else {
    	System.out.println("consonent");
    }
    	

	}

}
