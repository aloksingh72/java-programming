import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        if ((alpha >= 97 && alpha <= 122)) {
            System.out.println("is alphabetic");
        } else if (alpha >= 65 && alpha <= 90) {
            System.out.println("is alphabetic");
        } else {
            System.out.println("not alphabetic");
        }
        // choco......
        sc.close();
    }

}
