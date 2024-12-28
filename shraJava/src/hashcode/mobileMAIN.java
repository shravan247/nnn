package hashcode;

public class mobileMAIN {
	public static void main(String[] args) {
		mobile m1=new mobile("Samsung", 50000);
		mobile m2=new mobile("OnePlus", 30000);
		mobile m3=m1;
		mobile m4=new mobile("Samsung", 50000);
		
		System.out.println(m1.hashCode()==m2.hashCode());
		System.out.println(m1.hashCode()==m3.hashCode());
		System.out.println(m1.hashCode()==m4.hashCode());
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);

	}

}
