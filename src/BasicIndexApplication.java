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
