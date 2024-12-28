package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("Enter the number of fruit names to be entered");
		int n = s.nextInt();
		System.out.println("Enter the fruit name");
		for (int i = 1; i <= n; i++) {
			a1.add(s.next());
		}
		System.out.println(a1);
		System.out.println("Enter the first character of the fruit");
		char c = s.next().charAt(0);
		for (Object o : a1) {
			String s1 = (String) o;
			if (s1.charAt(0) == c) {
				System.out.println(s1);
			}
			else {
				System.out.println("Unable to find the fruit");
			}
		}
	}
}
