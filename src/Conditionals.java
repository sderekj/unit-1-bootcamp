/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {
        /*
        1.
         */
//        System.out.println(isOdd(5));

        /*
        2.
         */
//        System.out.println(isMultipleOfThree(12));

        /*
        3.
         */
//        System.out.println(isOddAndIsMultipleOfThree(27));

        /*
        4.
         */
//        System.out.println(isOddAndIsMultipleOfThree2(27));

        /*
        5.
         */
//        fizzMultipleofThree(21);


        // Look at Person.java from the assessment.
        Person person = new Person("Juan Pablo Miranda Mejia de los Toros");

        /*
        6. Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
         */
        person.setCity("London");
        System.out.println(londonChecker(person));
        person.setCity("Paris");
        System.out.println(londonChecker(person));

        /*
        7. Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
         */
        printName(person);

        /*
        Exercises++
        See below for methods.
         */
    }

    /*
    1. Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
     */
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    /*
    2. Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
     */
    public static boolean isMultipleOfThree(int num) {
        return num % 3 == 0;
    }

    /*
    3. Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
     */
    public static boolean isOddAndIsMultipleOfThree(int num) {
        return num % 3 == 0 && num % 2 != 0;
    }

    /*
    4. Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree in your last solution, don't use it this time. If you did not, write this method building on your last methods.
     */
    public static boolean isOddAndIsMultipleOfThree2(int num) {
        return isOdd(num) && isMultipleOfThree(num);
    }

    /*
    5. Write a method fizzMultipleofThree that takes in an int n and prints "Fizz" if n is a multiple of three, and prints n otherwise.
     */
    public static void fizzMultipleofThree(int num) {
        if (num % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }
    }

    /*
    6. Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
     */
    public static boolean londonChecker(Person person) {
        return person.getCity().equalsIgnoreCase("London");
    }

    /*
    7. Write a method that takes in a Person and prints the name if the person has a name longer than 5 characters, and otherwise prints "Name is too short."
     */
    public static void printName(Person person) {
        if (person.getName().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    //// Exercises++ ////
    /*
    1. Cigar Party
     */
    public static boolean cigarParty(int numOfCigars, boolean isWeeknd) {
        if (numOfCigars >= 40 && isWeeknd) return true;
        if (numOfCigars >= 40 && numOfCigars <= 60) return true;
        return false;
    }

    /*
    2. Caught Speeding
     */
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int firstLimit = 60;
        int secondLimit = 80;
        if (isBirthday) {
            firstLimit += 5;
            secondLimit += 5;
        }
        if (speed <= firstLimit) return 0;
        if (speed > firstLimit && speed <= secondLimit) return 1;
        return 2;
    }

    /*
    3. Alarm Clock
     */
    public static String alarmClock(int day, boolean onVacation) {
        if (onVacation) {
            if (day == 0 || day == 6) {
                return "off";
            }
            return "10:00";
        }
        if (day == 0 || day == 6) return "10:00";
        return "7:00";
    }

    /*
    4. Lottery Ticket
     */
    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && a == c) return 20;
        if (a == b || a == c || b == c) return 10;
        return 0;
    }

    /*
    5. Blackjack
     */
    public static int blackjack(int num1, int num2) {
        if (num1 > 21 && num2 > 21) return 0;
        if (num1 > 21) return num2;
        if (num2 > 21) return num1;
        int num1Abs = Math.abs(21 - num1);
        int num2Abs = Math.abs(21 - num2);
        if (num1Abs <= num2Abs) {
            return num1;
        } else {
            return num2;
        }
    }

    /*
    6. Evenly Spaced
     */
    public static boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) return true;
        if (a == b || a == c || b == c) return false;
        int dif1 = Math.abs(b - a);
        int dif2 = Math.abs(c - a);
        int dif3 = Math.abs(c - b);
        if (dif1 == dif2 || (dif1 == dif3) || (dif2 == dif3)) return true;
        return false;
    }

}
