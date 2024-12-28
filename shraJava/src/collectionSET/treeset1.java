package collectionSET;

import java.util.Collections;
import java.util.TreeSet;

public class treeset1 {
public static void main(String[] args) {
	int[] a= {2, 4, 3, 2, 6, 5, 3};
	TreeSet t=new TreeSet();
	for(int i=0; i<a.length; i++) {
		t.add(a[i]);
	}
	System.out.println(t);
	System.out.println(t.descendingSet());
	
}
}
