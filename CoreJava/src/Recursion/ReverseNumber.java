package Recursion;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		reverseNumber(n);
		System.out.println(rev);
		
		
		sc.close();

	}
	static int rem =0;
	static int rev =0;
	public static void reverseNumber(int n) {
		
		if(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n=n/10;
			reverseNumber(n);
			
			
		}
		
	}

}
