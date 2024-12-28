package collections;

import java.util.ArrayList;

public class arraylist2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add("hii");
	System.out.println(a1);
	
	ArrayList a2=new ArrayList();
	a2.add('A');
	a2.add(true);
	//we can insert based on index
	a2.add(1, 'S');
	//in addAll(we have to mention the current reference size > 2)
	a2.addAll(2, a1);
	System.out.println(a2);
}
}
