package basics.loops;

import java.util.Arrays;

public class LoopExamples {

    public String[] replicateItemsInArray(String[] fruits, int repeat) {

        String[] repeated = new String[fruits.length * repeat];
        int index = 0;

        for (int r = 0; r < repeat; r++) {
            for (String fruit : fruits) {
                repeated[index++] = fruit;
            }
        }
        return repeated;
    }

    public String[] orderedRepeatFruits(String[] fruits, int repeat) {

        String[] repeated = new String[fruits.length * repeat];
        int index = 0;

        for (String fruit : fruits) {
            for (int i = 0; i < repeat; i++) {
                repeated[index++] = fruit;
            }
        }

        return repeated;
    }

    public String repeatThenConcatFruits(String[] fruits, int repeat) {

        StringBuilder result = new StringBuilder();

        for (String fruit : fruits) {
            result.append(fruit.repeat(repeat));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        LoopExamples loopExample = new LoopExamples();

        String[] fruits = { "orange", "apple", "banana", "pear" };

        int repeat = 2; // how many times to repeat the whole array

        System.out.println(Arrays.toString(loopExample.replicateItemsInArray(fruits, repeat)));
        System.out.println(Arrays.toString(loopExample.orderedRepeatFruits(fruits, repeat)));
        System.out.println(loopExample.repeatThenConcatFruits(fruits, repeat));
    }

}
