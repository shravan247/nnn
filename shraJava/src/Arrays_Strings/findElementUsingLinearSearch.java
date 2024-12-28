package Arrays_Strings;

import java.util.Scanner;

public class findElementUsingLinearSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		System.out.println("Enter the target element");
		int b = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the vaues to array");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();

		}
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				System.out.println(b + " is present in index " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Target element not found");
		}

	}
}
