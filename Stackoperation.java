package col.in;
import java.util.Iterator;
import java.util.Stack;

public class Stackoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Stack<Integer> sob=new Stack<Integer>();
		   sob.push(34);
		   sob.push(98);
		   sob.push(56);
		   sob.push(12);
		   //LIFO
		   System.out.println(sob);
		   System.out.println("stack pop operation "+sob.pop());
		   //Iterator
		   Iterator<Integer>itstack=sob.iterator();
		   while(itstack.hasNext()) {
			   System.out.println(itstack.next());
		   }
		   
		}
	}


