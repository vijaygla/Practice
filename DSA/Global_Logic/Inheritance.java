public class Inheritance {
    // inheritance is concept in java which allow to make the hierarchy of the class where child class can inherit all the properties of the parent class and also it increase code readablity and make reusable.

    // Multilevel inheritance mean a chain of inheritance where one class inherit the other other class is inherit by another class.
    // multiple inheritance mean one child class inherit many parent class which is not possible in java beacuse java give arrises ambiguity.

    static class A {
        int a;
        void displayA() {
            System.out.println("Value of A: " + a);
        }
    }

    static class B extends A {
        int b;
        void displayB() {
            System.out.println("Value of B: " + b);
        }
    }

    static class C extends B {
        int c;
        void displayC() {
            System.out.println("Value of C: " + c);
        }
    }

    public static void main(String[] args) {
        C objC = new C();
        objC.a = 1;
        objC.b = 2;
        objC.c = 3;
        objC.displayA();
        objC.displayB();
        objC.displayC();
    }
}
