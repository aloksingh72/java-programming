import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =2;
        while(i<=n){
            if(i%n ==0){
                System.out.println("it not prime");
            }
            i++;
            System.out.println("it is prime number");

        }
        sc.close();
    }
    
}
