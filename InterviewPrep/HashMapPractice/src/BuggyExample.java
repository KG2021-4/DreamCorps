


import java.util.HashMap;
import java.util.Map;

public class BuggyExample {

  public static Map<String,Integer> employees = new HashMap<>();

  public static void main(String[] args) {
    employeeID("Kore", 123456678);
    employeeID("Hades", 331002651);
    employeeID("Hera", 1439323776);
    employeeID("Apollo", 1380004385);
    System.out.println(employees);
  }

  private static void employeeID(String name, int id) {
  
    employees.put(name, id);
  }
}


