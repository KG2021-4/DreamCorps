import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
	  List<Integer> l = new LinkedList<>();
	  List<Integer> l2 = new LinkedList<>();
       l.add(1);
       l.add(2);
       l.add(3);
       l.add(4);
       l.add(5);
       System.out.println(l);
       int size = l.size()-1;
   
       for(int i =size; i>=0; i--) {
    	   
    	   l.add(l.get(i));
    	 
    	   
       }
      
}
}