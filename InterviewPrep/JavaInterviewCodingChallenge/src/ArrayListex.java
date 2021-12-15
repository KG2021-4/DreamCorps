import java.util.ArrayList;

public class ArrayListex {

	public static void main(String[] args) {
		//string array list contains duplicate strings and they want you to return a new arrayList without the duplicate strings.
		ArrayList<String> list = new ArrayList<String>();
		list.add("Khalid");
		list.add("Mohamed");
		list.add("Khalid");
		list.add("Elroy");
		list.add("Mohamed");
	
		//Nested for loop to search
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i =0; i<list.size(); i++) {
			for(int j = i +1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					list.remove(i);
					
				}
			}
		}
	     System.out.println(list);


	}

}
