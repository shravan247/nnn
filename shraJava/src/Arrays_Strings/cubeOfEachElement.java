package Arrays_Strings;

import java.util.Scanner;

public class cubeOfEachElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the vaues to array");
		for (int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		
		}
	   for(int i=0; i<a.length; i++) {
		   int cube=a[i]*a[i]*a[i];
		   System.out.println(cube);
	   }
	}
}
