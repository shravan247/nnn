package Datainconsistnecy;

public class Read extends Thread {
	DataInconsistency dc;

	//constructor
	Read(DataInconsistency dc) {
		this.dc = dc;

	}

	public void run() {
		dc.read();
	}
}
