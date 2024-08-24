import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        // String result = Character.isLetter(alpha)?"is alphabet":"is not a alphabet";
String result = Character.isAlphabetic(alpha)?" is alphabet":"is not a alphabet";
        System.out.println(result);
    }
    
}
