import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        int i =2;
        while(i<n/2){
            if(n%i == 0){
                return false;
                
            }
            i++;
            
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a  number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    //   isPrime(n);
      System.out.println(isPrime(n));

      sc.close();
        }
       
    }
    

