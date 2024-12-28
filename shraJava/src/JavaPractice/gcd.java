package JavaPractice;

public class gcd {
	public static void main(String[] args) {
		//greatest comman divisor>>>> similar to factors
		//ex:6 factors 1236; 9 factors 1339,  sooo 1 and 3 are common and 3 is greater :)
		int n=6, m=9;
		int gcd=0;
		for(int i=1; i<=n && i<=m; i++) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
}
