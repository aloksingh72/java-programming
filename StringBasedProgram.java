import java.util.Scanner;

class StringBasedProgram {

    public static void printAllCharacter(String s1) {
        int i = 0;
        while (i < s1.length()) {
            System.out.println(s1.charAt(i));
            i++;
        }

    }

    public static void printAllCharacterRev(String s1) {

        int i = s1.length() - 1;
        while (i >= 0) {

            System.out.println(s1.charAt(i));

            i--;
        }

    }

    public static void reverseString(String s1) {
        // method 1
        /*
         * String rev = "";
         * int i = s1.length() - 1;
         * while (i >= 0) {
         * rev = rev + s1.charAt(i);
         * i--;
         * 
         * }
         * System.out.println("the reverse of string is " + rev);
         */
        // method 2

        int i = 0;
        String rev = "";
        while (i < s1.length()) {
            rev = s1.charAt(i) + rev;
            i++;
        }
        System.out.println("the reverse of string is " + rev);

    }
    public static void  checkPlaindromeString(String s1){
        String orgStr = s1;
        int i = 0;
        String rev ="";
        while(i< s1.length()){
            rev = s1.charAt(i) +rev;
            i++;
 
        }
        System.out.println("the rev is " +rev);
        System.out.println(orgStr);
        if(orgStr == rev){
            System.out.println("It is Plaindrome");
        }
        else{
            System.out.println("It is not Plaindrome");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();

        // printAllCharacter(s1);
        // printAllCharacterRev(s1);
        //reverseString(s1);
        checkPlaindromeString(s1);

        sc.close();
    }

}