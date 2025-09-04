package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BasicArrays {

    // 1) Empty, growable list (most common)
    List<String> names = new ArrayList<>();

    // names.add("Ada");
    // names.add("Grace");

    // 2) With an initial capacity (avoids some resizing)
    List<Integer> nums = new ArrayList<>(100);

    // 3) From existing collection/array
    List<String> copy = new ArrayList<>(names);
    List<Integer> fromArray = new ArrayList<>(Arrays.asList(1, 2, 3)); // fixed-size if you keep the Arrays.asList
                                                                       // result

    // 4) Immutable (Java 9+): cannot add/remove, no nulls
    List<String> imm = List.of("a", "b", "c");

    // 5) Linked list implementation
    List<String> linked = new LinkedList<>();

    // 6) Thread-safe options
    List<String> syncList = Collections.synchronizedList(new ArrayList<>());
    List<String> cow = new java.util.concurrent.CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        BasicArrays basicArrays = new BasicArrays();

        basicArrays.names.add("Ada");
        basicArrays.names.add("Grace");

        System.out.println("\nbasicArrays.names \n" + basicArrays.names);
        System.out.println("\nbasicArrays.nums \n" + basicArrays.nums);
        System.out.println("\nbasicArrays.copy \n" + basicArrays.copy);
        System.out.println("\nbasicArrays.fromArray \n" + basicArrays.fromArray);
        System.out.println("\nbasicArrays.imm \n" + basicArrays.imm);
        System.out.println("\nbasicArrays.linked \n" + basicArrays.linked);
        System.out.println("\nbasicArrays.syncList \n" + basicArrays.syncList);
        System.out.println("\nbasicArrays.cow \n" + basicArrays.cow);
    }

}
