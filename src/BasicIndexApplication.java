//Matilda just bought a new book about social impact and as she opens it, she sees the index
//        . Create the BasicIndexApplication class and write the following instructions in its main method:
//        . Create an empty index map connecting Integers for the page numbers and Strings for the book topics and display it.
//        . Create three Integers that represent three different page numbers.
//        . Create three Strings that represent three different book topics.
//        . Put them into the index map from biggest to smallest page number and display it to notice that the entries are automatically arranged.
//        . Display the map keys.
//        . Display the map values.
//        . Create one String representing another book topic.
//        . Put this new topic into the same page number than an existing one and display the map to notice that the previous one is replaced.
//        . Ask if one of the keys is contained in the map and display the answer.
//        . Get one of them by providing its name as an argument and display it.
//        . Display its size.
import java.util.*;
public class BasicIndexApplication {
    public static void main(String[] args) {
        Map<Integer, String> index = new HashMap<>();
        System.out.println(index);
        Integer firstChapter = 56;
        Integer secondChapter = 23;
        Integer thirdChapter = 104;
        String chapterOne = "First chapter";
        String chapterTwo = "Second chapter";
        String chapterThree = "Third chapter";
        index.put(thirdChapter,chapterThree);
        index.put(firstChapter,chapterOne);
        index.put(secondChapter,chapterTwo);
        System.out.println(index);
        TreeSet<Integer> sortedIndex = new TreeSet <Integer>(index.keySet());
        System.out.println(sortedIndex);
        for (Integer i : sortedIndex) {
            System.out.println(i + " Index value is: " + index.get(i));
        }
        System.out.println("Index keys are: " + index.keySet());
        String chapterFour = "Fourth chapter";
        index.put(thirdChapter, chapterFour);
        System.out.println(index);
        System.out.println("Index hast the second chapter: " + index.containsKey(secondChapter));
        System.out.println("The topic in page 104 is " + index.get(104));
        System.out.println("Index map size is: " + index.size());
    }
}
