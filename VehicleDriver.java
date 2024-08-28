public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("BMW");
        Vehicle v3 = new Vehicle("BMW",3909877);
        Vehicle v4 = new Vehicle("BMW",678568,200.56);

        // v1.getDetails();
        v2.getDetails();
        System.out.println("================");
        v3.getDetails();
        System.out.println("===============");
        v4.getDetails();

        
    }
    
}
