package Datainconsistnecy;

public class DataInconsistency {

	StringBuilder sb = new StringBuilder("java");

	synchronized public void read() {
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.charAt(i));
		}
	}

	synchronized public void write(String s) {
		StringBuilder sb = new StringBuilder(s);
		this.sb = sb;
	}
}
