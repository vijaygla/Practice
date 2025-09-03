import java.util.Stack;

public class ValidPranthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char arr[] = s.toCharArray();
        for (char a : arr) {
            if (a == '(') {
                st.push(')');
            } 
            else if (a == '{') {
                st.push('}');
            } 
            else if (a == '[') {
                st.push(']');
            } 
            else if (st.isEmpty() || st.pop() != a) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
}
