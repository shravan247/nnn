package Strings_Program;

import java.util.Scanner;

public class convertToLowercase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string value");
		String st=s.next();
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)>='A'&& st.charAt(i)<='Z') {
				int a=st.charAt(i);
				int c=a+32;
				char ch=(char)c;
				System.out.println(ch);
			}
			else {
				System.out.println(st.charAt(i));
			}
		}
	}

}
