import java.util.Arrays; 
import java.util.List; 

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenList = list.stream().filter(val -> val % 2 == 0).toList(); // convert to a new list
        evenList.forEach(System.out::println); // print each element
    }
}
/*
 * Explanation:
 * - Arrays.asList(...) creates a fixed-size list backed by the specified array.
 * - list.stream() creates a stream from the list.
 * - filter(val -> val % 2 == 0) keeps only even numbers.
 * - toList() collects the filtered elements into a new list.
 * - evenList.forEach(System.out::println) prints each even number.
 * 
 * Note: The list returned by Arrays.asList is fixed-size. You cannot add or remove elements from it.
 * If you need a modifiable list, use: new ArrayList<>(Arrays.asList(...));
 */
