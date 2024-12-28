package Strings_Program;

import java.util.Scanner;

public class countWords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		String[] s2 = s1.split(" ");
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			count++;
		}
		System.out.println("Words count is: " + count);

	}
}
