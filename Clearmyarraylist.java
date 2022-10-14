package arraylistincollect.edu;
import java.util.ArrayList;
public class Clearmyarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		System.out.println("Actual list:"+arr1);
		arr1.clear();
		System.out.println("After clear ArrayList:"+arr1);

	}

}
