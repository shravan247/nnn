package collectionSET;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(1);
		h.add(5);
		h.add(3);
		h.add("apple");
		h.add(3); // duplicate value is not supported
		// h.add(1, 4); indexing is not supported
		System.out.println(h);
		// accessing
		for (Object o : h) {
			System.out.println(o);
		}
		// itrrator
		Iterator i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
