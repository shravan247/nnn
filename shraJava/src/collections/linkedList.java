package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('e');
		l.add('f');
		for(int i=0; i<l.size()-3; i++) {
			System.out.println(l.get(i));
		}
		ListIterator l1 = l.listIterator(3);
		while(l1.hasNext()) {
		System.out.println(l1.next());
		}
	}

}
