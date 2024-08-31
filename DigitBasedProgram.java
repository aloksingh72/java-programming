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
            if (digit % 2 == 0) {
                System.out.println(digit);
            }
            n = n / 10;

        }

    }

    public static void printOddNumber(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                System.out.println(digit);
            }
            n = n / 10;
        }
    }

    public static void greaterThanFive(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit > 5) {
                System.out.println(digit);
            }
            n = n / 10;
        }

    }

    public static void countNumber(int n) {
        int count = 0;
        while (n > 0) {
            @SuppressWarnings("unused")
            int rem = n % 10;
            count = count + 1;
            n = n / 10;

        }
        System.out.println(count);
    }

    public static void countEvenNumber(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                count = count + 1;
            }
            n = n / 10;

        }
        System.out.println(count);
    }

    public static void countOddnumber(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
                count = count + 1;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

    public static void biggestDigit(int n) {
        int largest = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;

        }
        System.out.println(largest);

    }

    public static void diffBetweenLargestSmallest(int n) {

        int largest = 0;
        int smallest = 9;

        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;

            }
            n = n / 10;

        }
        int diff = largest - smallest;
        System.out.println("the difference is" + diff);
    }

    public static void multEvenNumber(int n) {
        int mul = 1;

        while (n > 0) {
            int digit = n % 10;
            mul = mul * digit;
            n = n / 10;

        }
        if (mul % 2 == 0) {
            System.out.println("It is Even");
        } else {
            System.out.println("It is odd number");
        }

    }

    public static void sumAllDigit(int n) {

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;

        }
        System.out.println(sum);

    }

    public static void sumAllEvenDigit(int n) {

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            n = n / 10;
        }
        System.out.println("the sum of all Even Digit is " + sum);
    }

    public static void factOfEachDigit(int n) {

        while (n > 0) {

            int digit = n % 10;

            int i = 1;
            int fact = 1;
            while (i <= digit) {
                fact = fact * i;

                i++;

            }
            System.out.println("the factorial of " + digit + "is " + fact);

            n = n / 10;

        }

    }

    public static void sumOfFactorial(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;

            int i = 1;
            int fact = 1;
            while (i <= digit) {
                fact = fact * i;
                i++;

            }
            sum = sum + fact;
            n = n / 10;
        }
        System.out.println("the sum of factorial of each digit is " + sum);

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
        // biggestDigit(n);
        // diffBetweenLargestSmallest(n);
        // multEvenNumber(n);
        // sumAllDigit(n);
        // sumAllEvenDigit(n);
        // factOfEachDigit(n);
        sumOfFactorial(n);

        sc.close();

    }

}
