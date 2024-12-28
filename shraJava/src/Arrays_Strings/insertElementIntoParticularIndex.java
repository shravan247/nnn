package Arrays_Strings;

import java.util.Scanner;

public class insertElementIntoParticularIndex {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enetr array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int[] b = new int[a.length + 1];
		System.out.println("Enter the number to be inserted");
		int num = s.nextInt();
		System.out.println("Enter the index where u want to insert");
		int index = s.nextInt();
		int temp = 0;
		for (int i = 0; i < a.length + 1; i++) {
			if (i == index) {
				b[i] = num;
				i++;
			}
			b[i] = a[temp++];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
	}
}
