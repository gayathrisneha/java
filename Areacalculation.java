package edu.in;
import  java.util.Scanner;
class Area{
	 float area,length,breath,base,height,radius;
	 Scanner sc = new Scanner(System.in);
	 void areasquare()
	 {
		 System.out.println("Enter the length of square:");
	     length = sc.nextFloat();
	     area = length * length;
	     System.out.println("Area of square:"+area);
     }
	 void arearectangle()
	 {
		 System.out.println("Enter the length and breath of rectangle:");
	     length = sc.nextFloat();
	     breath = sc.nextFloat();
	     area = length * breath;
	     System.out.println("Area of rectangle:" +area);
		 
	 }
	 void areatriangle()
	 {
		 System.out.println("Enter the base and height of Triangle:");
		 base = sc.nextFloat();
		 height = sc.nextFloat();
		 area = (base * height)/2;
		 System.out.println("Area of triangle:"+area);
		 
	 }
	 void areacircle()
	 {
		 System.out.println("Enter the radius of Circle:");
	     radius = sc.nextFloat();
	     area = 3.14159f * radius* radius;
	     System.out.println("Area of circle:"+area);
 
	 }
} 
public class Areacalculation {

	public static void main(String[] args) {
		    int c;
		    Scanner sc = new Scanner(System.in);
		    Area a = new Area();
		    System.out.println("*****************MENU*******************");
		    System.out.println("1.Area of square");
		    System.out.println("2.Area of rectangle");
		    System.out.println("3.Area of triangle");
		    System.out.println("4.Area of circle");
		    System.out.println("Enter your choice:");
		    c = sc.nextInt();
		    
		    switch(c) {
		    
		    case 1: a.areasquare();
		    	 break;
		    	
		    case 2: a.arearectangle();
		    	 break;
                
		    case 3: a.areatriangle();
			     break;
			    
		    case 4: a.areacircle();
		    	 break;
		    	
			default :
				System.out.println("Invalid input");
		    }
		    
	}

}
