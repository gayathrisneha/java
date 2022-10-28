package edu.in;
class parentclass{
	int a=10;
	public int b=20;
	protected int c=30;
	private int d=40;
	
	void showData() {
		System.out.println("Inside parentClass");
		System.out.println("a ="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}
}

class Childclass extends parentclass{
void accessData() {
	System.out.println("Inside ChildClass");
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	//System.out.println("d="+d);
	
}
}
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj = new Childclass();
		obj.showData();
		obj.accessData();

	}

}
