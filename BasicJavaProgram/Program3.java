import java.util.Scanner;

class Program3 {
    // public static void test(){
    // System.out.println("this is test method");
    // Scanner sc = new Scanner(System.in);
    // int age= sc.nextInt();
    // String address = sc.nextLine();
    // double weight = sc.nextDouble();
    // // char city = sc.nextLine().charAt(3);

    // System.out.println("name is:-"+age);
    // System.out.println("my address is:-"+address);
    // System.out.println("the weight is "+weight);
    // // System.out.println( "my city is "+city);

    // }
    public static void main(String[] args) {
        System.out.println("hello world");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter first program:-");
        // int a=sc.nextInt();
        // System.out.println("enter the second number:-");
        // int b=sc.nextInt();

        // int sum = a+b;
        // System.out.println("The sum "+a+" and " +b+" is two number"+sum);
        // test();
       
        System.out.println("Enter the age:-");
        int age = sc.nextInt();
         sc.nextLine();

        System.out.println("enter the Name:-");
        String name = sc.nextLine();
        System.out.println("Enter the weight:-");
        double weight = sc.nextDouble();
        sc.nextLine();
         
        System.out.println("enter the address:-");
        String address = sc.nextLine();
        System.out.println("enter the pin:-");
        int pin = sc.nextInt();

   
        System.out.println("Age is " + age);
        System.out.println("the name is " + name);
        System.out.println("the weight is " + weight);
        System.out.println("the address is " + address);
        System.out.println("the pin is " + pin);

    }
}
