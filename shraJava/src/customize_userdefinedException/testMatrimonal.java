package customize_userdefinedException;

import java.util.Scanner;

public class testMatrimonal {
	
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the age");
		 int age=s.nextInt();
		 
		 if(age>60) {
			 throw new tooOldException("Exceeding the age limit");
		 }
		 else if (age<18) {
			 throw new tooYoungException("You are too young to get married");
		 }
		 else {
			 System.out.println("Thank you!!! You have succusfully rigistered");
		 }
	}

}
