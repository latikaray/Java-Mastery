//Challenge 76 - Create a class CarFinal with three final attributes: noOfWheels, model, and engineInLiters.

public class CarFinal {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public CarFinal(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }
}

class Main {
    public static void main(String[] args) {
        CarFinal car = new CarFinal(4, "Hatchback", "1.2L");
        System.out.println("Car Model: " + car.model);
        System.out.println("No. of Wheels: " + car.noOfWheels);
        System.out.println("Engine: " + car.engineInLiters);
    }
}
