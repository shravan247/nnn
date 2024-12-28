package Multithreading;

public class mythread3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		mythread1 t1 = new mythread1();
		t1.start();
		mythread1 t2 = new mythread1();
		t2.start();
		t1.setName("vivo");
		t1.setName("Dingi");
	}
}
