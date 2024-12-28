package Multithreading;

public class daemon2 {

	public static void main(String[] args) {
		daemon d1 = new daemon();
		daemon d2 = new daemon();
		d1.setDaemon(true);
		d1.start();
		d2.start();
	}

}
