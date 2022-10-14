package arraylistincollect.edu;
import java.util.ArrayList;
public class MyArrayListArray {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		System.out.println("Actual ArrayList:"+arr1);
		String[] strArr = new String[arr1.size()];
		arr1.toArray(strArr);
		System.out.println("Created Array Content:");
		for(String str:strArr) {
			System.out.println(str);
		}
	}
}
