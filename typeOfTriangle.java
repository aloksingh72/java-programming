import java.util.Scanner;

public class typeOfTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a = sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        int b = sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int c = sc.nextInt();

        if(a+b>=c && a+c>=b && b+c>=a){

            if(a==b && a == c){
                System.out.println("this is an Equilateral triangle");
            }
            else if( a !=b && a != c){
                System.out.println("this is scalene triangle");
            }
            else{
                System.out.println("this is isoceles triangle");
            }
        } 
        sc.close();
    }
    
}
