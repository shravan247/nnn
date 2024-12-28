package Arrays_Strings;

import java.util.Scanner;

public class palindromeArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = (sum*10) + a[i];
		}
		int temp = sum;
		int rev = 0;
		for (int j = 0; j < a.length; j++) {
			int b = sum % 10;
			rev =( rev * 10 )+ b;
			sum = sum / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
