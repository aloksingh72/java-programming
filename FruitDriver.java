public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Mango",220,5.6);
        Fruit f2 = new Fruit("Apple",400,234.5);
        Fruit f3 = new Fruit("grapes",330,56.6);

        // copy contructor
        Fruit f4 = new Fruit(f1);
        f1.getDetails();
        f2.getDetails();
        f3.getDetails();

        
        System.out.println("=================");
        f4.getDetails();
    }
    
}
