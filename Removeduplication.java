package col.in;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
public class Removeduplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(23);
		a1.add(45);
		a1.add(67);
		a1.add(56);
		a1.add(23);
		System.out.println(a1);
		Iterator<Integer> iter = a1.iterator();
		System.out.println("element in set:");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Set<Integer>ob1 = new TreeSet<Integer>(a1);
		a1.add(23);
		a1.add(45);
		a1.add(67);
		a1.add(56);
		a1.add(23);
		System.out.println(ob1);
}
}
