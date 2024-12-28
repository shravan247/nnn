package shraJava;
import java.util.Scanner;
class shra{
static String s;
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("enter the ph no");
String cno=s.next();
if(cno.length()!=10)
{
	throw new ArithmeticException("invalid cno");
	
}
else
{ 
	System.out.println("valid cno");
}
}
}