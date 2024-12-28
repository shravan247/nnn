package JavaPractice;

public class sumOfCount {
	public static void main(String[] args) {
		int a = 1234, sum = 0, b = 0;
		while (a > 0) {
			b=a%10;
			//for product we have to give int product=1 above then product =product*b below
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
	}
}
