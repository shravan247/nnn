package Multithreading;

public class mythread2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		mythread1 t1=new mythread1();
		t1.run();
		mythread1 t2=new mythread1();
		t2.run();
		t1.setName("Dinga");
		t1.setName("Dingi");
	
	}

}
