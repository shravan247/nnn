package Strings_Program;

import java.util.Scanner;

public class stringPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.next();
		String rev = "";
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			rev = ch + rev;
		}
		if (a.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
