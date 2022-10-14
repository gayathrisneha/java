package arraylistincollect.edu;
import java.util.ArrayList;
import java.util.List;
public class Myarraylistsubrange {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		// TODO Auto-generated method stub
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		arr1.add("Click");
		System.out.println("Actual ArrayList:"+arr1);
		List<String>list = arr1.subList(2,4);
		System.out.println("Sub List:"+list);

	}

}
