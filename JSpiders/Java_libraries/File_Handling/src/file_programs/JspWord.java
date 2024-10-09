package file_programs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JspWord {
	
	public static void main(String[] args) {
		
		File f=new File("D:\\Jsp.doc");
		try {
			FileWriter fw=new FileWriter(f);
			FileReader fr=new FileReader("D:\\Jsp.doc");
			fw.write("Hello Java");
			fw.flush();
			String read="";
			long length=new File("D:\\Jsp.doc").length();
			for(int i=0;i<=length;i++)
			{
				read+=(char)fr.read();
			}
			for(int i=read.length()-1;i>=0;i--)
			{
				System.out.print(read.charAt(i));				
			}
		} catch (IOException e) {
			System.out.println("handled");
		}
	}

}
