package Multithreading;

public class java1 {

	public static void main(String[] args) {
		java j=new java();
		Thread t1=new Thread(j);
		t1.start();
		Thread t2=new Thread(j);
		t2.start();
		
		t1.setName("Mangli");
		t2.setName("Pongli");
	}
}
