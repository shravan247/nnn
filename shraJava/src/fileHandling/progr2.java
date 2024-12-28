package fileHandling;

import java.io.File;
import java.io.IOException;

public class progr2 {
	public static void main(String[] args) throws Exception {

		File f=new File("D://java");
		String[] l = f.list();
		for(String s:l) {
			System.out.println(s);
		}
		
		File f1=new File("D://java//myfile.txt");
		System.out.println(f1.createNewFile());
		System.out.println(f1.exists());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		// System.out.println(f1.delete());
		System.out.println(f1.getAbsolutePath());
			
	}
}
