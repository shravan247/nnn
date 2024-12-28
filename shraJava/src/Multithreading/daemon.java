package Multithreading;

public class daemon extends Thread {
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Deamon thread is executing");
		}
		else {
			System.out.println("UserThread is executing");
		}
	}
}
