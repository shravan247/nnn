package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist8Iterator {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		 Iterator i = a1.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 i.remove();
		 System.out.println(a1);
	}
}
