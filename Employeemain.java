package col.in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	int eage;
	float esalary;
	
public Employee() {
		super();
	}

void inputEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details");
		System.out.println("Enter name");
		ename=sc.next();
		System.out.println("Enter Employee id");
		eid=sc.nextInt();
		System.out.println("Enter employee age");
		eage=sc.nextInt();
		System.out.println("Enter Employee salary");
		esalary=sc.nextFloat();
	}
}
public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		e1.inputEmployee();
		e2.inputEmployee();
		e3.inputEmployee();
		e4.inputEmployee();
		
		ArrayList<Employee>lemp=new ArrayList<Employee>();//LinkedList or Vector
		lemp.add(e1);
		lemp.add(e2);
		lemp.add(e3);
		lemp.add(e4);
		
		//Display Employee
		Iterator<Employee> eit=lemp.iterator();
		
		System.out.println("Employee Details");
		System.out.println("___________________________________________________");
		System.out.println("ID\tName\tAge\tSalary");
		while(eit.hasNext()) {
			Employee empobj=eit.next();
			System.out.println(empobj.eid+"\t"+empobj.ename+"\t"+empobj.eage+"\t"+empobj.esalary);
	}

}
}
