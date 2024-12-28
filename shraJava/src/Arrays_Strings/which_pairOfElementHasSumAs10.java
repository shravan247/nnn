package Arrays_Strings;

import java.util.Scanner;

public class which_pairOfElementHasSumAs10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enterthe target sum");
		int b = s.nextInt();
		System.out.println("Enter the elements into array");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			//for j=i+1 since we need to add 1st and 2nd numbers
			for (int j = i + 1; j < a.length; j++) {
				sum = a[i] + a[j];
				if (b == sum) {
					System.out.println(i + "-" + a[i] +" & "+ j + "_" + a[j]);
					flag = true;
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println("We dont have a pair that lead to sum=" + b);
		}
	}
}
