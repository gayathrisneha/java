package queue.in;
import java.util.ArrayDeque;
import java.util.Deque;
public class Dequeue {
    public static void main(String args[]) {
		// TODO Auto-generated method stub
    	Deque<Integer> deque = new ArrayDeque<Integer>();
    	deque.add(1);
    	deque.add(2);
    	deque.add(3);  
        System.out.println("Inserting three elements : ");  
        for (Integer integer : deque) {  
        System.out.println(integer);      
        }  	
          
        deque.pop();  
        System.out.println("After popping : ");  
        for (Integer integer : deque) {  
            System.out.println(integer);  
        }  
        deque.remove(3);  
        System.out.println("Removing the element 3 :"+deque);  
      }  
    }


