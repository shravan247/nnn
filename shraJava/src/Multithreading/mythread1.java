package Multithreading;

public class mythread1 extends Thread {
	@Override
	public void run() {
		System.out.println("My thread is executing");
		System.out.println(Thread.currentThread().getName());
	}
}
