import java.util.Scanner;

public class BiggestofTwo {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:-");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b =sc.nextInt();
        int result = (a>b)? a: b;
        System.out.println(result);
    }
    
}
