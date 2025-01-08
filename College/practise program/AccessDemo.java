
class ProtectionDemo {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    void display() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        ProtectionDemo obj = new ProtectionDemo();
        obj.display();
    }
}
