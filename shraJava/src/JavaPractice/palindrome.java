package JavaPractice;

public class palindrome {

	public static void main(String[] args) {
		// when we reverse the number the result should be same ex: 343, 780087
		int a = 515, b;
		int sum = 0;

		int temp = a;

		while (a > 0) {
			b = a % 10;
			sum = (sum * 10) + b;
			a = a / 10;
		}

		if (sum == temp) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
