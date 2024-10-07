import java.util.Scanner;

public class FactorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factor number:-");
        int n = sc.nextInt();
        int i =1;
        int count =0;
        while(i<n){
            if(n%i == 0){
                System.out.print(i+" ");
                count++;
            }
            i++;

        }
        System.out.println("\n the count is " + count);
        sc.close();
    }
    
}
