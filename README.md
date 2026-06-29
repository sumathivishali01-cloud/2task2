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
// Dog.java

public class Dog extends Animal {

    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Display details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
// Main11.java

public class Main11 {

    public static void main(String[] args) {

        // Polymorphism
        Animal[] animals = {
            new Dog("Rocky", 4, "Labrador"),
            new Cat("Kitty", 2, "White"),
            new Dog("Bruno", 5, "German Shepherd"),
            new Cat("Lucy", 3, "Black")
        };

        System.out.println("===== Animal Details =====");

        for (Animal animal : animals) {

            animal.displayInfo();
            animal.makeSound();

            System.out.println("--------------------------");
        }
    }
}
