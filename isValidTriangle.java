import java.util.Scanner;

public class isValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First side of triangle");
        int a = sc.nextInt();
        System.out.println("Enter Second side of triangle");
        int b = sc.nextInt();
        System.out.println("Enter Third side of triangle");
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("It is a valid triangle");
        }
        else{
            System.out.println("It is not a valid triangle");
        }
        sc.close();
    }
    
}
