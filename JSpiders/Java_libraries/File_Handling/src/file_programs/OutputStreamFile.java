package file_programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class OutputStreamFile {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos=new FileOutputStream("fos.doc");
			String s="hello";
			byte []b=s.getBytes();
			System.out.println(Arrays.toString(b));
			try {
				
				fos.write(b);
				fos.flush();
				System.out.println("Data stored");
			} catch (IOException e) {
				System.out.println("handled");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not created");
		}
	}

}
