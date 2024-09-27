package file_handling;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileProg3 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name =sc.nextLine(); 
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		System.out.println("Enter the weight:");
		int weight = sc.nextInt();
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\Documents\\FileHandling\\userDetails.txt");
			System.out.println("file is created successfully");
			fw.write("name is "+name+"\n");
			fw.write("age is "+age+"\n");
			fw.write("\nweight is "+weight+"kg");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("file is  not created");
			
		}
		finally {
			fw.close();
		}
		
		
		sc.close();

	}

}
