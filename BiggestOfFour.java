public class BiggestOfFour {
    public static void main(String[] args) {
        int a =3;
        int b = 9;
        int c = 15;
        int d = 8;
        // THe number of ? question mark and colon : are equal otherwise it will we be error .
        int result = (a>b) ? (a>c)? (a>d)? a:d:c :(b>c)?(b>d)? b:d : (c>d)?c:d;
    System.out.println(result); 
    }
}
