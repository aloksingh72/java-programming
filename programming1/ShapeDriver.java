public class ShapeDriver {

    public static void main(String[] args) {
        //upcasting
        Shape s1 = new Circle();
    //   System.out.println( new Circle().c); 
        
        Circle c1 = (Circle) s1;
       
         System.out.println(c1.c);
        // c1.
    
    }
    
}
