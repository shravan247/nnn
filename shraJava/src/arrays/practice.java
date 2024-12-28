package arrays;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		int[][] a= {{1,2},{2,3}};
		
		for(int[] b:a) {
			for(int c:b) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
