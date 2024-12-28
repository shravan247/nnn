package JavaPractice;

public class Neon{
	public static void main(String[] args) {
		//given number = sum of square of given number---> 9=  81--. 8+1=9 .:. 9=9;
		int n = 9,sum=0;
		int b=n*n;
		//int copy=b;
		while (b>0) {
			
			int c=b%10;
			sum=sum+c;
			b/=10;
		}
		if(n==sum) {
			System.out.println("neon no");
		}
		else {
			System.out.println("not a neon no");
		}
	}
}
