package MapsTreemap;

import java.util.Set;
import java.util.TreeMap;

import collectionSET.treeset;

public class laptop4 {

	public static void main(String[] args) {
		TreeMap<laptop3, Integer> t = new TreeMap<laptop3, Integer>();
		t.put(new laptop3("HP", 35000), 2);
		t.put(new laptop3("Dell", 30000), 1);
		//sorted based on price
		System.out.println(t);
		Set s= t.entrySet();
		System.out.println(s);
	}

}
