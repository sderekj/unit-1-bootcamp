import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {

        /*
        1. Cool Cats Pt. II
         */
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Garfield"));
        catList.add(new Cat("Catwoman"));
        catList.add(new Cat("Top Cat"));
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Pink Panther"));

        for (Cat cat : catList) {
            System.out.println(cat);
        }

        /*
        2. Most Frequent Element
         */
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(4);
        integerList.add(49);
        integerList.add(49);
        integerList.add(49);

        mostFrequentElement(integerList);

        /*
        3. Pod HashMap
         */
        HashMap<String, Integer> podHashMap = new HashMap<>();
        podHashMap.put("Lily", 22);
        podHashMap.put("Akasha", 23);
        podHashMap.put("Cue", 24);
        podHashMap.put("Eddie", 21);
        podHashMap.put("Jose", 20);
        podHashMap.put("Derek", 25);

        printPod(podHashMap);

        /*
        4. canRentACar
         */
        System.out.println(canRentACar(podHashMap));

        /*
        5. wordsWithoutList
         */
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));

        /*
        6. How many clumps?
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        countClumps(list);

        /*
        7. Sorting sentences
         */
        sortingSentences("The quick brown fox jumps over some lazy dogs.");
    }

    /*
    2. Most Frequent Element

    Bonus Challenge: Change from ArrayList<Integer> to ArrayList<String> and do the same in the HashMap --> HashMap<String, Integer>
     */
    public static void mostFrequentElement(ArrayList<Integer> list) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (elementCount.get(list.get(i)) != null) {
                int count = elementCount.get(list.get(i));
                count++;
                elementCount.put(list.get(i), count);
            } else {
                elementCount.put(list.get(i), 1);
            }
        }
        int max = 1;
        Integer mostFrequent = null;
        for (Integer key : elementCount.keySet()) {
            if (elementCount.get(key) > max) mostFrequent = key;
        }
        System.out.println("Most frequent element is " + mostFrequent + " with " + elementCount.get(mostFrequent) + " occurrences.");
    }

    /*
    3. Pod HashMap
     */
    public static void printPod(HashMap<String, Integer> hm) {
        for (String key : hm.keySet()) {
            System.out.println(key + " is " + hm.get(key) + " years old.");
        }
    }

    /*
    4. canRentACar
     */
    private static boolean canRentACar(HashMap<String, Integer> podHashMap) {
        for (String key : podHashMap.keySet()) {
            if (podHashMap.get(key) > 25) {
                return true;
            }
        }
        return false;
    }

    /*
    5. wordsWithoutList
     */
    public static ArrayList<String> wordsWithoutList(String[] list, int length) {
        ArrayList<String> newList = new ArrayList<>();
        for (String word : list) {
            if (word.length() != length) {
                newList.add(word);
            }
        }
        return newList;
    }

    /*
    6. How many clumps?
     */
    public static int countClumps(ArrayList<Integer> numbers) {
        boolean currentlyOnClump = false;
        int clumpCounter = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == numbers.get(i - 1) && currentlyOnClump == false) {
                currentlyOnClump = true;
                clumpCounter++;
            } else if (numbers.get(i) == numbers.get(i - 1) && currentlyOnClump == true) {
                continue;
            } else {
                currentlyOnClump = false;
            }
        }
        return clumpCounter;
    }

    /*
    7. Sorting sentences
     */
    public static void sortingSentences(String sentence) {
        ArrayList<String> wordList = new ArrayList<>();
        for (String word : sentence.split(" ")) {
            wordList.add(word);
        }
        wordList.sort(String::compareToIgnoreCase);
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
