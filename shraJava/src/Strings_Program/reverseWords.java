package Strings_Program;

import java.util.Scanner;

public class reverseWords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		String[] s2 = s1.split(" ");
		String rev = "";
		for (int i = 0; i < s2.length; i++) {
			String s3 = s2[i];
			for (int j = s3.length() - 1; j >= 0; j--) {
				rev = rev + s3.charAt(j);
			}
			rev = rev + " ";

		}
		System.out.println(rev);
	}
}
