package Pattern_Program;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		//pattern1(n);
		//pattern2(n);
		//pattern3(n);
		//pattern4(n);
		//pattern5(n);
		//pattern6(n);
		//pattern7(n);
        //pattern8(n);
		//pattern9(n);
		//pattern10(n);
		//pattern11(n);
		//pattern12(n);
		pattern13(n);
		
sc.close();
	}


	public static void pattern1(int n) {
		for(int i =1;i<=n; i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
				
			
		}
			System.out.println();
		
	}
	
}
	public static void pattern2(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
	public static void pattern5(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print((i-1)%2 +" ");
			}
			System.out.println();
		}
	}
	public static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print((j-1)%2+" ");
			}
		System.out.println();
		}
	}
	public static void pattern7(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print("("+i+","+j+") ");
			}
			System.out.println();
		}
	}
	public static void pattern8(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i == 1|| j==1|| i == n || j ==n) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern9(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if(i==1|| i==n || j==1
						|| j==n || i == 2 || i == n-1
						||j==2|| j == n-1) {
					System.out.print("* ");
					
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern10(int n) {
		int mid = n/2 +1;
		for(int i =1;i<=n;i++) {
			for (int j =1;j<=n;j++) {
				if(i == mid || j == mid) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	public static void pattern11(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if((i==j)||(i+j)==(n+1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static   void pattern12(int n) {
		int mid = n/2 +1;
		for(int i =1;i<=n;i++) {
			for(int j =1; j<=n; j++) {
				if(i==1|| i==n|| j==1||j==n || i==mid || j == mid
						|| i==j || (i+j) == (n+1)) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern13(int n) {
		int mid = n/2 +1;
		for (int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if ( i== mid || j == mid|| i ==1 && j>mid || j ==n&& i >mid
						||i ==n && j<mid || j==1 && i<mid ) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
