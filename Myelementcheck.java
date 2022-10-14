package arraylistincollect.edu;
import java.util.ArrayList;
import java.util.List;
public class Myelementcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		List<String> list = new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does ArrayList contains all list elements?:"+arr1.containsAll(list));
		list.add("one");
		System.out.println("Does ArrayList contains all list elements?:"+arr1.containsAll(list));
		

	}

}
