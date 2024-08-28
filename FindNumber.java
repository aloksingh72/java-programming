import java.util.Scanner;

/**
 * FindNumber
 */
public class FindNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:-");
        int n = sc.nextInt();
        int i =1;
        while(i<=n){
            if(i%10 ==7){
                System.out.print(i+" ");
            }
            i++;
        }
        
        sc.close();
    }
}