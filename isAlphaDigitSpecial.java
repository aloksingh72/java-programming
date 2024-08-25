import java.util.Scanner;

public class isAlphaDigitSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:-");
        char alpha = sc.next().charAt(0);
        if((alpha >=97 && alpha <=122) || (alpha >=65 && alpha <= 90 ) ){
            System.out.println("It is alphabet");
        }
        else if(alpha >= 48 && alpha <= 57){
            System.out.println("is number");

        }
        else{
            System.out.println("This is a special character");
        }
        sc.close();
    }
    
}
