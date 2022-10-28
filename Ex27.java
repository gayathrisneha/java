package exercise.in;
interface C
{
  public void print_C();
}

interface Z
{
  public void print_Z();
}

interface R extends C, Z
{
  public void print_R();
}

class child implements R
{
	public void print_C() {


System.out.println("Cooking");
}
public void print_Z()
  {
   System.out.println("Emerging Technology");
  }
public void print_R()
{
System.out.println("IoT");
}

}


public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child d = new child();
		d.print_C();
		d.print_Z(); 
		d.print_R();



	}

}
