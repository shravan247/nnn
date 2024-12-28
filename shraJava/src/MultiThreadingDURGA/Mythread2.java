package MultiThreadingDURGA;

public class Mythread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

}
