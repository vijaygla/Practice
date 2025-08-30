
// Step 1: Define a Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    void sayMessage(String message); // only one abstract method
}

public class LambdaExample {
    public static void main(String[] args) {

        // Step 2: Use Lambda Expression to implement the interface
        MyFunctionalInterface myFunc = (msg) -> {
            System.out.println("Message: " + msg);
        };

        // Step 3: Call the method
        myFunc.sayMessage("Hello from Lambda!");
        myFunc.sayMessage("Java 8 makes this easy!");
    }
}


// functional interface 
// lamda expression
// AnonymousClassExample
// comparable and comparator
// Treeset
// static and final keyword
// NUmber is parent claass of int, float and double
