package arrays;

import java.util.Scanner;

public class TwoD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter row size");
		System.out.println("enter column size");
		int rowsize=s.nextInt();
		int columnsize=s.nextInt();
		char[][] c=new char[rowsize][columnsize];
		System.out.println("enter char");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				c[i][j]=s.next().charAt(0);
			}
		}
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.println(c[1][1]);
			}
		}
		
	}
}
