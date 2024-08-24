import java.util.Scanner;

public class CheckAlphabetLowerCase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:-");
        char alpha = sc.next().charAt(0);
    String result = (Character.isLowerCase(alpha))?"is in lower case":"not in lower case";
    System.out.println(result);

    }
    
}
