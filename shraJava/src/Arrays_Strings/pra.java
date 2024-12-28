package Arrays_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class pra {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string value");
		String a = s.nextLine(); 
		String[] b=a.split(" ");
		int count=0;
		for(int i=0; i<b.length; i++) {
			count++;
		}
		System.out.println(count);
	}
	}
