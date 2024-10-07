import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the first number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number:-");
        int b = sc.nextInt();

        double result = Math.pow(a,b);
        System.out.println(a+" power "+b+" is "+result);
        sc.close();

    }
    
}
