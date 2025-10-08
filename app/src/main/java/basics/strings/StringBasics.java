package basics.strings;

public class StringBasics {

    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");

    // No string interpolation but this is as close we can get
    String name = "Alice";
    int age = 25;
    String message = String.format("My name is %s and I'm %d years old.", name, age);

    public static void main(String[] args) {

        StringBasics stringBasics = new StringBasics();

        boolean doesS1equalS2 = stringBasics.s1 == stringBasics.s2;
        boolean doesS1equalS3 = stringBasics.s1 == stringBasics.s3;

        String stringCheck1Message = String.format("Does s1 == s2? - %b", doesS1equalS2);
        String stringCheck2Message = String.format("Does s1 == s3? - %b", doesS1equalS3);

        System.out.println(stringCheck1Message);
        System.out.println(stringCheck2Message); // false — s3 is a new object in the heap

        String s = "hello";

        s.concat(" world");

        System.out.println("Printing out string 's' to see if it concats? - " + s); // Strings are immutable - will
                                                                                    // return "hello" - original
                                                                                    // unchanged

        // we need to reassign to print out a new string

        s = s.concat(" world");
        System.out.println("Reassigned string concat and printing out new string - " + s); // Strings are immutable -
                                                                                           // will return "hello" -
                                                                                           // original unchanged

        // String formating/interpolation
        System.out.println("Practicing interpolation: " + stringBasics.message);

    }
}
