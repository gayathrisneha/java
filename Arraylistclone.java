package arraylistincollect.edu;
import java.util.ArrayList;
public class Arraylistclone {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second");
		arr1.add("Third");
		arr1.add("Random");
		System.out.println("Actual list:"+arr1);
		ArrayList<String> copy = (ArrayList<String>)arr1.clone();
		// TODO Auto-generated method stub
			System.out.println("Clone ArrayList:"+copy);

	}

}
