import java.util.*;

public class StackUsingOneQueue {
    
    private Queue<Integer> q = new LinkedList<>(); 

    // isEmpty()
    public boolean isEmpty() {
        return q.isEmpty();
    }

    // push()
    public void push(int num) {
        q.add(num);
    }

    // pop()
    public int pop() {
        int n = q.size();
        if (n == 0) return -1;
        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    // peek()
    public int peek() {
        int n = q.size();
        if (n == 0) return -1;
        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
        int top = q.remove();
        q.add(top);
        return top;
    }

    public static void main(String[] args) {
        StackUsingOneQueue st = new StackUsingOneQueue();

        System.out.println("Check if empty: " + st.isEmpty()); // true
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Peek: " + st.peek()); // 3 (just look, don’t remove)
        System.out.println("Pop: " + st.pop()); // 3
        System.out.println("Pop: " + st.pop()); // 2
        System.out.println("Pop: " + st.pop()); // 1
        System.out.println("Pop: " + st.pop()); // -1 (stack is empty)
    }
}
