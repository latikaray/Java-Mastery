//Challenge 86 : Run time polymorphism with method overriding
class Vehicle {
    public void service() {
        System.out.println("Vehicle is being serviced");
    }
}

public class Car extends Vehicle {
    @Override
    public void service() {
        super.service();
        System.out.println("Car-specific service tasks are done");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.service(); // Executes overridden method
    }
}



