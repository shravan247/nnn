package Multithreading;

public class example {
	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(priority);
		
		Thread.currentThread().setName("jaavaa");
		Thread.currentThread().setPriority(10);
		
		String name1=Thread.currentThread().getName();
		int priority1 = Thread.currentThread().getPriority();
		
		System.out.println(name1);
		System.out.println(priority1);
	}
}
