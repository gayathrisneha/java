package edu.in;
import  java.util.Scanner;
public class Areacalculation {

	public static void main(String[] args) {
		    int c;
		    float area,length,breath,base,height,radius;
			System.out.println("*****************MENU*******************");
		    System.out.println("1.Area of square");
		    System.out.println("2.Area of rectangle");
		    System.out.println("3.Area of triangle");
		    System.out.println("4.Area of circle");
		    
            Scanner sc = new Scanner(System.in);
		    System.out.println("Enter your choice:");
		    c = sc.nextInt();
		    
		    switch(c) {
		    
		    case 1:
		    	System.out.println("Enter the length of square:");
		    	length = sc.nextFloat();
		    	area = length * length;
		    	System.out.println("Area of square:"+area);
		    	break;
		    	
		    case 2:
		    	System.out.println("Enter the length and breath of rectangle:");
		    	length = sc.nextFloat();
		    	breath = sc.nextFloat();
		    	area = length * breath;
		    	System.out.println("Area of rectangle:" +area);
                break;
                
		    case 3:
			    System.out.println("Enter the base and height of Triangle:");
			    base = sc.nextFloat();
			    height = sc.nextFloat();
			    area = (base * height)/2;
			    System.out.println("Area of triangle:"+area);
                break;
			    
		    case 4:
		    	System.out.println("Enter the radius of Circle:");
		    	radius = sc.nextFloat();
		    	area = 3.14159f * radius* radius;
		    	System.out.println("Area of circle:"+area);
		    	break;
		    	
			default :
				System.out.println("Invalid input");
		    }
		    
	}

}
