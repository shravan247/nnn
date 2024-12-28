package genericCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class sort {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		//<Integer> is not mandatory
		v.add(1);
		v.add(5);
		v.add(3);
		v.add(7);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
	}
}
