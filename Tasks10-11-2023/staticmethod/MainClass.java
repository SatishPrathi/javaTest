interface MyInterface {
    void regularMethod();

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    static void staticMethod() {
        System.out.println("Static method in the interface");
    }
}

class MyClass implements MyInterface {
    public void regularMethod() {
        System.out.println("Implementing regularMethod");
    }
}

public class MainClass {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.regularMethod();
        myObject.defaultMethod();

        MyInterface.staticMethod();
    }
}
