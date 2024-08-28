class Fruit
{
String name;
int price;
double weight;

Fruit(String name,int price,double weight){
this.name = name;
this.price = price;
this.weight = weight;

}
public Fruit(Fruit f1) {
    //TODO Auto-generated constructor stub
}
public void getDetails(){

System.out.println("the name is " +name);
System.out.println("the name is " +price);
System.out.println("the name is " +weight);
}

}