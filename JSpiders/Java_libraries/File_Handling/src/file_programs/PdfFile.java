package file_programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PdfFile {
	public static void main(String[] args) {
		
	File f=new File("file.pdf");
	try {
		boolean res=f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("Ayush");
		fw.flush();
		System.out.println(res);
		
	} catch (IOException e) {
		System.out.println("handled");
	}

	}
}
