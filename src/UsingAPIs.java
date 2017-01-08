import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

    public static void main(String args[]) throws FileNotFoundException {


        File aTaleOfTwoCities = new File("/Users/SACC/Desktop/accesscode/unit-1-bootcamp/src/resources/ataleoftwocities.txt");
        HashSet<String> uniqueATaleofTwoCities = uniqueWords(aTaleOfTwoCities);

        File mobyDick = new File("/Users/SACC/Desktop/accesscode/unit-1-bootcamp/src/resources/mobydick.txt");
        HashSet<String> uniqueMobyDick = uniqueWords(mobyDick);


        HashSet<String> intersectionOfNovels = new HashSet<>(uniqueMobyDick);
        intersectionOfNovels.retainAll(uniqueATaleofTwoCities);
        System.out.println("The cardinality of the intersection of words between the two novels is: " + intersectionOfNovels.size());

        HashSet<String> unionOfNovels = new HashSet<>(uniqueMobyDick);
        unionOfNovels.addAll(uniqueATaleofTwoCities);
        System.out.println("The cardinality of the union of words between the two novels is: " + unionOfNovels.size());

        unionIterator(unionOfNovels);
    }

    public static HashSet<String> uniqueWords(File file) throws FileNotFoundException {
        HashSet<String> uniqueWords = new HashSet<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[\\W]", "").toLowerCase();

            if(!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        scanner.close();

        return uniqueWords;
    }

    public static void unionIterator(HashSet<String> set) {
        for (String word : set) {
            System.out.println(word);
        }
    }
}
