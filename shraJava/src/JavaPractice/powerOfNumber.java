package JavaPractice;

public class powerOfNumber {
	public static void main(String[] args) {
		int base = 2, expo = 3;
		int power = 1;
		for (int i = 1; i <= expo; i++) {
			power = power * base;
		}
		System.out.println(power);
	}
}
