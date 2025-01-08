class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class labQ14{
    public static void main(String[] args) {
        // Reference of type Animal, but objects of different types
        Animal animal;

        // Assigning Dog object to Animal reference
        animal = new Dog();
        animal.sound();  // Calls Dog's sound method

        // Assigning Cat object to Animal reference
        animal = new Cat();
        animal.sound();  // Calls Cat's sound method
    }
}
