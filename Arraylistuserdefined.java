package col.in;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	 int sid;
	 String sname;
     float fees;
	public Student(int sid, String sname, float fees) { //constructor with arg (generate)
		//to generate const, rightclick->source->generate const with arg
		super(); //Object class
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	@Override  //generate automaically //to generate toString, rightclick->source->generate toString
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}
}

public class Arraylistuserdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Devika", 3456.7f); 
		Student s2=new Student(2, "Shiva", 3456.6f);
		Student s3=new Student(3,"Mohit",9876.5f);
		Student s4=new Student(4,"Pavi",8765.2f);
		
		//Syntax
		//ArrayList<ClassName> objname=new ArrayList<ClassName>();
		ArrayList<Student> sobj=new ArrayList<Student>();
		sobj.add(s1);
		sobj.add(s2);
		sobj.add(s3);
		sobj.add(s4);
		System.out.println(sobj); //call toString
		
		//Using iterator
		Iterator<Student>sitor=sobj.iterator();
		
		System.out.println("ID\tNAME\tFEES"); 
		
		while(sitor.hasNext()) { //returns object of student
			Student st1=sitor.next();
			System.out.println(st1.sid+"\t"+st1.sname+"\t"+st1.fees);
		}
		
	}

}
