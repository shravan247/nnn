package JavaPractice;

public class autoMorphicNo {
	public static void main(String[] args) {
		// if n=5,6 square=25, 26, last digit should be equal to given no
		int n = 25, a;
		int square = n * n;
		while (n > 0) {
			if (n % 10 == square % 10) {
				n = n / 10;
				square = square / 10;

			}

		}

		if (n == 0) {
			System.out.println("Auto morphic no");
		} else {
			System.out.println("Not a automorphic no");
		}
	}
}
