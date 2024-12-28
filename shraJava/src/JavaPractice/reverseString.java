package JavaPractice;

import java.util.Iterator;

public class reverseString {
	public static void main(String[] args) {

		String a="RAMA", rev="";
		for(int i=0; i<a.length(); i++) {
			char ch=a.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}
}