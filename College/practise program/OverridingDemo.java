class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.run();
    }
}

