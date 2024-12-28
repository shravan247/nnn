package JavaPractice;

public class buzzNumber {
	public static void main(String[] args) {
		//number should be either divisible by 7 or last number should be 7
		int n=17;
		if(n%7==0|| n%10==7) {
			System.out.println("Its a buzz number");
		}
		else {
			System.out.println("Its not a buzz no");
		}
	}
}
