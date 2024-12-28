package JavaPractice;

public class armstrongnumber {
	public static void main(String[] args) {
		int n = 153, temp = n, a = 0, count = 0, sum = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		int n1 = temp;
		while (n1 > 0) {
			a = n1 % 10;
			int pow = 1;
			for (int i = 1; i <= count; i++) {
				pow = pow * a;
			}
			sum = sum + pow;
			n1 = n1 / 10;
		}
		if (temp == sum) {
			System.out.println("Arm strong number");
		} else {
			System.out.println("Not a arm strong number");
		}
	}
}
