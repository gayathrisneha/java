package exercise.in;
class BC
{
   public void print_BC()
   {
     System.out.println("Cooking");
   }
}

class YZ extends BC
{
    public void print_YZ()
    {
     System.out.println("Emerging Technology");
    }
}

class PQR extends YZ
{
    public void print_PQR()
    {
     System.out.println("IoT");
    }
}

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PQR d = new PQR();
		d.print_BC(); 
		d.print_YZ(); 
		d.print_PQR();
 }

}
