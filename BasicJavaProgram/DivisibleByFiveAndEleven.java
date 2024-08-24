import java.util.Scanner;

public class DivisibleByFiveAndEleven {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a = sc.nextInt();
        String result = (a % 5 == 0) && (a % 11 == 0) ? "It is divisible by 5 and 11"
                : "It is not divisible by 5 and 11";
        System.out.println(result);
    }

}
