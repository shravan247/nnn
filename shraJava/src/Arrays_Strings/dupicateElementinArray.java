package Arrays_Strings;

import java.util.Scanner;

public class dupicateElementinArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i=0; i<a.length; i++) {
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
