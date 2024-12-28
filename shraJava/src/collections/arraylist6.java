package collections;

import java.util.ArrayList;

public class arraylist6 {

public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Lion");
	a1.add("Cow");
	a1.add("Tiger");
	a1.add("Horse");
	
	for(Object o:a1) {
		String s=(String)o;
		if(s.charAt(0)=='L'||s.charAt(0)=='l') {
			System.out.println(s);
		}
	}
}
}
