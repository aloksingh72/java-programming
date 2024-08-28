import java.util.Scanner;

public class realrootsQuadratic {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the vallue of a:-");
        int a = sc.nextInt();
        System.out.println("Enter the vallue of b:-");
        int b = sc.nextInt();
        System.out.println("Enter the vallue of c:-");
        int c = sc.nextInt();

        double result =  (b*b - 4*a*c);

        if(result >0){
            System.out.println("quadratic function have two distinct roots");
            double realRoots1 =(-b+ Math.sqrt(result))/2*a;
            System.out.println("the 1 roots is: "+realRoots1);
            double realRoots2 = (+b +Math.sqrt(result))/2*a;
            System.out.println(" the 2 roots is: " + realRoots2);


        }
        else if(result == 0){
            double roots = -b/(2.0*a);

            System.out.println("have one reapeated real roots is"+roots);
           
        }
        else{
            System.out.println("has no real roots");
        }

    
        
sc.close();
    }
    
    
}
