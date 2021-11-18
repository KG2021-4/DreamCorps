
public class Q1 {

	public static void main(String[] args) {
		magic(9, 2, 0);

	}
	public static void magic(int x, int y, int z){
	     
		   if(x % 2 == 0) {
		      double a = x / y;
		      System.out.println("zoo = "+ a);
		   }  else {
		      double a = x / (double)z;
		      System.out.println("farm = "+ a);
		   }
		}





}
