package exercise.in;
import java.util.ArrayList; 
public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); 
		list.add("FIRST");
		list.add("SECOND");
		list.add("THIRD");
		list.add("FOURTH");
		list.add("FIFTH");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Size of array" + list.size());
		}

}
