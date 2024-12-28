package Upcating_and_Downcasting;

public class upcastMAIN {
	public static void main(String[] args) {
    //upcasting1 a=new upcasting2();
    upcasting2 b=(upcasting2) new upcasting1();
    
    System.out.println(b.i);
    System.out.println(b.j);
	
	}

}
