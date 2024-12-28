package fileHandling;

import java.io.File;
import java.io.IOException;

public class createFolderAndFile {
	public static void main(String[] args) throws Exception {
		
		File folder=new File("D://java");
		if(folder.mkdir()) {
			System.out.println("folder is created");
		}
		else {
			System.out.println("folder already exist");
		}
		
		File f=new File("D://java//powerpoint.pptx");
		if(f.createNewFile()) {
			System.out.println("new file created");
		}
		else {
			System.out.println("file already exist");
		}
		
	}
	
}