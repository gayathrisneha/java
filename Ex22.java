package exercise.in;
class Books{
	//defining a method
	void run()
	{
	System.out.println("Book not in stock");
	}
}

public class Ex22 extends Books {
	void run()
	{
	System.out.println("Book is available");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex22 obj = new Ex22(); //creating object 
		obj.run(); //calling method
		}
	}
