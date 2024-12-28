package JavaPractice;

public class XylemandPhloem {
	public static void main(String[] args) {
		int n = 1234, innersum = 0, outersum = 0;
		int a = n % 10;
		n = n / 10;
		while (n > 9) {
			int b = n % 10;
			innersum = innersum + b;
			n = n / 10;

		}
		outersum = a + n;
		if (outersum == innersum) {
			System.out.println("Xylem");
		} else {
			System.out.println("Phloem");
		}
	}
}
