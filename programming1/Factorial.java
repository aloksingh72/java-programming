import java.util.Scanner;

public class Factorial {


public static void getFactorial(int n){
    int i=1;
        int fact =1;
    while(i<=n){
        fact = fact*i;
        i++;
    }
    System.out.println("the factorial is " + fact);

}

    public static void main(String[] args) {
        System.out.println("Enter the Factorial:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        getFactorial(n); 
       
        
        sc.close();   
    }
   
    
}
