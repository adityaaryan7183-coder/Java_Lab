// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // Calls Animal's method

        Animal b = new Dog();  // Upcasting
        b.sound();  // Calls Dog's overridden method
    }
}
