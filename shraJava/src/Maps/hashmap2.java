package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hashmap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Abhi");
		h.put(2, "Bhuvi");
		h.put(3, "Kavi");
		//search
		System.out.println(h.containsKey(1));
		System.out.println(h.containsValue("Kavi"));
		
		//remove
		//h.remove(1);
		System.out.println(h);
		//h.clear();
		//System.out.println(h);
		
		//access
		System.out.println(h.get(1));//it will displayed the value
		//list of values
		Collection sv = h.values();
		System.out.println(sv);
		//System.out.println(h.values());
		
		Set ks = h.keySet();
		System.out.println(ks);
		//System.out.println(h.keySet()); //return type - SET
		System.out.println(h.entrySet()); //return type - SET
		
		for(Object o:ks) {
			System.out.println(o);
		}
	}
}
