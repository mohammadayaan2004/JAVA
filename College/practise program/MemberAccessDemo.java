class Parent {
    String name = "Parent";

    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    String name = "Child";

    void show() {
        System.out.println("Name using this: " + this.name);
        System.out.println("Name using super: " + super.name);
        super.display();
    }
}

public class MemberAccessDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
