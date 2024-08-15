import java.util.Scanner;

class Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
    
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
    
        int big = getBig(x, y);
    
        System.out.println("The bigger of " + x + " and " + y + " is: " + big);
        
        sc.close(); // It's good practice to close the scanner.
    }
    
    public static int getBig(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
