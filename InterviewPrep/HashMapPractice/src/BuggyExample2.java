import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuggyExample2 {

  public static Map<String,ArrayList<Integer>> employees = new HashMap<>();

  public static void main(String[] args) {
  
  employeeID("Kore", new ArrayList<Integer>());
  
  employees.get("Kore").add(123456678);
  employees.get("Kore").add(3);
      
 

  employeeID("Hades", new ArrayList<Integer>());
  employees.get("Hades").add(331002651);
  employees.get("Hades").add(100);

  employeeID("Hera", new ArrayList<Integer>());
  employees.get("Hera").add(1439323776);
  employees.get("Hera").add(99);

  employeeID("Apollo", new ArrayList<Integer>());
  employees.get("Apollo").add(1380004385);
  employees.get("Apollo").add(1);
  System.out.println(employees);
  Collection<ArrayList<Integer>> l = employees.values();
  for(ArrayList<Integer> in : l ) {
	  sorter(in);
	  
  }
  sorter( employees.get("Apollo"));
  System.out.println(employees);
  Collections.sort(employees.get("Apollo"));
  System.out.println(employees);
  }
 

  private static void employeeID(String name, ArrayList<Integer> id) {
	  
	    employees.put(name, id);
	    
	   
	  }
  private static void sorter(ArrayList<Integer> array) {
	  int temp =0;
	  for(int i =0; i<array.size(); i++) {
		  for(int j = i+1 ; j<array.size(); j++) {
			  int v1 =array.get(i);
			  if(array.get(i) > array.get(j)) {
				  int v2 =array.get(j);
				  temp =array.get(i);
				  v1 = array.get(j);
				  v2 =temp;
			  }
		  }
	  }
  }

	}


