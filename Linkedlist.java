package col.in;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>sob=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("No of names to be added");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" names");
		for(int i=0;i<n;i++) {
			String name=sc.next();
			sob.add(name);
		}

System.out.println(sob);
		System.out.println("Enter the name to search");
		String sname=sc.next();
		//System.out.println(sob.contains(sname)); //it it present returns true 
       
		if(sob.contains(sname)) {
			System.out.println(sname +" is presesnt");
		}
		else {
			System.out.println(sname +" not presesnt");
		}
		
		System.out.println("Enter name to be removed");
		String rn=sc.next();
		sob.remove(rn);
		System.out.println("After removing LinkedList is "+sob);
		
		List<String> slist=new LinkedList<String>();
		slist.add("Poovi");
		slist.add("Spoorthi");
		
		sob.addAll(slist);
		System.out.println("After adding Linkedlist is "+sob);
		
		sob.clear();
		System.out.println("After clear method "+sob);
		
		
	}

}


	


