package MapsTreemap;

import java.util.Set;
import java.util.TreeMap;

public class laptop2 {

	public static void main(String[] args) {
		TreeMap<Integer, laptop> t=new TreeMap<Integer, laptop>();
		t.put(1, new laptop("hp", "Black"));
		t.put(2, new laptop("Dell", "White"));
		System.out.println(t);
		Set e=t.entrySet();
		for(Object o:e) {
			System.out.println(o);
		}
	}

}
