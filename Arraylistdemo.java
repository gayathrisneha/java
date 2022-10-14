package col.in;
import java.util.ArrayList;
public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resizable array
		ArrayList<Integer> lob=new ArrayList<Integer>();
		lob.add(34);
		lob.add(87);
		lob.add(56);
		lob.add(6);
		
		System.out.println(lob);
		//ArrayList iteration using enhanced for loop
				for(int i:lob) {
					System.out.println(i);
					
				}
				
				//declare one more ArrayList which takes float values
				ArrayList<Float> fob=new ArrayList<Float>();
				fob.add(76.7f);
				fob.add(65.4f);
				fob.add(98.7f);
				
				System.out.println(fob);
				
				//using for loop
				
				for(float i:fob) {
					System.out.println(i);
				}
				
				////declare one more ArrayList which takes String values
				ArrayList<String> ob=new ArrayList<>();
				ob.add("sneha");
				ob.add("computer");
				ob.add("engineer");
				
				System.out.println(ob);
              //using for loop
				
				for(String i:ob) {
					System.out.println(i);
				}
				
				 ////declare one more ArrayList which takes double values
				ArrayList<Double> fo=new ArrayList<>();
				fo.add(76.7d);
				fo.add(65.4d);
				fo.add(98.7d);
				
				System.out.println(fo);
				
				//using for loop
				
				for(double i:fo) {
					System.out.println(i);
				}
				
		   }
		 }

   