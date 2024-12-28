package MultiThreadingDURGA;

public class Mythread3 {

	public static void main(String[] args) {
		// create a object for runnable class
		Mythread2 t = new Mythread2();
		// create a thread class since runnable interface doesn't have start() and pass
		// above class reference inside the constructor
		Thread t1 = new Thread(t);
		t1.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}
