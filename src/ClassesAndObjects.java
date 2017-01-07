/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {

        /*
        1. Cool cats
         */
        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catwoman = new Cat("Catwoman");

        garfield.setFavoriteFood("Lasagna");
        pinkPanther.setFavoriteFood("Crepe");
        catwoman.setFavoriteFood("Fish");

        garfield.setAge(20);
        pinkPanther.setAge(30);
        catwoman.setAge(10);

        /*
        2. isOlder
         */
        System.out.println(isOlder(garfield, catwoman));

        /*
        3. Best Friends
         */
        makeBestFriends(garfield, catwoman);

        /*
        4. Kitten
         */
        System.out.println(makeKitten(garfield, catwoman));

        /*
        5. Adoption
         */
        Person joe = new Person("Joe");
        adoption(pinkPanther, joe);
        adoption(catwoman, joe);

        /*
        6. isFree
         */
        System.out.println(isFree(pinkPanther));

        /*
        7. isSibling
         */
        adoption(garfield, joe);
        System.out.println(isSibling(garfield, pinkPanther));
    }

    /*
    2. isOlder
     */
    public static boolean isOlder(Cat cat1, Cat cat2) {
        return cat1.getAge() > cat2.getAge();
    }

    /*
    3. Best Friends
     */
    public static void makeBestFriends(Cat cat1, Cat cat2) {
        cat1.setFavoriteFood("chicken");
        cat2.setFavoriteFood("chicken");
    }

    /*
    4. Kitten
     */
    public static Cat makeKitten(Cat cat1, Cat cat2) {
        Cat kitten = new Cat();
        kitten.setAge(0);
        String kittensName = cat1.getName() + cat2.getName();
        kitten.setName(kittensName);
        return kitten;
    }

    /*
    5. Adoption
     */
    public static void adoption(Cat cat, Person owner) {
        if (cat.getName().equalsIgnoreCase("Catwoman")) {
            System.out.println("Catwoman will never be anyone's pet!");
        } else {
            cat.setOwner(owner);
        }
    }

    /*
    6. isFree
     */
    public static boolean isFree(Cat cat) {
        return cat.getOwner() == null;
    }

    /*
    7. isSibling
     */
    public static boolean isSibling(Cat cat1, Cat cat2) {
        return cat1.getOwner() == cat2.getOwner();
    }
}
