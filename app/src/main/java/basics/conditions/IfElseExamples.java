package basics.conditions;

public class IfElseExamples {

    public String myFunction(int x) {
        if (x > 0) {
            return String.format("x = %d, is greater than 0", x);
        } else if (x == 0) {
            return String.format("x == %d", x);
        } else {
            return String.format("x = %d, is less than 0", x);
        }
    }

    public static void main(String[] args) {

        IfElseExamples example = new IfElseExamples();

        for (int i = -10; i < 10; i++) {
            System.out.println(example.myFunction(i));
        }
    }

}
