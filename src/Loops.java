/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
//        printNumbers();

//        printNumbers2();

//        printThruN(15);

//        printEvensThruN(16);

//        sumOneThruTen();

//        sumOneThruN(10);

//        sumOneThru1000(1000);

//        printS(3, "Hola, Mundo!");

//        printS2(3,"Hola, Mundo!");

//        fibonacciPrinter(10);

//        System.out.println(fibonacciSum(10));

//        System.out.println(sumNumbers("7 11"));

        System.out.println(notReplace("This is right"));
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers2() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void printThruN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printEvensThruN(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void sumOneThruTen() {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static void sumOneThruN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static void sumOneThru1000(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static void printS(int n, String s) {
        if (n < 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        }
    }

    public static void printS2(int n, String s) {
        if (n < 0) {
            System.out.print("");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
        }
    }

    public static void fibonacciPrinter(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fibonacci(i);
        }
        return sum;
    }

    /*
    Exercises++
    1. sumNumbers
     */
    public static int sumNumbers(String input) {
        if (input.length() == 0) return 0;
        int sumNumbers = 0;
        String toAdd = "0";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                toAdd += input.charAt(i);
            } else {
                sumNumbers += Integer.parseInt(toAdd);
                toAdd = "0";
            }
        }
        sumNumbers += Integer.parseInt(toAdd);
        return sumNumbers;
    }

    // FIXME: 1/6/17
    public static String notReplace(String input) {
        String newString = input.replace("is", "is not");
        return newString;
    }
}
