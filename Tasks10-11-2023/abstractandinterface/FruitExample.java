abstract class Fruit {
    public void wash() {
        System.out.println("Wash the fruit.");
    }

    public abstract void peel();
}

class Apple extends Fruit {
    public void peel() {
        System.out.println("Peel the apple.");
    }
}

interface Peelable {
    void peel();
}

interface Washable {
    void wash();
}

class Orange implements Peelable, Washable {
    public void peel() {
        System.out.println("Peel the orange.");
    }

    public void wash() {
        System.out.println("Wash the orange.");
    }
}

public class FruitExample {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.wash();
        apple.peel();

        Orange orange = new Orange();
        orange.wash();
        orange.peel();
    }
}
