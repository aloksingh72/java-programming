public class Vehicle {

    String brand_name;
    int price;
    double top_speed;

    Vehicle(String brand_name, int price, double top_speed) {
        this.brand_name = brand_name;
        this.price = price;
        this.top_speed = top_speed;
    }

    public void getDetails() {
        System.out.println("the brand of vehicle is " + brand_name);
        System.out.println("the price is " + price);
        System.out.println("the top speed is " + top_speed);
        

    }

}
