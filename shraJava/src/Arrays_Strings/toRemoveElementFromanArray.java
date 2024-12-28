package Arrays_Strings;

import java.util.Scanner;

public class toRemoveElementFromanArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int[] b = new int[a.length - 1];
		System.out.println("enter the index value froom which u have to remove the number");
		int index = s.nextInt();
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != index) {
				b[temp++] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
