package file_handling;

// import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
	/*	
	 *----->Method-1
	 * File f1 =new File("D:\\Documents\\FileHandling\\abc.txt");
		try {
			f1.createNewFile();
			System.out.println("file created successful");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("file is not created");
			
			----->Method-2
			File f1 =new File("D:\\Documents\\FileHandling\\abc.mp4");
		try {
			f1.createNewFile();
			System.out.println("file created successful");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("file is not created");
			
			
		}
		*/
		//--->Method-3
//		File f1 = new File("D:\\Documents\\FileHandling\\xyz.txt");
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("D:\\Documents\\FileHandling\\xyz.txt");
			System.out.println("File created successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("file not created");
		}
		finally {
			fw.close();
		}
		

	}

}
