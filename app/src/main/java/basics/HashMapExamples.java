package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    Map<String, Integer> wordCount = new HashMap<>();
    int numberOfBananas;  // class field
    boolean containsOrange; // class field

    public HashMapExamples() { 
        wordCount.put("apple", 2);
        wordCount.put("banana", 3);

        numberOfBananas = wordCount.get("banana");
        containsOrange = wordCount.containsKey("orange");
    }

    public static void main(String[] args) {

        HashMapExamples hashMapExamples = new HashMapExamples();

        // --- Using class fields ---
        System.out.println("wordCount Map: " + hashMapExamples.wordCount);
        System.out.println("Class field -> numberOfBananas: " + hashMapExamples.numberOfBananas);
        System.out.println("Class field -> containsOrange: " + hashMapExamples.containsOrange);

        // --- Using local variables ---
        int localNumberOfBananas = hashMapExamples.wordCount.get("banana");
        boolean localContainsOrange = hashMapExamples.wordCount.containsKey("orange");

        System.out.println("Local variable -> numberOfBananas: " + localNumberOfBananas);
        System.out.println("Local variable -> containsOrange: " + localContainsOrange);

        // Remove key
        hashMapExamples.wordCount.remove("apple");
        System.out.println("Removed apple from wordCount HashMap: " + hashMapExamples.wordCount);
    }
}
