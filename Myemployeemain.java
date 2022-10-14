package col.in;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Empl{
	int eid;
	String ename;
	int eage;
	float esalary;
	
public Empl() {
		super();
		
	}

	void inputEmpl() {
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
class SortEmpSalary implements Comparator<Empl>{

	@Override
	public int compare(Empl e1, Empl e2) {
		if(e1.eid==e2.eid)
		     return 0;
		else if(e1.eid<e2.eid)
			return -1;
		else 
			return 1;
					
	}
	
}
public class Myemployeemain {
	public static void main(String[] args) {
	Empl e1=new Empl();
	Empl e2=new Empl();
	Empl e3=new Empl();
	Empl e4=new Empl();
	
	e1.inputEmpl();
	e2.inputEmpl();
	e3.inputEmpl();
	e4.inputEmpl();
	
	ArrayList<Empl>lemp=new ArrayList<Empl>();//LinkedList or Vector
	lemp.add(e1);
	lemp.add(e2);
	lemp.add(e3);
	lemp.add(e4);
	
	//Display Employee
	Iterator<Empl> eit=lemp.iterator();
	
	System.out.println("Employee Details");
	System.out.println("___________________________________________________");
	System.out.println("ID\tName\tAge\tSalary");
	while(eit.hasNext()) {
		Empl empobj=eit.next();
		System.out.println(empobj.eid+"\t"+empobj.ename+"\t"+empobj.eage+"\t"+empobj.esalary);
	}
	
	//Sort Employee data
	SortEmpSalary esort=new SortEmpSalary();
	Collections.sort(lemp,esort);
	System.out.println("After Sorting Employee Based on Salary");
	//Display Employee
			Iterator<Empl> eit1=lemp.iterator();
			
			System.out.println("Employee Details");
			System.out.println("___________________________________________________");
			System.out.println("ID\tName\tAge\tSalary");
			while(eit1.hasNext()) {
				Empl empobj1=eit1.next();
				System.out.println(empobj1.eid+"\t"+empobj1.ename+"\t"+empobj1.eage+"\t"+empobj1.esalary);
			}
			
			//Sort based on age, based on id, and based name
}
}




