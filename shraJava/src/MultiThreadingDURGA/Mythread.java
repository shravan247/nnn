package MultiThreadingDURGA;

public class Mythread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child thread");
		}
	}	

}
