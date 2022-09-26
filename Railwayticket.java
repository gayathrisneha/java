package edu.in;
import java.util.Scanner;
class rail{
	String name ;
	String coach ;
	long mobno ;
	int amt;
	int totalamt;
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the coach:");
		coach = sc.next();
		System.out.println("Enter the mobno:");
		mobno = sc.nextLong();
		System.out.println("Enter the amt:");
		amt = sc.nextInt();
	}
	
	
	void update() {
		if(coach.equals("First_AC")){
	     totalamt=amt+700;
		}
		else if(coach.equals("Second_AC")){
		     totalamt=amt+500;
			}
		else if(coach.equals("Third_AC")){
		     totalamt=amt+250;
			}
		else {
			totalamt = amt;
		}

	}
	
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Coach="+coach);
		System.out.println("Mobno="+mobno);
		System.out.println("Total Amount:"+totalamt);
	}
	
	
}
public class Railwayticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rail bob = new rail();
		bob.accept();
		bob.update();
		bob.display();

	}

}
