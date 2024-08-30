// Dated ->30/Aug/2024

import java.util.Scanner;

public class DigitBasedProgram {

    public static void printNumber(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }

    public static void printEvenNumber(int n) {
        while (n > 0) {
            
                int digit = n % 10;
                if(digit%2 ==0){
                    System.out.println(digit);
                }
                n = n / 10;
            
            
        }

    }

    public static void printOddNumber(int n) {
        while(n>0){
            int digit = n%10;
            if(digit%2 !=0){
                System.out.println(digit);
            }
            n= n/10;
        }
    }
    public static void greaterThanFive(int n){
        while(n>0){
            int digit = n%10;
            if(digit >5){
                System.out.println(digit);
            }
            n= n/10;
        }


    }
    public static void countNumber(int n){
        int count = 0;
        while(n>0){
            @SuppressWarnings("unused")
            int rem = n%10;
            count = count +1;
            n = n/10;

        }
        System.out.println(count);
    }
    public static void countEvenNumber(int n){
        int count =0;
        while(n>0){
            int rem = n%10;
            if(rem%2 == 0){
                count = count +1;
            }
            n = n/10;
            
        }
        System.out.println(count);
    }

    public static void  countOddnumber(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem%2 !=0){
                count = count +1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
    public static void biggestDigit(int n){
        int largest =0;
        while(n>0){
            int digit = n%10;
            if(digit >largest){
                largest=digit;
            }
            n = n/10;

        }
        System.out.println(largest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // printNumber(n);
        // printEvenNumber(n);
        // printOddNumber(n);
        // greaterThanFive(n);
        // countNumber(n);
        // countEvenNumber(n);
        // countOddnumber(n);
        biggestDigit(n);

        sc.close();

    }

}
