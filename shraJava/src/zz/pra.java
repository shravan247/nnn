package zz;

public class pra {
	public static void main(String[] args) {
		
		int n=22, a=0;
		int sum=0, pro=1;
		while (n>0) {
			a=n%10;
			sum=sum+a;
			pro=pro*a;
			n=n/10;
		}
		if(sum==pro) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("NS");
		}
	}
}
