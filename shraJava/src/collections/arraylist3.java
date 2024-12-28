package collections;

import java.util.ArrayList;

public class arraylist3 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Smith");
	a1.add("Jonny");	
	ArrayList a2=new ArrayList();
	a2.add("Abhi");
	a2.addAll(1, a1);
	
	System.out.println(a2.contains("Smith"));
	System.out.println(a2.containsAll(a1));
	System.out.println(a2.indexOf("Jonny"));
	
}
}
