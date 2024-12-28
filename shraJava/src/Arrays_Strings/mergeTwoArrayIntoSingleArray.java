package Arrays_Strings;

import java.util.Scanner;

public class mergeTwoArrayIntoSingleArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];
		System.out.println("enter the Elemnts into array");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}
		int[] c = new int[a.length + b.length];
		int temp = 0;
		int temp1 = 0;
		for (int i = 0; i < c.length; i++) {
			if (temp < a.length) {
				c[i] = a[temp++];
			} else {
				c[i] = b[temp1++];
			}
			System.out.println(c[i]);

		}
	}
}