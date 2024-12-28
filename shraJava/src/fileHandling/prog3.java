package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prog3 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("D://java//shravan1.txt");
			// we can also use Filewriter
			byte[] array = "byeee".getBytes();
			byte[] array1 = "yoooo".getBytes();
			try {
				fos.write(array);
				fos.write('\n');
				fos.write(array1);

				fos.close();
				System.out.println("done");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
