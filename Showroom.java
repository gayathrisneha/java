package edu.in;
import java.util.Scanner;
class show{
	String name;
	long mobno;
	double cost;
	double discount;
	double amount;
	

void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name:");
	name = sc.next();
	System.out.println("Enter the mobno:");
	mobno = sc.nextLong();
	System.out.println("Enter the cost:");
	cost = sc.nextDouble();
}

void calculate() {
	if(cost<=10000) {
		discount = (cost*5)/100;
		amount = cost-discount;
	}
	else if(cost>10000 && cost<=20000) {
		discount = (cost*10)/100;
		amount = cost-discount;
	}
	else if(cost>20000 && cost<=35000) {
		discount = (cost*15)/100;
		amount = cost-discount;
	}

	else if(cost>35000) {
		discount = (cost*20)/100;
		amount = cost-discount;
	}
	
}
void display() {
	System.out.println("Name = "+name);
	System.out.println("Mobno="+mobno);
	System.out.println("Amount to be paid after discount:"+amount);
	}
}


public class Showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show bob = new show();
		bob.input();
		bob.calculate();
		bob.display();

	}

}
