package Arrays_Strings;

import java.util.Scanner;

public class evenIndexElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the vaues to array");
		for (int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		
		}
		for(int j=0; j<a.length; j++) {
			if(j%2==0) {
				System.out.println(a[j]);
			}
		}
	}
}
