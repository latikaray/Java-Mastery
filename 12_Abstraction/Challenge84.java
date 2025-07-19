//Challenge 84 : Abstraction using Interfaces and Abstract Classes
interface Flyable {
    void fly();
}

abstract class Bird implements Flyable {
    public abstract void fly();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class Challenge84 {
    public static void main(String[] args) {
        Flyable eagle = new Eagle();
        eagle.fly();
    }
}

