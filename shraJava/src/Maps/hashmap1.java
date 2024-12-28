package Maps;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(1, "Abhi");
		h.put(2, "Bhuvi");
		h.put(3, "Kavi");
		System.out.println(h);
		h.put(null, null);
		//1 null key is allowed, if we add another null key , previous value will be replaced
		h.put(null, "smith");
		System.out.println(h);
	}

}
