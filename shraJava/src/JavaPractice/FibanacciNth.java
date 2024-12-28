package JavaPractice;

public class FibanacciNth {
	public static void main(String[] args) {
		int first=0, second=1;
		//to get nth number
		int target=4;
		for(int i=1; i<=5; i++) {
			if(i==target) {
			System.out.println(first);
			}
			int next= first+second;
			first=second;
			second=next;
		}
	}
}
