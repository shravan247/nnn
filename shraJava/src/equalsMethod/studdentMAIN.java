package equalsMethod;

public class studdentMAIN {
	public static void main(String[] args) {
	    student s1=new student("ravi", 1);
	    student s2=new student("buvi", 2);
	    student s3=s1;
	    student s4=new student("ravi", 1);
	    

	    System.out.println(s1.hashCode()==s3.hashCode());
	    System.out.println(s1.hashCode()==s4.hashCode());
	    
	    
	}

}
