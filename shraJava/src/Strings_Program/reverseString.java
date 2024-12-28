package Strings_Program;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.next();
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
	}
}
