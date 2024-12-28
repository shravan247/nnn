package Multithreading;

public class isAlive {

	public static void main(String[] args) {
		java j=new java();
		Thread t1=new Thread(j);
		System.out.println(t1.isAlive());
		t1.start();
		t1.setName("dingo");
		System.out.println(t1.isAlive());
	}

}
