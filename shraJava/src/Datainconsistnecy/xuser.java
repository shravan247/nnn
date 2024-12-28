package Datainconsistnecy;

public class xuser {

	public static void main(String[] args) {
		DataInconsistency dic = new DataInconsistency();

		Read r = new Read(dic);
		Write w = new Write(dic);
		r.start();
		w.start();
	}

}
