package JavaPractice;

public class multiplicationTableRange {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("Table of "+i);
			for(int j=1; j<=10; j++) {
				int res=i*j;
				System.out.println(i+"*"+j+"="+res);
			}
		}
	}
}
