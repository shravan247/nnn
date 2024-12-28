package genericCollection;

import java.util.Collections;
import java.util.Vector;

public class Mobile4 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Mobile2("zylo"));
		v.add(new Mobile2("vivo"));
		v.add(new Mobile2("apple"));
		v.add(new Mobile2("lava"));
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
	}

}
