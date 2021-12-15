package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
public static void main(String [] args) {
	List<String> colors = new ArrayList<String>(); 
	colors.add("blue");
	colors.add("purple");
	System.out.println(colors);
	System.out.println(colors.set(5, "green"));
	System.out.println(colors);
	
	
}
}
