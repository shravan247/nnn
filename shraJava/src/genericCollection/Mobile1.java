package genericCollection;

import java.util.Vector;

public class Mobile1 {
	public static void main(String[] args) {
		Vector<Mobile> v = new Vector();
		v.add(new Mobile("samsung"));
		v.add(new Mobile("nokia"));
		System.out.println(v);
		
	}
}
