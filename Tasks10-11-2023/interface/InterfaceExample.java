interface Animal {
    void makeSound(); 
    void eat(); 
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.makeSound();
        myDog.eat();
    }
}
