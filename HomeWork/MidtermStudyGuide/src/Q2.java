
public class Q2 {
	public static void main(String[] args) {
		age(-5);
		

	}

	public static void age(int age) {
		if (age > 0 && age < 18) {
			System.out.println("Chillin");
		} else if (age >= 18 && age < 30) {
			System.out.println("Smooth Sailing");
		} else if (age >= 30 && age < 70) {
			System.out.println("Working Hard");
		} else if (age >= 70) {
			System.out.println("Silver and Gold");
		} else {
			System.out.println("Get Real");
		}
	}

}