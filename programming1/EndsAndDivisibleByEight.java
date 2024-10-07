
// Dated ->28/Aug/2024

// import java.util.Scanner;

public class EndsAndDivisibleByEight {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int i =1;
        while(i<=1000){
            if((i%10==8) && (i%8 ==0)){
                System.out.print(i+" ");

            }
            i++;
        }
        
    }
}
