package exercise.in;
class sum
{
public void print_sum()
{
System.out.println("Cooking");
}
}

class pro extends sum
{
public void print_pro()
{
System.out.println("Emerging Technology");
}
}

class duc extends sum
{
public void print_PQR()
{
System.out.println("IoT");
}
}

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duc d = new duc();
		d.print_sum(); 
		pro f = new pro();
		f.print_pro();


	}

}
