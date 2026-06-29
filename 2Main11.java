// Main11.java

public class Main11{

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
