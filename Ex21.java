package exercise.in;

public class Ex21 {
	void sum(int a,double b)
	{
	   System.out.println(a+b);
	}
	void sum(double b,int a)
	{
	   System.out.println(a+b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex21 obj=new Ex21();
		obj.sum(50,50.0);
		obj.sum(50.0,50);


	}

}
