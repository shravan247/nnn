package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class arraylist9ListIterator {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		ListIterator l = a1.listIterator(a1.size());
		
		//if we want to access the element in reverse order then we use a1.size() else the cursor will be pointing at the fisrt element
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}

}
