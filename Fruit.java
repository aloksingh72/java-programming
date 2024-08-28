public class Fruit {
    String name;
    int price;
    double weight;


    Fruit(){

    }
    Fruit(String name, int price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    Fruit (Fruit p){
        this.name = p.name;
        this.price = p.price;
        this.weight = p.weight;
    }
    
    public void getDetails(){
        System.out.println("the name is " + name);
        System.out.println("the price is " + price);
        System.out.println("the weight is " + weight);


    }
}
