// Final class that cannot be extended
final class FinalClass {
    // Final method that cannot be overridden
    public final void display() {
        System.out.println("This is a final method in a final class.");
    }
}

// Trying to extend a final class will cause a compile-time error
// class SubClass extends FinalClass { } // This will cause an error

class RegularClass {
    // Final method that cannot be overridden
    public final void show() {
        System.out.println("This is a final method in a regular class.");
    }

    public void print() {
        System.out.println("This is a non-final method in a regular class.");
    }
}

class SubClass extends RegularClass {
    // Cannot override the final method show()
    // public void show() { } // This will cause an error

    // Can override the non-final method print()
    @Override
    public void print() {
        System.out.println("This is an overridden method in a subclass.");
    }
}

public class labQ4 {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Output: This is a final method in a final class.

        RegularClass regularClass = new RegularClass();
        regularClass.show(); // Output: This is a final method in a regular class.
        regularClass.print(); // Output: This is a non-final method in a regular class.

        SubClass subClass = new SubClass();
        subClass.show(); // Output: This is a final method in a regular class.
        subClass.print(); // Output: This is an overridden method in a subclass.
    }
}
