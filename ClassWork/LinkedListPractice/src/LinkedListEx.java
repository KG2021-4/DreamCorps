import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {
public static void main(String [] args) {
	String [] things = {"Appels", "noobs", "goat", "Hunr"};
	List<String> list1 = new LinkedList<>();
	for(String x : things) {
		list1.add(x);
	}
	String [] things2 = {"sasuage", "bacon", "harry potter" , "goats"};
	//Lists allow for duplicates
	List<String> list2 = new LinkedList<>();
	for(String x : things2) {
		list2.add(x);
	}
	list1.addAll(list2);
	list2 = null;
	printMe(list1);
	removeStuff(list1,2,5);
	printMe(list1);
	reverseMe(list1);

}
//Reverse a LinkedList
private static void reverseMe(List<String> list1) {
      ListIterator<String> bobby = list1.listIterator(list1.size());
      while(bobby.hasPrevious()) {
    	  System.out.printf("%s " , bobby.previous());
      }
      
	
}
// Remove from a List Range
private static void removeStuff(List<String> list1, int i, int j) {
	list1.subList(i, j).clear();
	
}
// Print List
private static void printMe(List<String> list1) {
	for(String b : list1) {
		System.out.printf("%s" , b);
		System.out.println();
	}
	
}
}
