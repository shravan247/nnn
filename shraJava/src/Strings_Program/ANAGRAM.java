package Strings_Program;

import java.util.Arrays;
import java.util.Scanner;

public class ANAGRAM {
//ANAGRAM=NAGARAM, SILENT=LISTEN all the spelling should be covered
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 string values");
		String s = sc.next();
		String s1 = sc.next();

		if (s.length() == s1.length()) {
			char[] ch = s.toCharArray();
			char[] ch1 = s1.toCharArray();
			//it will sort in descending order ABCD....
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean flag = false;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == ch1[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
			if (flag == true) {
				System.out.println("It is a anagram");
			} else {
				System.out.println("Not a anagram");
			}
		} else {
			System.out.println("Not a ANAGRAM");
		}
	}
}
