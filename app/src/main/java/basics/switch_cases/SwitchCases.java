package basics.switch_cases;

import basics.enums.Colour;

public class SwitchCases {

    public String switchCaseFunction(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };
    }

    public String exploreSwitchCaseExpression(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
    }

    // If you want multiple statements per case, you can use yield to return a
    // value:

    public String multipleNestedSwitchCases(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> {
                System.out.println("It’s Tuesday!"); // side effect and kinda like multi line expressions in Scala
                                                     // pattern matching
                yield "Tuesday"; // must yield a value
            }
            default -> {
                String msg = "Unknown day: " + day;
                yield msg;
            }
        };
    }

    public String processColours(Colour colour) {
        return switch (colour) {
            case Red -> String.format("Blood is %s", colour);
            case Blue -> String.format("Sky is %s", colour);
            case Green -> String.format("Grass is %s", colour);
            default -> "Unknown colour";
        };
    }

    public static void main(String[] args) {

        SwitchCases example = new SwitchCases();

        System.out.println(example.switchCaseFunction(1));
        System.out.println(example.switchCaseFunction(2));
        System.out.println(example.switchCaseFunction(10));

        System.out.println(example.processColours(Colour.Red));
        System.out.println(example.processColours(Colour.Blue));
        System.out.println(example.processColours(Colour.Green));
    }

}
