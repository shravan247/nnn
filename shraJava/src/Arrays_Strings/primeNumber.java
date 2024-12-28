package Arrays_Strings;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println("Prime no");
			} else {
				System.out.println("Not a prime no");
			}
		}

	}
}
