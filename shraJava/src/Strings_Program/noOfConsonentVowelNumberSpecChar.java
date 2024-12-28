package Strings_Program;

import java.util.Scanner;

public class noOfConsonentVowelNumberSpecChar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.next();
		int con = 0, vow = 0, num = 0, sc = 0;
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vow++;
				} else {
					con++;
				}
			}

			else if (ch >= '0' && ch <= '9') {
				num++;
			} else {
				sc++;
			}

		}
		System.out
				.println("consonents: " + con + " Vowels: " + vow + " Numbers: " + num + " Special Characters: " + sc);
	}
}
