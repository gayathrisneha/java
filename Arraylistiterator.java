package arraylistincollect.edu;
import java.util.ArrayList;
import java.util.Iterator;
public class Arraylistiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		Iterator<String> itr = arr1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
