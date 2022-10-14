package arraylistincollect.edu;
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayListShuffle {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Circ");
		list.add("play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		Collections.shuffle(list);
		System.out.println("Result after shuffle operation:");
		for(String str: list){
            System.out.println(str);
        }
         
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.println(str);
        }
	}
}
