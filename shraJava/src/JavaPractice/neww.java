package JavaPractice;

public class neww {
	public static void main(String[] args) {
		int n = 12344321;
		int temp=n;
		int a=0, rev=0;
		while (n>0) {
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
		if(temp==rev) {
		System.out.println("pal");
		}
		else {
			System.out.println("NP");
		}
	}
}
