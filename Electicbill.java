package edu.in;
import java.util.Scanner;
class elec{
	String name; 	 
	int units;	 
	double bill	; 
	
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the units:");
		units = sc.nextInt();
	}
	
	
	void calculate() {
		if(units<=100) {
			bill= 2.00*units;
		}
		else if(units<=200) {
			bill = 3.00*units;
		}
		else if(units>=300) {
			bill = 5.00*units;
		}
	}
	
	
	void print() {
		System.out.println("Name = "+name);
		System.out.println("Units="+units);
		System.out.println("Bill="+bill);
	}
}
public class Electicbill {

	public static void main(String[] args) {
		elec bob = new elec();
		bob.accept();
		bob.calculate();
		bob.print();

		

	}

}
