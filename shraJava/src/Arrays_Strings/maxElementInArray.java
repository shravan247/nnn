package Arrays_Strings;

import java.util.Scanner;

public class maxElementInArray {
	public static void main(String[] args) {
		//refer FirstsecondMaxMinElements for EZ program
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		int max=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}
}
