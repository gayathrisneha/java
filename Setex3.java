package set.in;
import java.util.HashSet; 
import java.util.Set; 

public class Setex3 {

	public static void main(String[] args) {
		
		Set<Character> s = new HashSet<Character>(); 
			s.add('D'); 
			s.add('F'); 
			s.add('H'); 
			s.add('P'); 
			s.add('K'); 
			s.add(null); 
			s.add(null); 
			System.out.println("Unordered Set Elements"); 
			System.out.println(s); 
			
			 
			boolean search = s.contains('A');  
			System.out.println("Is Element A present in set: " +search); 
			if(s.contains('K'))
			{ 
			System.out.println("K is present in set."); 
			 }
			else { 
			System.out.println("K is not present in set."); 
			 } 
			 int hashcode = s.hashCode(); 
			System.out.println("HashCode value: " +hashcode); 
			 } 
		}


	


