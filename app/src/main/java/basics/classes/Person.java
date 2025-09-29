package basics.classes;

public class Person {

    // Fields (attributes, state)
    String name;
    int age;

    // Constructor (called when creating a new Person)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method (behavior)
    public void sayHello() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
