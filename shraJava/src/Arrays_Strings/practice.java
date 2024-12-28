package Arrays_Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		// int[] b = new int[size];
		System.out.println("Enter the values into the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			int count=0;

			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}

	}
}
