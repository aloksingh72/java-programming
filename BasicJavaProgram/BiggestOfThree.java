public class BiggestOfThree {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 9;
        int result = (a>b)? (a>c)? a:c :(b>c)? b:c;
        System.out.println(result);
    }
    
}
