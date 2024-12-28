package JavaPractice;

public class spyNumber {
//sum of number and product of number should be same

	public static void main(String[] args) {
		int a = 22, sum = 0, b = 0;
		int pro = 1;
		while (a > 0) {
			b = a % 10;
			sum = sum + b;
			pro = pro * b;
			a /= 10;
		}
		if (sum == pro) {
			System.out.println("It is  spy no");
		} else {
			System.out.println("It is not spy number");
		}
	}
}
