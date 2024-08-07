import java.util.Scanner;

class Program3{
     public static void main(String[] args) {
        System.out.println("hello world");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first program:-");
        int a=sc.nextInt();
        System.out.println("enter the second number:-");
        int b=sc.nextInt();
     
        int sum = a+b;
        System.out.println("the sum of two number"+sum);
        
    }
}
