package collections;

import java.util.ArrayList;

public class arraylist5Java {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Lion");
		a1.add("Cow");
		a1.add("Tiger");
		a1.add("Horse");
		ArrayList a2 = new ArrayList();
		a2.add("Mango");
		a2.add("apple");
		a2.add("Banana");
		a2.add("Orange");
		a2.addAll(4, a1);
		//a2.removeAll(a1);
		//System.out.println(a2);
		
		//retainAll will preserve common elements >>> a2 has all the values but a1 values are common so we get a1 values as o/p
		a2.retainAll(a1);
		System.out.println(a2);
	}

}
