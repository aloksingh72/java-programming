import java.util.Scanner;

class FruitDriver{

public static void main(String[] args){

@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
System.out.println("Enter the fruit name:- ");
String name = sc.nextLine();
System.out.println("Enter the price of the fruit:- ");
int price = sc.nextInt();
System.out.println("Enter the weight of the fruit:- ");
double weight = sc.nextDouble();


// Fruit f1 = new Fruit("mango",220,63.2 );
Fruit f1 = new Fruit (name,price,weight);
System.out.println("the name is " +f1.name);
f1.getDetails();


}
}