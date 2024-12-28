package JavaPractice;

public class perfectNo {
	public static void main(String[] args) {
		// perfect number 6,28 - 6 factor 1236, except last digit sum remaining 1+2+3=6
		// should be equal to last digit =6
		int n = 6, sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println("perfect no");
		} else {
			System.out.println("nt a perfect no");
		}
	}
}
