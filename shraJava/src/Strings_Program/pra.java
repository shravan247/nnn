package Strings_Program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class pra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string value");
		String s = sc.nextLine();
		String[] s1=s.split(" ");
		String rev="";
		int count=0;
		for(int i=0; i<s1.length; i++) {
			count++;
		}
		System.out.println(count);
		
	}
}