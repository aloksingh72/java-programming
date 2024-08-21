import java.util.Scanner;

class LaptopDriver{

public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of Laptop:-");
    String name = sc.nextLine();
    System.out.println("Enter the operating system:-");
    String os = sc.nextLine();
    System.out.println("Enter the price of laptop:-");
    int price = sc.nextInt();

System.out.println("main method starts here");
// Laptop l1= new Laptop("Asus","windows",40000);
Laptop l1 = new Laptop(name,os,price);
l1.getDetails();

System.out.println("main method ends here");

}

}