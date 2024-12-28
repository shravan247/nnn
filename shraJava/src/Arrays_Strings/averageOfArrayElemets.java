package Arrays_Strings;

import java.util.Scanner;

public class averageOfArrayElemets {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size");
	int size=s.nextInt();
	int[] a=new int[size];
	System.out.println("Enter the vaues to array");
	for (int i=0; i<a.length; i++) {
		a[i]=s.nextInt();
	
	}
	int sum=0;
	for(int i=0; i<a.length; i++) {
		 sum=sum+a[i];
	}
	int avg=sum/a.length;
	System.out.println(sum);
	System.out.println(avg);
}}
