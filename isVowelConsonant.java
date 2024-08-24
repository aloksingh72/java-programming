import java.util.Scanner;

class isVowelConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        if(alpha == 'A'||
        alpha =='a'||
        alpha =='E'||
        alpha =='e'||
        alpha =='i'||
        alpha =='I'||
        alpha =='O'||
        alpha =='o'||
        alpha =='U'||
        alpha =='u' ){
            System.out.println("it is vowel");

        }
        else{
            System.out.println("it is consonant");
        }
        sc.close();
    }
}