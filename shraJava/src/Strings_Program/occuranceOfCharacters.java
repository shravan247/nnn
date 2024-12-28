package Strings_Program;

import java.util.Scanner;

public class occuranceOfCharacters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.next();
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			int count = 1;
			// -1 because if  the given char ch is not present in the string it will return -1 :)
			if (b.indexOf(ch) == -1) {
				for (int j = i + 1; j < a.length(); j++) {
					char ch1 = a.charAt(j);
					if (ch == ch1) {
						count++;
					}
				}
				System.out.println(ch + "-" + count);
				b = b + ch;
			}
		}

	}
}
