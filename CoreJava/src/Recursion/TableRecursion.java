package Recursion;

import java.util.Scanner;

public class TableRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("main starts");
		
		tableRecursion(n,1);
		System.out.println("main ends");
		
		
		sc.close();

	}
	
	public static void tableRecursion(int n,int i) {
		
		if(i<=10) {
			System.out.println(n + "*"+i+"="+(n*i));
			
			tableRecursion(n,i+1);
		}
	}

}
