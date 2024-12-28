package collections;

import java.util.ArrayList;

public class arraylist4 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Smith");
		a1.add("Jonny");
		ArrayList a2 = new ArrayList();
		a2.add("Abhi");
		a2.add("Gobhi");
		a2.addAll(1, a1);

		System.out.println(a2);

		// a2.remove("Smith");
		// System.out.println(a2);
		// a2.removeAll(a1);
		// System.out.println(a2);
		a2.retainAll(a1);
		System.out.println(a2);

	}
}