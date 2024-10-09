package file_programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class DocFile {
		public static void main(String[] args) {
			
		File f=new File("file.doc");
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


