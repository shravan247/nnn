package JavaPractice;

public class factorial {
	public static void main(String[] args) {
		// factorial is product of the number ex:5*4*3*2*1=120
		int n=5, product=1, sum=0;
		for (int i=1; i<=n; i++) {
			//product=product*i;
			sum=sum+i;
		}
		//System.out.println(product);
		System.out.println(sum);
	}
}
