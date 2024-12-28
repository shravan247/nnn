package equalsMethod;

import java.util.Objects;

public class student{
	String sname;
	int sid;
	
	student(String sname, int sid){
		this.sname=sname;
		this.sid=sid;
	}
	
	@Override
	public boolean equals(Object o) {
		//downcasting
		student s=(student)o;
		if(this.sname.equals(s.sname) && this.sid==s.sid) {
			return true;
		}
		else {
			return false;
		}
		}
	@Override
	public int hashCode() {
		int res=Objects.hash(sname, sid);
		return res;
		
	}
	
}