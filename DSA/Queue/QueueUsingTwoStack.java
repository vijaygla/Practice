import java.util.*;

public class QueueUsingTwoStack {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // isEmpty()
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // push()
    public void push(int num) {
        s1.push(num);
    }

    // pop()
    public int pop() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // peek()
    public int peek() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public static void main(String[] args) {
        QueueUsingTwoStack q = new QueueUsingTwoStack();
        System.out.println("Is queue empty? " + q.isEmpty()); // true
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("Peek element from q: " + q.peek()); // 1 (just look, don’t remove)
        System.out.println("Remove element from q: " + q.pop()); // 1
        System.out.println("Remove element from q: " + q.pop()); // 2
        System.out.println("Remove element from q: " + q.pop()); // 3
        System.out.println("Is queue empty? " + q.isEmpty()); // true
    }
}
