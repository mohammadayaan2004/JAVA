class Animal {  
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
