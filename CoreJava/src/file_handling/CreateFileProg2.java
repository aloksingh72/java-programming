package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileProg2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		FileWriter fw =null;
		try {
			fw = new FileWriter("D:\\Documents\\FileHandling\\pqr.txt");
	
			System.out.println("File is created");
			fw.write(str);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("Program Ends");
		
		
sc.close();
	}

}
