package stack.in;
import java.util.Iterator;  
import java.util.Stack;
public class Stackex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();  
		//pushing elements into stack  
		st.push("BMW");  
		st.push("Audi");  
		st.push("Ferrari");  
		st.push("Bugatti");  
		st.push("Jaguar");  
		//iteration over the stack  
		Iterator iterator = st.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.println(values);   
		}     
		}  
		} 

	


