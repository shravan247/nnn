package Arrays_Strings;

import java.util.Scanner;

public class FirstsecondMaxMinElements {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scn.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the " + size + " elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		// this is bubble sort logic easy, for 1st largest give a[0], second a[1],
		// similarly 1st smallest a[a.length], second smallest a[a.length-2]
		// descending order logic
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("1st Maximum element " + a[0]);
		System.out.println("second largest " + a[1]);
		System.out.println("1st minimum element " + a[a.length - 1]);
		System.out.println("second smallest " + a[a.length - 2]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
