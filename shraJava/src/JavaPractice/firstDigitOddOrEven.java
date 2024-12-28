package JavaPractice;

public class firstDigitOddOrEven {
	public static void main(String[] args) {
		int n = 6431;
		int digit = 0;
		while (n != 0) {
			digit = n % 10;
			n = n / 10;
		}
		System.out.println(digit);
		if (digit % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("Odd");
		}
	}
}
