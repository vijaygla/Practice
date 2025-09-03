/*
 * In Java, an anonymous class is a class without a name that is declared and instantiated at the same time.
It is often used when you need a one-time implementation of an interface or an abstract class.
 */

interface Greeting {
    void sayHello();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Anonymous class implementing Greeting interface
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };

        g.sayHello(); // Call the method
    }
}

