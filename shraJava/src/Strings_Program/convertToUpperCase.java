package Strings_Program;

import java.util.Scanner;

public class convertToUpperCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string value");
		String st = s.next();
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				int a = st.charAt(i);
				int b = a -32 ;
				char c = (char) b;
				System.out.println(c);
			} else {
				System.out.println(st.charAt(i));
			}

		}
	}
}
