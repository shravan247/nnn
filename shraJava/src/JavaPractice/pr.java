package JavaPractice;

public class pr {
	public static void main(String[] args) {
		int n = 1221, temp = n;
		int b = 0, rev = 0;
		while (n > 0) {
			b = n % 10;
			rev = (rev * 10) + b;
			n /= 10;
		}
		if (temp == rev) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Nooo");
		}
	}
}
