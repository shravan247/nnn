package JavaPractice;

public class strongNumber {
	public static void main(String[] args) {
		int n = 40585, a;
		int sum = 0, sum1 = 0;
		int temp = n;
		while (n > 0) {
			int fact = 1;
			a = n % 10;
			for (int i = 1; i <= a; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a strong number");
		}
	}
}
