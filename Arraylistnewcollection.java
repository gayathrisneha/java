package arraylistincollect.edu;
import java.util.ArrayList;
import java.util.List;
public class Arraylistnewcollection {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		System.out.println("Actual Arraylist:"+arr1);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		arr1.addAll(list);
		System.out.println("After Copy:"+arr1);
		// TODO Auto-generated method stub

	}

}
