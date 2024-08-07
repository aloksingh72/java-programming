import java.util.Scanner;

class Program3{
    public static void test(){
        System.out.println("this is test method");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String address = sc.nextLine();
        char city = sc.nextLine().charAt(3);
       
        System.out.println("name is:-"+name);
        System.out.println("my address is:-"+address);
        System.out.println( "my city is "+city);

    }
     public static void main(String[] args) {
        System.out.println("hello world");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first program:-");
        int a=sc.nextInt();
        System.out.println("enter the second number:-");
        int b=sc.nextInt();

        int sum = a+b;
        System.out.println("The sum "+a+" and " +b+" is two number"+sum);
        test();
        
    }
}
