import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		int temp = 0;
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		System.out.println(l);

		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) > l.get(j)) {
					temp = l.get(i);

					l.set(i, l.get(j));
					System.out.println(l);
					l.set(j, temp);
					System.out.println(l);
				}

			}
		}
		System.out.println(l);
	}

}
