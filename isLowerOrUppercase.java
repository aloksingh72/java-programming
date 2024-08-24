import java.util.Scanner;

public class isLowerOrUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("upper case or lower case");
        char alpha = sc.next().charAt(0);
        if(alpha >= 97 && alpha <= 122) {
            System.out.println("alpahbet in Lowercase");
        }
        else if (alpha >= 65 && alpha <= 95){
            System.out.println("alpahbet in Uppercase");
        }
    
   
        
        sc.close();
    }
    
}
