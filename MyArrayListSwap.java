package arraylistincollect.edu;
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayListSwap {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Circ");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Girl");
		Collections.swap(list,2,5);
		System.out.println("Results after swap operations:");
	    for(String str:list) {
	    	System.out.println(str);
	    	
	    }
}
}
