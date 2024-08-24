import java.util.Scanner;

public class BiggestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number no :" );
        int a = sc.nextInt();
        System.out.print("Enter first second no :" );
        int b = sc.nextInt();
        System.out.print("Enter first third no :" );
        int c = sc.nextInt();
        System.out.print("Enter first fourth no :" );
        int d = sc.nextInt();

        if(a>b && a>c && a>d){
            System.out.println("a is the largest" +a);
        }
        else if(b>a && b>c && b>d){
            System.out.println("b is the largest" +b);
        }
        else if (c>a && c>b && c>d){
            System.out.println("c is the largest" +c);
        }
        else {
            System.out.println("d is the largest" +d);
        }
        sc.close();
    }
    
    
}
