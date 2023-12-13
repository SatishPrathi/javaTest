abstract class Animal {
    public abstract void makeSound();
    
    public void sleep() {
        System.out.println("Zzzz");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); 
        myDog.sleep();    
        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();     
    }
}
