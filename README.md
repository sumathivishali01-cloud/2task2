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
// Cat.java

public class Cat extends Animal {

    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }

    // Display details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}
