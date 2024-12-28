package JavaPractice;

public class reverseNumber {
	public static void main(String[] args) {
		// similar to palindrome
		int a=9876, b, store=0;
		while (a>0) {
			b=a%10;
			store=(store*10)+b;
			a=a/10;
		}
		System.out.println(store);
	}
}
