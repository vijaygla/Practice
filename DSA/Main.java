import java.util.*;

public class Main {

    // public static void main(String[] args) {
    // String s1 = "Apple";
    // s1 = "mango";
    // System.out.println(s1);
    // }

    // // String pool example
    // public static void main(String[] args) {
    // String s1 = "Apple";
    // String s2 = new String("Apple");

    // System.out.println(s1 == s2);
    // System.out.println(s1.equals(s2));
    // }

    // // Finally skip example
    // public static void main(String[] args) {
    // try {
    // System.err.println("Try block");
    // System.exit(0);
    // }
    // catch (Exception e) {
    // System.out.println("catch block");
    // }
    // finally {
    // System.err.println("Finally block");
    // }
    // }

    // public static void main(String[] args) {
    // Vector<Object> v = new Vector<>();

    // v.add(100); // Integer
    // v.add("Hello"); // String
    // v.add(true); // Boolean
    // v.add(99.99); // Double

    // System.out.println("Mixed Vector: " + v);
    // }

    // // static block executed before the execution of main method
    // static {
    // try {
    // System.out.println("Static block executed before main method!");
    // Thread.sleep(2000); // 2 seconds pause
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }

    // public static void main(String[] args) {
    // try {
    // System.out.println("Main method started...");
    // Thread.sleep(2000); // 2 seconds pause
    // System.out.println("Main method executed.");
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }

    // public static void main(String[] args) {
    // double a = 3.5;
    // double b = 3.9;
    // System.out.println(Math.round(a)); // Rounds to nearest whole number
    // System.out.println(Math.ceil(b));
    // }

    // public static void main(String[] args) {
    // System.out.print(0.1+0.2 == 0.3); // false
    // }

    // public static void main(String[] args) {
    // System.out.println(~4); // -5
    // System.out.println(~~4); // -4
    // }

    // // CurtainCountFromClothPieces
    // public static int countCotton(int nums[]) {
    // int count = 0;
    // for(int num : nums) {
    // count += num / 12;
    // }
    // return count;
    // }

    // public static void main(String[] args) {
    // int nums[] = { 3, 42, 60, 6, 14 };
    // System.out.println(countCotton(nums));
    // }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C");

        System.out.println(map.get(1));
    }
}
