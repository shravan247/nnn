package dummy;

public class student {

	String sname;
	int sid;

	student() {

	}

	student(String sname, int sid) {
		this.sname = sname;
		this.sid = sid;

	}
	
	@Override
	public boolean equals(Object O) {
		student s=(student) O;
		if(this.sid==s.sid && this.sname.equals(s.sname)) {
			return true;
		}
		else {
			return false;
		}
	}

}
