import java.util.Scanner;

public class isDivisbleFiveAndEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 ==0 && num %11 ==0){
            System.out.println("is Divisble By Five And Eleven");
        }
        else{
            System.out.println("is not divisble by five and eleven");
        }
        sc.close();
    }
    
}
