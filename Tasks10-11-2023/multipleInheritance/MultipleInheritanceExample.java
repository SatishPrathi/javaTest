interface Speakable {
    void speak();
}

interface Moveable {
    void move();
}

class Robot implements Speakable, Moveable {
    public void speak() {
        System.out.println("Robot is speaking");
    }

    public void move() {
        System.out.println("Robot is moving");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Robot myRobot = new Robot();

        myRobot.speak();
        myRobot.move();
    }
}
