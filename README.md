# 2task2
// Animal.java

public class Animal {

    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common method
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    // Display details
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
