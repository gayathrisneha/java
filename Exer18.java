package exercise.in;

class Parent{
int a = 10;
public int b = 20; 
protected int c = 30; 
private int d = 40;

void showData() {
System.out.println("Inside ParentClass"); 
System.out.println("a = " + a);
System.out.println("b = " + b); 
System.out.println("c = " + c); 
System.out.println("d = " + d);
   }
}
class ChildClass extends Parent{ void accessData() {
System.out.println("Inside ChildClass");
System.out.println("a = " + a);
System.out.println("b = " + b); 
System.out.println("c = " + c);
//System.out.println("d = " + d); // private member can't be accessed
}

}
public class Exer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass(); 
		obj.showData(); 
		obj.accessData();

	}

}
