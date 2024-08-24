import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three side of the  triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = ((a+b>c) && (a+c>b) && (b+c)>a) ? "It is a valid triangle" : "It is not a valid triangle";
        System.out.println(result); 
    }
    
}
