package JavaPractice;

public class perfectSquare {
	public static void main(String[] args) {
		int n = 9, square = 0;
		boolean flag = false;
		for (int i = 1; i <= n; i++) {
			square = i * i;
			if (square == n) {
				System.out.println(n + " is a Perfect square");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("It is not a perfect square");
		}
	}
}
