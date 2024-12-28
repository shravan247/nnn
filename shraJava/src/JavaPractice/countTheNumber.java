package JavaPractice;

public class countTheNumber {

	public static void main(String[] args) {
		int a=7878, count=0;
		while (a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
	}
}
