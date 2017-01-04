import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {

        // 1.
        System.out.println(calculateSquare(2));
        System.out.println(calculateSquare(3));
        System.out.println(calculateSquare(4));

        // 2.
        System.out.println(calculateSquareRoot(4));
        System.out.println(calculateSquareRoot(9));
        System.out.println(calculateSquareRoot(16));

        // 3.
        System.out.println(toLowerCase("Hello, World!"));

        // 4.
        System.out.println(isMultiple(5, 101));

        // 5.
        prettyInteger(4);
        prettyInteger(10);

        // 6.
        System.out.println(random(1,100));
    }

    /*
    1. Calculate Square
    Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
     */
    public static int calculateSquare(int num) {
        return num * num;
    }

    /*
    2. Calculate Square Root
    Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
     */
    public static double calculateSquareRoot(int num) {
        return Math.sqrt(num);
//        return Math.pow(num, (1d/2));
    }

    /*
    3. toLowerCase
    Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
     */
    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    /*
    4. isMultiple
    Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first.
     */
    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0;
    }

    /*
    5. Pretty Integer
    Write a method called prettyInteger that takes an int as a parameter and prints the integer surrounded by asterisks with the length of each side equal to the given integer.
     */
    public static void prettyInteger(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.print(" " + num + " ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    /*
    6. Random
    Write a method called random that takes 2 ints as parameters and returns a random int within that range.
     */
    public static int random(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
