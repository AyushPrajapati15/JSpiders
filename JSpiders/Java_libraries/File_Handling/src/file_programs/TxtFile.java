package file_programs;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFile {

	public static void main(String[] args) {
		File f=new File("Demo.txt");
		
		try {
			boolean res=f.createNewFile();
			FileWriter  fw=new FileWriter(f);
			fw.write("Ayush");
			fw.flush();
			System.out.println(res);
		} catch (IOException e) {
			System.out.println("Handled");
		}
		
	}
}
