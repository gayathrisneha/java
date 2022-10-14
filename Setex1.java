package set.in;
import java.util.HashSet; 
import java.util.LinkedHashSet; 
import java.util.Set; 
public class Setex1 {

	public static void main(String args[]) {

		   Set<String> s = new HashSet<String>(); 
		   int size = s.size(); 
		System.out.println("Size before adding elements: " +size); 
     	s.add("Orange"); 
		s.add("Red"); 
		s.add("Blue"); 
		s.add("Yellow"); 
		s.add("Green"); 

	
		s.add("Red"); 
		s.add("Blue"); 
		System.out.println("Unordered Set Elements"); 
		System.out.println(s); 

		
		   if(s.equals("Black"))
		   { 
		System.out.println("Black element is not present in set."); 
		   } 
		  else 
		  { 
		s.add("Black"); 
		System.out.println("Black is added successfully."); 
		System.out.println("Set Elements after adding black element"); 
		System.out.println(s); 
		   } 

		   Set<String> s2 = new LinkedHashSet<String>(); 
		    s2.add("White"); 
		    s2.add("Brown"); 
		    s2.add("Red"); // Duplicate element. 

		
		s.addAll(s2); 
		System.out.println("Set Elements after adding elements from given collection"); 
		System.out.println(s); 
		 } 
		}

		

	


