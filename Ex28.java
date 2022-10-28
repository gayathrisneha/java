package exercise.in;
interface A
{
public void A();
}
interface B extends A
{
public void B();
}
interface D extends A
{
public void D();
}

public class Ex28 implements B, D{

public void A()
{
System.out.println("Inside A");
}
public void B()
{
System.out.println("Inside B");
}
public void D()
{
System.out.println("Inside D");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Ex28 obj1= new Ex28();
	obj1.A();
	obj1.B();
	obj1.D();

	}

}
