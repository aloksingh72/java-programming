public class Vehicle {
    String name;
    int price;
    double top_speed;

    Vehicle(){
        // System.out.println("the object is created");
    }
    Vehicle(String name){
        this();
        this.name = name;
    }
    Vehicle(String name,int price){
        this(name);
        this.price = price;
      
    }
    Vehicle(String name,int price,double top_speed){
        this(name,price);
        this.top_speed = top_speed;
       
    }

    public void getDetails(){
        System.out.println("the name of vehicle " + name);
        System.out.println("the price of the vehicle is"+price);
        System.out.println("the top speed of the vehicle is "+top_speed);
    }
    
}
