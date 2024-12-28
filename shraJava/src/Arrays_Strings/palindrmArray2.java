package Arrays_Strings;

import java.util.Scanner;

public class palindrmArray2 {
	//if i/p is 121, 345, 45554 for such elements
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enetr array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int rev = 0;
			while (temp > 0) {
				int b = temp % 10;
				rev = (rev * 10) + b;
				temp = temp / 10;
			}
			if (a[i] == rev) {
				System.out.println(a[i]+" is a Palindrome");
			}

		}

	}
}
