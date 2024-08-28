public class StaticProgram1 {
    static{
        System.out.println("this is static block-1");
    }
    public static void main(String[] args) {
        System.out.println("this is main block");
    }

    static{
        System.out.println("this  is static block-2");
        int x =45;
        System.out.println("the value of x is "+x);
    }
}
