package Arrays_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class copy_oneArray_toAnotherArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		int[] b=new int[a.length];
		System.out.println("Enter the values into the array");
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		for(int j=0; j<b.length; j++) {
			b[j]=a[j];
			//we will not get o/p in []
			//System.out.println(b[j]);
		}
		System.out.println(Arrays.toString(b));
	}
}
