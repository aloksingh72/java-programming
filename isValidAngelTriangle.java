import java.util.Scanner;

public class isValidAngelTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle");

        int a = sc.nextInt();
        System.out.println("Enter the second angle");
        int b = sc.nextInt();
        System.out.println("Enter the third angle");
        int c = sc.nextInt();
        if(a+b+c  == 180 && a!=0 && b!=0 && c!=0){
            System.out.println("it is a valid Triangle");
        }
        else{
            System.out.println("it is not a valid Triangle");
        }
        sc.close();
    }
}
