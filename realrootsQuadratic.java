import java.util.Scanner;

public class realrootsQuadratic {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double result =  (b*b - 4*a*c);

        if(result >0){
            System.out.println("quadratic function have two distinct roots");

        }
        else if(result == 0){
            System.out.println("have one reapeated real roots");
        }
        else{
            System.out.println("has no real roots");
        }

    
        
sc.close();
    }
    
    
}
