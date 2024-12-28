package dummy;

public class sudentuser {

	public static void main(String[] args) {
		student s1=new student("Ravi", 1);
		student s2=new student("Bhuvi", 2);
		student s3=s1;
		student s4=new student("Ravi", 1);
     
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));


	}
}
