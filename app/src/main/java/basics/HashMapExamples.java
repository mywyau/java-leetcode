package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();

        wordCount.put("apple", 2);
        wordCount.put("banana", 3);

        System.out.println("how many bananas are there in the wordCount HashMap? " + wordCount.get("banana")); // 5
        System.out.println("does wordCount Map contain the word orange: " + wordCount.containsKey("orange")); // false

        wordCount.remove("apple");
    }
}
