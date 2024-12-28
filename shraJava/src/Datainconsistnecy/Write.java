package Datainconsistnecy;

public class Write extends Thread {
	DataInconsistency dc;

	//constructor

	Write(DataInconsistency dc) {
		this.dc = dc;

	}

	public void run() {
		dc.write("python");
	}
}
