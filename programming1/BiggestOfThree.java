import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
       
        System.out.println("hello");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no.:-");
        int a = sc.nextInt();
        System.out.println("enter the second no.:-");
        int b = sc.nextInt();
        System.out.println("enter the third no.:-");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
       

    }
    
}
